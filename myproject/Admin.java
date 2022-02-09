package myproject ;
import java.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdelaziz
 */
public class Admin extends Person implements Serializable,Ilogin{
    private String username;
    private String password;
    public Admin()
    {
    }
    public Admin( String username, String password){
        this.username=username;
        this.password=password;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }
   
   
    @Override
    public boolean login(String userName, String Pass) {

        if (userName.equals("Admin@yahoo.com") && Pass.equals("12345678")) {
            return true;
        }
        return false;

    }
    
  /*  public void AddNewEMployee (Date DataOfJoin, String Qualification, Date DataOfBirth, String username, String password ){
    Employee x=new Employee(DataOfJoin,Qualification,DataOfBirth,username,password);
    if(x.AddEmployee()){
    System.out.println("Added Successfully");
    }
    else{
        System.out.println("faild to insert....");
    }
    }
    
    
    
    public void SearchForEmployee (String username){
    Employee M= new Employee();
    System.out.println(M.SearchEmployee(username));
    }
    public void updateEmployee(Employee e) {
              
       e.UpdateEmployee();
       
    }

    public void deleteEmployee(Employee E) {
        if(E.DeleteEmployee(E.getUserName()))
        {
            System.out.println("Deleted Successfully");
       }
        else System.out.println("Coudln't Delete");
     }
    
    public ArrayList<Employee> ListEmployees(){
      Employee x=new Employee();
      x.loadFromFile();
    return Employee.Employees;
    }
    public String toString() {
        return "I'm Manager : " + username + " " + "password : " + password ;
   
    */
    
 }













