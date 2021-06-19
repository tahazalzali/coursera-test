/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import model.Makeappointment;
import model.Person;
import model.addpatient;
import model.payment;

/**
 *
 * @author Zeinab
 */
public class appcontrol {
     FileAccess fa;
     
     public appcontrol(){
         
         fa=new FileAccess();
     }

  
    
              
    
      
      public void addpatient(int patientid,String name,String bloodtype,String gender,int dateofbirth,int phonenumber,String address,String medicalrecord){
         addpatient i=new addpatient( patientid, name, bloodtype, gender, dateofbirth, phonenumber, address, medicalrecord);
     fa.writeToFile("Patients",i.toString()+"\n");
      
      }
            
          public void addMakeappointment(int appointmentid,int patientid, String name,String doctorname,int phonenumber,int  date ,double time){
            Makeappointment ma=new Makeappointment( appointmentid,patientid,  name, doctorname, phonenumber, date , time);
        fa.writeToFile("Appointments",ma.toString()+"\n");
        
          }
          
          
          
          public void addpayment(int paymentid,int patientid,String name,int date, double amount){
              payment p=new payment ( paymentid,patientid, name, date,  amount);
              fa.writeToFile("Payment",p.toString()+"\n");
          }
          public ArrayList<addpatient>getaddpatientList(){
              return fa.readPaitentInformation();
          }
          public ArrayList<Makeappointment>getMakeappointmentList(){
              return fa.readMakeappointment();
          }
          public ArrayList<payment>getpaymentList(){
              return fa.readpayment();
          }
          public int getaddpatientCount(){
              return fa.readPaitentInformation().size();
          }
          public int getMakeappointmentCount(){
              return fa.readMakeappointment().size();
          }
          public String []getaddpatientNames(){
              int num=this.getaddpatientCount();
              String [] names=new String[num];
              ArrayList<addpatient>allpatients=fa.readPaitentInformation();
              for(int i=0;i<allpatients.size();i++){
                  names[i]=allpatients.get(i).getname();
                  
              }
              return names;
          }
          public String [][] getaddpatientdata() throws IOException{
              int row=this.getaddpatientCount();
              String [][] data=fa.getpatientinfo(row);
              return data;
                      
          }
          
                  
          
          
          
          public String printallpatients(int patientid){
               String str="";
               ArrayList<addpatient>allpatients=fa.readPaitentInformation();
    for(int i = 0; i< allpatients.size();i++){
    str+=allpatients.get(i).toString()+"\n";
    }
    return str;
    }
          
          public String printappointments(){
              String str="";
              ArrayList<Makeappointment>allappointments=fa.readMakeappointment();
    for(int i = 0; i< allappointments.size();i++){
    str+=allappointments.get(i).toString()+"\n";
    }
    return str;
    }
          
          public String printpayment(){
              String str="";
              ArrayList<payment>allpayments=fa.readpayment();
               for(int i = 0; i< allpayments.size();i++){
    str+=allpayments.get(i).toString()+"\n";
    }
    return str;
          }
          
         
          
          
          public void removeaddpatient(String name){
              int index=0;
              ArrayList<addpatient>allpatients=fa.readPaitentInformation();
              for(int i=0;i<allpatients.size();i++){
                  if(allpatients.get(i).getname().equals(name)){
                      index=i;
                  fa.writeToFile("Patient", allpatients.get(i).toString()+ "\n");
              }
              }
              allpatients.remove(index);
              
              fa.resetfile("Patient");
              for(int i=0;i<allpatients.size();i++){
                  fa.writeToFile("Patient", allpatients.get(i).toString()+"\n");
              }
          }
          
          
          
          
           public void removeaMakeappointment(String name){
              int index=0;
              ArrayList<Makeappointment>allappointments=fa.readMakeappointment();
              for(int i=0;i<allappointments.size();i++){
                  fa.writeToFile("Patient",allappointments.get(i).toString()+ "\n");
              }
          }
          
          
          
          public boolean CheckPerson(String username,String passwored){
             boolean p=false;
              
              ArrayList<Person>allpersons=fa.readPerson();
              for(int i=0;i<allpersons.size();i++){
                  if(allpersons.get(i).getusername().equals(username)&&allpersons.get(i).getpasswored().equals(passwored)){
                      p=true;
                  }
              }
                return p;      
                      
                      
          }


    
}