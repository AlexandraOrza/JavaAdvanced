package javaadvanced.oop.compositions;

public class Main {
    public static void main(String[] args) {

        Muzzle muzzle = new Muzzle();
        muzzle.setSize(32);
        muzzle.setType("MenaServ 81 ");

        Dog dog = new Dog();
        dog.putON();
        dog.takeOff();

    }
}
