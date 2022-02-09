package myproject ;
import java.*;
import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author Abdelaziz
 */
public class Vehicle implements Serializable{

    private String CarModel;

    private Company Brand;

    private int Number;

    private int ProductionYear;

    private String UseAs;

    private int SeatCapacity;

    private int EngineCapacity;

    private String Type;

    private String Varient;

    private double RentValue;

    private String Status;

   private int NumberofRentingTimes;
   
   private int TaxiTimes;
   
   private int IndividualTimes;

    public int getNumberofRentingTimes() {
        return NumberofRentingTimes;
    }

    public void setNumberofRentingTimes(int NumberofRentingTimes) {
        this.NumberofRentingTimes = NumberofRentingTimes;
    }

    public int getTaxiTimes() {
        return TaxiTimes;
    }

    public void setTaxiTimes(int TaxiTimes) {
        this.TaxiTimes = TaxiTimes;
    }

    public int getIndividualTimes() {
        return IndividualTimes;
    }

    public void setIndividualTimes(int IndividualTimes) {
        this.IndividualTimes = IndividualTimes;
    }
   

private final String VehicleFile="Vehicles.bin";
FileManger fm=new FileManger();
    
    public static ArrayList<Vehicle> Vehicles = new ArrayList<Vehicle>();
    


    public Vehicle ()
    {
        this.Status = "Unrented" ;
         this.UseAs = "";
         this.CarModel = "";
        this.Brand = new Company("");
        this.UseAs = "";
        this.Type = "";
        this.Varient = "";   
        this.Number= 0 ;
        this.IndividualTimes = 0 ;
        this.TaxiTimes=0;
        this.NumberofRentingTimes = 0;
        this.RentValue =0;
        this.EngineCapacity=0;
        this.SeatCapacity=0;
         this.ProductionYear=0;
        
    }

    public Vehicle(String CarModel, Company Brand, int Number, int ProductionYear, String UseAs, int SeatCapacity, int EngineCapacity, String Type, String Varient, double RentValue, String Status, int NumberofRentingTimes, int TaxiTimes, int IndividualTimes) {
        this.CarModel = CarModel;
        this.Brand = Brand;
        this.Number = Number;
        this.ProductionYear = ProductionYear;
        this.UseAs = UseAs;
        this.SeatCapacity = SeatCapacity;
        this.EngineCapacity = EngineCapacity;
        this.Type = Type;
        this.Varient = Varient;
        this.RentValue = RentValue;
        this.Status = Status;
        this.NumberofRentingTimes = NumberofRentingTimes;
        this.TaxiTimes = TaxiTimes;
        this.IndividualTimes = IndividualTimes;
    }
    
    

    public String getCarModel() {
        return CarModel;
    }

    public Company getBrand() {
        return Brand;
    }

    public int getNumber() {
        return Number;
    }

    public int getProductionYear() {
        return ProductionYear;
    }

    public String getUseAs() {
        return UseAs;
    }

    public int getSeatCapacity() {
        return SeatCapacity;
    }

    public int getEngineCapacity() {
        return EngineCapacity;
    }

    public String getType() {
        return Type;
    }

    public String getVarient() {
        return Varient;
    }

    public double getRentValue() {
        return RentValue;
    }

    public String getStatus() {
        return Status;
    }




    public void setCarModel(String CarModel) {
        this.CarModel = CarModel;
    }

    public void setBrand(Company Brand) {
        
        
        this.Brand = Brand;
    }

    public void setNumber(int Number) {
        this.Number = Number;
    }

    public void setProductionYear(int ProductionYear) {
        this.ProductionYear = ProductionYear;
    }

    public void setUseAs(String UseAs) {
        this.UseAs = UseAs;
    }

    public void setSeatCapacity(int SeatCapacity) {
        this.SeatCapacity = SeatCapacity;
    }

    public void setEngineCapacity(int EngineCapacity) {
        this.EngineCapacity = EngineCapacity;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public void setVarient(String Varient) {
        this.Varient = Varient;
    }

    public void setRentValue(double RentValue) {
        this.RentValue = RentValue;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

 

      
    public ArrayList<Vehicle> viewVehicle(String brand ,String Use,String Status) {
       
        loadFromFile();
            
        ArrayList <Vehicle> SpecifiedVehicles = new ArrayList<Vehicle>();
        
      for(int i=0 ; i<Vehicles.size(); i++)
      { 
          if((Vehicles.get(i).getBrand().getBrand().equals(brand)) && Vehicles.get(i).getUseAs().equals(Use) && Vehicles.get(i).getStatus().equals(Status))
        {
            SpecifiedVehicles.add(Vehicles.get(i));
        }
      }
    
     return  SpecifiedVehicles;
        
    }

    
    
    public boolean AddVehicle() {
         loadFromFile();
        Vehicles.add(this);
        return commitToFile();
    }
   
    public boolean commitToFile() {
           
        return fm.write(VehicleFile,Vehicles);
  
    }

    public void loadFromFile() {
       
        Vehicles = (ArrayList<Vehicle>) fm.read(VehicleFile);
    }
    
    public int GetVehicleIndex (int Number)
    {
      loadFromFile();
      for(int i=0 ; i<Vehicles.size(); i++)
      { 
          if(Vehicles.get(i).getNumber() == Number )
          {  
            return i;
          }
      
      }
       { return -1;
              }
    
    }
    
    
      public boolean DeleteVehicle(int Number) {
      
        loadFromFile();
        int index = GetVehicleIndex(Number);

        if (index != -1) {
            Vehicles.remove(index);
            return commitToFile();
        }

        return false;
    
      }

    public Vehicle SearchVehicle(int Number) {
      
        Vehicle temp = new Vehicle ();
        
        loadFromFile();
        int index = GetVehicleIndex(Number);
        if (index != -1) {
            return Vehicles.get(index);
        } else {
            return temp;
        }
    }
    
        public boolean UpdateVehicle() {
        loadFromFile();
        int index = GetVehicleIndex(this.getNumber());

        if (index != -1) {
            Vehicles.set(index, this);

            return commitToFile();
        }

        return false;
    }
        
     public ArrayList<Vehicle> listVehicles() {
        loadFromFile();
        return Vehicles;
    }
}