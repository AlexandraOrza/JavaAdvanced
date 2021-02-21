package javaadvanced.oop.enums;

public class Main {
    public static void main(String[] args) {

        for (Planets planets : Planets.values()) {
           // System.out.println( planets.getSize()+ planets.name());

            System.out.println(planets);
           // System.out.println(planets.JUPITER.distanceFromEarth());
            Planets.JUPITER.distanceFromEarth();
        }



      /*  LengthUnit lengthUnit = LengthUnit.CENTIMETER;
        System.out.println(lengthUnit + " has value " + lengthUnit.getValue());
        lengthUnit = lengthUnit.INCH;

        switch(lengthUnit){
            case CENTIMETER:
                System.out.println("We have centimeters");
                break;
            case METER:
                System.out.println("We have meters");
                break;
            case FOOT:
                System.out.println("We have foots");
                break;
            case INCH:
                System.out.println("We have inches");
                break;

        }
        System.out.println("*****************************");
        for (LengthUnit unit: LengthUnit.values()) {  //Am folosit for each !!!!
            System.out.println(unit);
        }

        System.out.println(lengthUnit.name());
    }

       */
    }
}
