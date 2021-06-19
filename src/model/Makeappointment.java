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
public class Makeappointment  {
     int appointmentid;
     String doctorname;
    int date;
    double  time;
      int phonenumber;
      String name;
      int patientid;
    public Makeappointment(int appointmentid,int patientid, String name,String doctorname,int phonenumber,int  date ,double time) {
        this.appointmentid=appointmentid;
        this.date=date;
        this.doctorname=doctorname;
        this.name=name;
           this.patientid=patientid;
           this.phonenumber=phonenumber;
           this.time=time;
    }

    public Makeappointment(int i, int i0, String string, String string0, int i1, double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public int getappointmentid(){
        return appointmentid;
    }
    public void setappointmentid(int appointmentid){
        this.appointmentid=appointmentid;
    }
    public String getdoctorname(){
        return doctorname;
    }
    public void setdoctorname(String doctorname){
        this.doctorname=doctorname;
    }
    public int getdate(){
        return date;
    }
    public void setdate( int date){
        this.date=date;
    }
    public double gettime(){
        return time;
    }
    public void settime(int time){
        this.time=time;
    }
    public String toString(){
        String ma="Appointment ID: "+appointmentid+"\n";
        ma+="Patient ID: "+patientid+"\n";
        ma+="Name: "+name+"\n";
        ma+="Doctor Name: "+doctorname+"\n";
        ma+="Date: "+date+"\n";
        ma+="Time: "+time;
        return ma;
        
    }
    
}
