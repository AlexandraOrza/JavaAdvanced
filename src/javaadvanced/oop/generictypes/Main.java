package javaadvanced.oop.generictypes;

public class Main {
    public static void main(String[] args) {
 //        Car car = new Car(400);
 //        GenericBox <Car> carBox = new GenericBox<>(car);

 //       System.out.println(carBox.getItem().getMaxSpeed());


        Car car2 = new Car(400);
        Garaj<Car> garaj = new Garaj<>(car2);
        garaj.repair();
        System.out.println(garaj.getVehicle().getMaxSpeed());

        Garaj<Vehicle> vehicle = new Garaj<>(car2);
        vehicle.repair();
        System.out.println(vehicle.getVehicle().getMaxSpeed());
    }
}
