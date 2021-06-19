/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Zeinab
 */
public class addpatient {
     int patientid;
    String name;
    String bloodtype;
    String gender;
    int  dateofbirth;
    int phonenumber;
    String address;
    String medicalrecord;

    
    public addpatient(int patientid,String name,String bloodtype,String gender,int  dateofbirth,int phonenumber,String address,String medicalrecord){
        this.patientid=patientid;
        this.name=name;
        this.bloodtype=bloodtype;
        this.gender=gender;
        this.dateofbirth=dateofbirth;
        this.phonenumber=phonenumber;
        this.address=address;
        this.medicalrecord=medicalrecord;
    }

    public addpatient(int i, String string, String string0, String string1, String string2, int parseInt, String string3, String string4, String string5) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getpatientid(){
        return patientid;
    }
    public void setpatientid(int patientid){
        this.patientid=patientid;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
    public String getbloodtype(){
        return bloodtype;
    }
    public void setbloodtype(String bloodtype){
        this.bloodtype=bloodtype;
    }
    public String getgender(){
        return gender;
    }
    public void setgender(String gender){
        if("female".equals(gender)){
            this.gender="female";
        }
            else if ("male".equals(gender)){
                    this.gender="male";
                    }
        }
    public int getdateofbirth(){
        return dateofbirth;
    }
    public void setdateofbirth(int Dateofbirth){
        this.dateofbirth=dateofbirth;
    }
    public int getphonenumber(){
        return phonenumber;
    }
    public void setphonenumber(int phonenumber){
        this.phonenumber=phonenumber;
    }
    public String getaddress(){
        return address;
    }
    public void setaddress(String address){
        this.address=address;
    }
 
    public String getmedicalrecord(){
        return medicalrecord;
    }
    public void setmedicalrecod(String medicalrecord){
        this.medicalrecord=medicalrecord;
    }
    @Override
    public String toString(){
        String i="Patient ID: "+patientid+"\n";
        i+="Name: "+name+"\n";
        i+="Blood type: "+bloodtype+"\n";
        i+="Gender: "+gender+"\n";
        i+="Date of birth: "+dateofbirth+"\n";
        i+="Phone number: "+phonenumber+"\n";
        i+="Adress: "+address+"\n";
        i+="Medical record: "+medicalrecord;
        return i;
    }
}
