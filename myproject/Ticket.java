package myproject;

import java.text.SimpleDateFormat;
import java.io.Serializable;
import java.util.Date;
import java.*;
import java.text.DateFormat;
import java.util.Random;
public class Ticket implements Serializable {

    private  Date today;
    private int ID;

      private Vehicle car;
      private  Customer customer;
      private Driver driver;
    public Ticket(Vehicle car, Customer customer,Driver driver) {
        this.car = car;
        this.customer = customer;
        this.driver=driver;
    }

    public Ticket() {
    }
    
    
    
    
 

    public Date getToday() {
        return today;
    }

    public void setToday(Date today) {
        
        this.today = today;
    }

    public int getID() {
        Random rand=new Random();
        return rand.nextInt(1000);
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Vehicle getCar() {
        return car;
    }

    public void setCar(Vehicle car) {
        this.car = car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }                                                                                                                                                           //issue Ticket
    public double TotalPrice() {
        if(!car.getUseAs().equals("Taxi"))
            return car.getRentValue()*customer.getNumbersOfRentingDays();
        else
            return car.getRentValue()*customer.getNumbersOfRentingDays()+driver.getSalary();
        
    }
    
      
    
    
    
    
    
    
}
