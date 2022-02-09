package myproject;

import java.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Abdelaziz
 */

public class Customer extends Person implements Serializable{

    private int ID;
    private int NumbersOfRentingDays;
    private String BookDate;
    private Vehicle rentedCar;
    private String CustomerMail ;
    private final String CustomerFileName = "Customers.bin";
    public static ArrayList<Customer> Customers = new ArrayList<Customer>();
    
    
    public Customer ()
    {
        this.ID=0;
        this.BookDate="";
    }

    public Customer(int ID, int NumbersOfRentingDays, String BookDate, Vehicle rentedCar, String CustomerMail, String Name, String Gender, String Address, String PhoneNumber) {
        super(Name, Gender, Address, PhoneNumber);
        this.ID = ID;
        this.NumbersOfRentingDays = NumbersOfRentingDays;
        this.BookDate = BookDate;
        this.rentedCar = rentedCar;
        this.CustomerMail = CustomerMail;
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getNumbersOfRentingDays() {
        return NumbersOfRentingDays;
    }

    public void setNumbersOfRentingDays(int NumbersOfRentingDays) {
        this.NumbersOfRentingDays = NumbersOfRentingDays;
    }

    public String getBookDate() {
        return BookDate;
    }

    public void setBookDate(String BookDate) {
        this.BookDate = BookDate;
    }

    public Vehicle getRentedCar() {
        return rentedCar;
    }

    public void setRentedCar(Vehicle rentedCar) {
        this.rentedCar = rentedCar;
    }

    public String getCustomerMail() {
        return CustomerMail;
    }

    public void setCustomerMail(String CustomerMail) {
        this.CustomerMail = CustomerMail;
    }

    public static ArrayList<Customer> getCustomers() {
        return Customers;
    }

    public static void setCustomers(ArrayList<Customer> Customers) {
        Customer.Customers = Customers;
    }


    
    
    
    public boolean commitToFile() {
        return fm.write(CustomerFileName,Customers);
    }
    public void loadFromFile() {
       Customers = (ArrayList<Customer>) fm.read(CustomerFileName);
    }
    
    
    private int getCustomerIndex(int id) {
        for (int i = 0; i < Customers.size(); i++) {
            if (Customers.get(i).getID() == id) {
                return i;
            }
        }

        return -1;
    }

    public boolean AddCustomer() {
        loadFromFile();
        Customers.add(this);
        return commitToFile();
    }
   


    public Customer SearchCustomer(int ID) {
         Customer temp = new Customer();
        loadFromFile();
        int index = getCustomerIndex(ID);
        if (index != -1) {
            return Customers.get(index);
        } else {
            return temp;
        }
    }

    public boolean UpdateCustomer() {
         loadFromFile();
        int index = getCustomerIndex(this.getID());

        if (index != -1) {
            Customers.set(index, this);

            return commitToFile();
        }

        return false;
    }

    public boolean DeleteCustomer(int ID) {
         loadFromFile();
        int index = getCustomerIndex(ID);

        if (index != -1) {
            Customers.remove(index);

            return commitToFile();
        }

        return false;
    }


public ArrayList<Customer> ListCustomer()
{
    loadFromFile();
    return Customers;
    
}





}



