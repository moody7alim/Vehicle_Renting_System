/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

import java.*;
import GUI_Dashboard.login;
import Panels.employee_addcustomer_panel;
import java.io.File;
import java.io.Serializable;
import java.time.Clock;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;

/**
 *
 * @author Abdelaziz
 */

public class MyProject implements Serializable {

    /**
     * @param args the command line arguments
     */


    public static void main(String[] args){
        
        int [] arr={1,2,3};
        System.out.println(arr.length);
        String [] s=new String[3];
        s[0]="mohamed";
        System.out.println(s.length);
        System.out.println(s[0].length());
        
        
//       Employee x = new Employee(); 
//       Employee y = x.SearchEmployee("ahmed");
//       
//  
//        System.out.println( x.SearchEmployee("ahmed").getAddress());
//
//
//        ArrayList<Employee> e=x.ListEmployee();
//        for (Employee i : e)
//        {
//            System.out.println(i.getName());
//        } 


    
//        String projectPath = System.getProperty("user.dir");
//        System.out.println("Project Path: " + projectPath);
//        File currentDir = new File(projectPath); // current directory				
//        checkDirectoryContents(currentDir);
//
//        new login().setVisible(true);
//    }
//
//    public static void checkDirectoryContents(File dir) {
//        File[] files = dir.listFiles();
//        boolean Company = true;
//        boolean Customer = true;
//        boolean Driver = true;
//        boolean Employee = true;
//        boolean Vehicle = true;
//        boolean emailFile = true;
//
//        for (File file : files) {
//
//            if (file.getName().contains("Companies.bin")) {
//                Company = false;
//            } else if (file.getName().contains("Customers.bin")) {
//                Customer = false;
//            } else if (file.getName().contains("Drivers.bin")) {
//                Driver = false;
//            } else if (file.getName().contains("Employees.bin")) {
//                Employee = false;
//            } else if (file.getName().contains("Vehicles.bin")) {
//                Vehicle = false;
//            }else if (file.getName().contains("Email.bin")) {
//                emailFile = false;
//            }
//            
//        } 
//        
//        if (Company) {
//            Company x = new Company();
//            x.commitToFile();
//        }
//
//        if (Customer) {
//            Customer x = new Customer();
//            x.commitToFile();
//        }
//
//        if (Vehicle) {
//            Vehicle x = new Vehicle();
//            x.commitToFile();
//        }
//
//        if (Employee) {
//            Employee x = new Employee();
//            x.commitToFile();
//        }
//
//        if (Driver) {
//            Driver x = new Driver();
//            x.commitToFile();
//        }
//   
//        if (emailFile) {
//            Email x = new Email();
//            x.commitToFile();
//        }
//    
    } 

}
  
