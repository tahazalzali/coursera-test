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
public class payment {
     
    int paymentid;
            int patientid;
    String name;
  int date;
    double amount;
    
    public payment ( int paymentid,int patientid,String name,int  date, double amount){
        this.patientid=patientid;
        this.name=name;
        this.date=date;
        this.amount=amount;
        this.paymentid=paymentid;
    }

    public payment(int i, String string, String string0, double d, String string1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public payment(int i, int i0, String string, String string0, double d, String string1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    public int getpaymentid(){
        return paymentid;
    }
    public void sepaymentid(int paymentid){
        this.paymentid=paymentid;
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
    public int getdate()
    {
        return date;
    }    
    public void setdate(int  date){
        this.date=date;
    }
    public double getamount(){
        return amount;
    }
    public void setamount(double amount){
        this.amount=amount;
    }
    public String toString(){
        String p="Payment ID: "+paymentid+"\n";
        p+="Patient ID: "+patientid+"\n";
        p+="Name: "+name+"\n";
        p+="Date: "+date+"\n";
        p+="Amount: "+amount;
        return p;
    }
}
