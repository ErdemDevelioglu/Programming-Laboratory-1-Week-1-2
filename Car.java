
package drivingsystem;


public class Car {
    
    String plateNumber;
    String model;
    double mileage;
    double fuelLevel;
    double tankCapacity;
    
    public Car(String plateNumber , String model , double milage , double fuelLevel , double tankCapacity) {
        this.plateNumber=plateNumber;
        this.model=model;
        this.mileage=mileage;
        this.fuelLevel=fuelLevel;
        this.tankCapacity=tankCapacity;
    }
    
    public void Drive(double km ) {
        
        
        System.out.println("model : "+model);
         System.out.println("Plate : "+ plateNumber);
         System.out.println("mileage :" + mileage);
         System.out.println("Fuel level : "+ fuelLevel);
         System.out.println("Tank Capacity : "+ tankCapacity);
        if(km>=fuelLevel*10) {
            System.out.println("Car was driven succeessfully "+km+" km");
        fuelLevel-=km/10;
        mileage=mileage+km;
        }else {
            System.out.println("Not enough fuel for this drive ");
        }
        
        System.out.println("model : "+model);
         System.out.println("Plate : "+ plateNumber);
         System.out.println("mileage :" + mileage);
         System.out.println("Fuel level : "+ fuelLevel);
         System.out.println("Tank Capacity : "+ tankCapacity);
    }
    
    public void Refuel(double refill) {
        if(refill+fuelLevel>tankCapacity) {
            System.out.println("You tried to refill the tank over its capacity");
            fuelLevel=tankCapacity;
        }else{
            System.out.println("You successfully refilled your tank "+refill+" Liters");
            fuelLevel+=refill;
        }
    }
    
    public void  checkstatus() {
        if(fuelLevel<tankCapacity/10) {
        System.out.println("tank capacity is over %10");
        } else {
                System.out.println("tank capacity is lower than %10 ");
                }
    }
    
}
