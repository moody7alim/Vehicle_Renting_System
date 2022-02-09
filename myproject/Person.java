package myproject;

import java.io.Serializable;
import java.*;
public abstract class Person implements Serializable{

    
  
    
    private String Name;

    private String Gender;

    private String Address;

    private String PhoneNumber;
    
    FileManger fm=new FileManger();

    public Person(String Name, String Gender, String Address, String PhoneNumber) {
        this.Name = Name;
        this.Gender = Gender;
        this.Address = Address;
        this.PhoneNumber = PhoneNumber;
    }
    
 public Person()
 {
 }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public FileManger getFm() {
        return fm;
    }

    public void setFm(FileManger fm) {
        this.fm = fm;
    }

}