package myproject ;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import  java.io.*;
/**
 *
 * @author Abdelaziz
 */
public class Employee extends Person implements   Serializable ,Ilogin{

    private String DateOfJoin;

    private String Qualification;

    private String DateOfBirth;

    private String UserName;

    private String Password;
    
    String EmployeesFile ="Employees.bin";
    
      public static ArrayList<Employee> Employees = new ArrayList<Employee>();

    
    public Employee ()
    {
    }
    
    public Employee(String DateOfJoin, String Qualification, String DateOfBirth, String UserName, String Password) {
        this.DateOfJoin = DateOfJoin;
        this.Qualification = Qualification;
        this.DateOfBirth = DateOfBirth;
        this.UserName = UserName;
        this.Password = Password;
    }


    public String getDateOfJoin() {
        return DateOfJoin;
    }

    public String getQualification() {
        return Qualification;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public String getUserName() {
        return UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setDateOfJoin(String DateOfJoin) {
        this.DateOfJoin = DateOfJoin;
    }

    public void setQualification(String Qualification) {
        this.Qualification = Qualification;
    }

    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

       public boolean commitToFile() {
        return fm.write(EmployeesFile, Employees);
    }

    public void loadFromFile() {
        Employees = (ArrayList<Employee>) fm.read(EmployeesFile);
        
    }
    
    
     /* public void AddCustomer(String name,String address,String gender,String phoneNumber ,int ID ,int NumberOfRentingDays ,Date BookDate,Vehicle Car) {
        Customer  x=new Customer(name,address,gender,phoneNumber,ID,NumberOfRentingDays,BookDate,Car);
         if (x.AddCustomer()) {
            System.out.println( "Added Successfully ...");
        } else {
            System.out.println("Failed to insert ...");
        }
        
    }*/
    


    
  

   /* public void UpdateCustomer(int ID, Customer c) {
        Customer x = new Customer();
        if (x.udpateCustomer(lD, c)) {
            System.out.println(Customer.toString() + "Updated Successfully ..");
        } else {
            System.out.println("Failed to Updated ... ");
        }

    }

     public void SearchCustomer(int id) {
        Customer x = new Customer();
        System.out.println(x.searchCustomer(id));
    }

*/
 /*
    public void ViewCars() {
        Vehicle x = new Vehicle();
        System.out.println(x.listVehicles());
    }

    public void ReturnCar(Vehicle x) {
        
         x.setStatus("Unrented");
             System.out.println("Added Successfully ...");
         
    }
*/
   
    

    /*public void DeleteDriver() {
    }

    public void UpdateDriver() {
    }
*/
    
     private int getEmployee(String UserName) {
     loadFromFile();
        for (int i = 0; i < Employees.size(); i++) {
            if (Employees.get(i).getUserName().equals(UserName)) {
                return i;
            }
        }

        return -1;
    }
    
    public boolean AddEmployee() {
    
        loadFromFile();
        Employees.add(this);
        return commitToFile();
    }

  public boolean DeleteEmployee(String Username) {
        loadFromFile();
        int index = getEmployee(Username);

        if (index != -1) {
            Employees.remove(index);

            return commitToFile();
        }

        return false;
    }

    public boolean UpdateEmployee() {
        loadFromFile();
        int index = getEmployee(this.getUserName());
        if(index != -1)
        { 
            Employees.set(index,this);
            return commitToFile();
        }
        return  false;
        
    }

    public Employee SearchEmployee(String UserName) {
        Employee temp = new Employee();
        int index = getEmployee(UserName);
        if (index != -1) {
            return Employees.get(index);
        } else {
            return temp;
        }
    }
        
        public ArrayList<Employee> ListEmployee() {
        loadFromFile();
        return Employees;
    }

    
   
   @Override
    public boolean login(String userName, String Pass) {
        loadFromFile();
        for (Employee x : Employees) {
            if (userName.equals(x.UserName) && Pass.equals(x.Password)) {
                return true;
            }
        }
        return false;
    }


}





  
