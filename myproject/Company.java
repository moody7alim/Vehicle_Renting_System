package myproject ;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import  java.io.*;
/**
 *
 * @author Abdelaziz
 */
public class Company  implements Serializable{
    
    final String filename = "Companies.bin"; 
    
    public static ArrayList<Company> companies = new ArrayList<Company>();
    
    FileManger fm = new FileManger(); 
    
    private String Brand;

   
    
    
    public Company(String Brand) {
        this.Brand = Brand;
    }

    public Company() {
      
    }
 
    public void loadFromFile ()
    {
        companies = (ArrayList<Company>)(Object)fm.read(filename);
    }
    
    public boolean commitToFile() {
        return fm.write(filename, companies);
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    private int getCompanyBrandIndex(String br) {
        
        for (int i = 0;i<companies.size(); i++) {
            if (companies.get(i).getBrand().equals(br)) {
                return i;
            }
        }

        return -1;
    }
    
    
    public boolean AddCompany() {
        loadFromFile();
        companies.add(this);
        return commitToFile();
    }

    public Company SearchCompany(String br) {
        loadFromFile();
        Company temp = new Company();
        temp.setBrand("NOT FOUND");
        
        int index = getCompanyBrandIndex(br);
        if (index != -1) {
            return companies.get(index);
        } else {
            return temp;
        }
    }

    public boolean DeleteCompany(String br) {
        loadFromFile();
        int index = getCompanyBrandIndex(br);

        if (index != -1) {
            companies.remove(index);

            return commitToFile();
        }

        return false;
    }

    public boolean updateComapany(String oldBrand,Company x) {
        loadFromFile();
        int index = getCompanyBrandIndex(oldBrand);

        if (index != -1) {
            companies.set(index, x);

            return commitToFile();
        }

        return false;
    }
    public boolean isExist(String br)
    {
        loadFromFile();
        for(Company x: companies)
        {
            if(x.getBrand().equals(br))
                return true;
        }
        return false;
    }
    
    
    
    public ArrayList<Company> ListCompanies ()
    {
        loadFromFile();
        return companies;
    }
}
