package javaadvanced.oop.generictypes;

public class Car extends Vehicle{

    private Integer maxSpeed;

    public Car(Integer maxSpeed) { // CONSTRUCTOR
        this.maxSpeed = maxSpeed;
    }
    public Integer getMaxSpeed(){
        return maxSpeed;
}
   public void setMaxSpeed(Integer maxSpeed){
        this.maxSpeed = maxSpeed;
   }

    @Override
    public void repair() {
        System.out.println("The car is repaired ");
    }
}
