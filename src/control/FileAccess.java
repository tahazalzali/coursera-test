/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import model.Makeappointment;
import model.Person;
import model.addpatient;
import model.payment;

/**
 *
 * @author Zeinab
 */
public class FileAccess {
    public void writeToFile(String filename , String str){
       
            try {
               FileWriter fw = new FileWriter(filename+".txt",true);
               fw.write(str);
               fw.close();
            }
            catch (IOException ioe) {}       
    }

         public ArrayList<addpatient>readPaitentInformation() {
            ArrayList<addpatient>allPaitentInformation=new ArrayList();
          
             String line;
             String pinfo[];
                 try {
                      FileInputStream fs=new FileInputStream("PaitentInformation.txt");
                 InputStreamReader ir=new InputStreamReader(fs);
                 BufferedReader in =new BufferedReader(ir);
                     while(in.ready()){
                         line=in.readLine();
                         pinfo=line.split("\t");
                         addpatient ad=new addpatient((Integer.parseInt(pinfo[0])),pinfo[1],pinfo[2],pinfo[3],pinfo[4],Integer.parseInt(pinfo[5]),pinfo[6],pinfo[7],"");
                         allPaitentInformation.add(ad);
                         in.close();
                     }
                 } catch (IOException e) {}
                 
             return allPaitentInformation;
         }
         
         public ArrayList<Makeappointment>readMakeappointment() {
             ArrayList<Makeappointment>allMakeappointment=new ArrayList();
             String line;
             String minfo[];
              try {
                      FileInputStream fs=new FileInputStream("Makeappointment.txt");
                 InputStreamReader ir=new InputStreamReader(fs);
                 BufferedReader in =new BufferedReader(ir);
              while(in.ready()){
                   line=in.readLine();
                    minfo=line.split("\t");
                     Makeappointment ma=new Makeappointment((Integer.parseInt(minfo[0])),(Integer.parseInt(minfo[1])),minfo[2],minfo[3],(Integer.parseInt(minfo[4])),(Double.parseDouble(minfo[5])));
            allMakeappointment.add(ma);
                         in.close();
                     
              
              
              }
               
             
             }catch (IOException e){}
              return allMakeappointment;
             
         }
         
         public ArrayList<Person>readPerson(){
              ArrayList<Person>allpersons=new ArrayList();
                   String line;
             String p[];
                try {
                      FileInputStream fs=new FileInputStream("Person.txt");
                 InputStreamReader ir=new InputStreamReader(fs);
                 BufferedReader in =new BufferedReader(ir);
                     while(in.ready()){
                         line=in.readLine();
                        p=line.split("\t");
                        Person per=new Person (p[0],(p[1]));
                         allpersons.add(per);
                         in.close();
                     }
                 } catch (IOException e) {}
         return allpersons;
                      }
         
              
         public ArrayList<payment>readpayment(){
             ArrayList<payment>allpayment=new ArrayList();
             String line;
             String pyinfo[];
             try {
                      FileInputStream fs=new FileInputStream("payment.txt");
                 InputStreamReader ir=new InputStreamReader(fs);
                 BufferedReader in =new BufferedReader(ir);
                     while(in.ready()){
                         line=in.readLine();
                         pyinfo=line.split("\t");
                         payment py=new payment((Integer.parseInt(pyinfo[0])),(Integer.parseInt(pyinfo[1])),pyinfo[2],pyinfo[3],(Double.parseDouble(pyinfo[4])),"");
                         allpayment.add(py);
                         in.close();
                     }
                 } catch (IOException e) {}
         return allpayment;
             
         }
         
         public String [][] getpatientinfo(int f) throws IOException{
             String data [][]=new String [f][8];
             String pinfo[];
             String line="";
              try{
                 FileInputStream fs=new FileInputStream("PaitentInformation.txt");
                 InputStreamReader ir=new InputStreamReader(fs);
                 BufferedReader in =new BufferedReader(ir);
                 int row=0;
                 while(in.ready()){
                     line=in.readLine();
                     pinfo=line.split("\t");
                     for(int j=0;j<8;j++)
                         System.arraycopy(pinfo, j, data[row], j, 1);
                    
                         row++;
                     }
                     in.close();
                 } catch (IOException ie) {}
         return data;
           
        }
         public String [][] getappoitment(int t) throws IOException{
             String data [][]=new String [t][6];
             String minfo[];
             String line= " ";
              try{
                 FileInputStream fs=new FileInputStream("Makeappointment.txt");
                 InputStreamReader ir=new InputStreamReader(fs);
                 BufferedReader in =new BufferedReader(ir);
                 int row=0;
                 while(in.ready()){
                     line=in.readLine();
                     minfo=line.split("\t");
                     for(int j=0;j<6;j++)
                         System.arraycopy(minfo, j, data[row], j, 1);
                    
                         row++;
                     }
                     in.close();
                 } catch (IOException ie) {}
         return data;    
}
         public String [][] getpaymnt(int z) throws IOException{
             String data [][]=new String [z][5];
             String pynfo[];
             String line="";
              try{
                 FileInputStream fs=new FileInputStream("payment.txt");
                 InputStreamReader ir=new InputStreamReader(fs);
                 BufferedReader in =new BufferedReader(ir);
                 int row=0;
                 while(in.ready()){
                     line=in.readLine();
                     pynfo=line.split("\t");
                     for(int j=0;j<5;j++)
                         System.arraycopy(pynfo, j, data[row], j, 1);
                
                         row++;
                     }
                     in.close();
                 } catch (IOException ie) {}
         return data;
}
         public void resetfile(String filename){
    try{
        FileWriter stdinf=new FileWriter(filename+".txt",false);
        stdinf.close();
    }   
    catch (IOException ioe) {}
}                
}            
        








    

