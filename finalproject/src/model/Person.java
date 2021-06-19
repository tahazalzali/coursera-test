/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Zeinab
 */
public class Person {
   String passwored;
    String username;
  
    
    public Person(String username,String passwored ){
        this.username=username;
        this.passwored=passwored;
    
    }

    public Person(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getusername(){
        return username;
    }

    public String getpasswored(){
        return passwored;
    }
    public void setusername(String name){
        this.username=name;
    }
    
    
    public void setpasswored(String passwored){
        this.passwored=passwored;
    }
    public String toString(){
        String d="User name : "+username+"\n";
        d+="Passwored: "+passwored;
      
                return d;
                
    }
}
