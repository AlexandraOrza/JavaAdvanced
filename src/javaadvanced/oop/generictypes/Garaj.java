package javaadvanced.oop.generictypes;

public class Garaj <T extends Vehicle> {
   private T vehicle;                  //<- FIELD

    public Garaj(T vehicle){           /// CONSTRUCTOR
        this.vehicle = vehicle;
    }
    public void repair(){
        vehicle.setMaxSpeed(vehicle.getMaxSpeed() + 20);
    }

    public T getVehicle() {
        return vehicle;
    }
}
