
package drivingsystem;


public class DrivingSystem {

 
    public static void main(String[] args) {
        
        Car mycar= new Car("38 US 871","Renault Megane",364.254,22.0,30.0);
        
        mycar.Drive(120.0);
        mycar.Refuel(12.8);
        mycar.checkstatus();
        
          mycar.Drive(270.0);
          mycar.Refuel(27.8);
     mycar.checkstatus();
    }
        
    
}
