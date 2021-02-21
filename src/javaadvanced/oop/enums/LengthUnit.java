package javaadvanced.oop.enums;

public enum LengthUnit {
    METER(1),
    CENTIMETER(4),
    FOOT(6),
    INCH(8);

    private  double value;

    LengthUnit(double value){     //lengthUnit e CONSTRUCTOR,(double) e PARAMETRU

        this.value = value;       // Prin CONSTRUCTOR dam VALOARE.De aia il cream!!!!!
    }

    public double getValue() {

        return value;
    }
}
