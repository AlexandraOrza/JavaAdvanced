package javaadvanced.oop.compositions;

public class Dog extends Muzzle{
    public void putON() {
        System.out.println("The dog is putting on the " + setType() + " wich has the size of " + setSize());
    }

    private int setSize() {
        return 32;
    }

    private String setType() {
        return "MenaServ 81";
    }

    public void takeOff(){
        System.out.println("The dog is trying to take off the muzzle. ");
    }

}
