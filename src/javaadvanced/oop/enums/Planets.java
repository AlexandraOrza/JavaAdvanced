package javaadvanced.oop.enums;

//Create enum Planets.
//a) Override toString method. It should print relative size of a planet and it’s name.
//E.g. „Huge Jupiter”, „Small Pluto”.
//b) Create distanceFromEarth method.
//c) Verify both methods for multiple planets.


import javax.xml.bind.SchemaOutputResolver;

public enum Planets {
    JUPITER(" huge ", 1000),
    PLUTO(" small ", 600),
    VENUS(" medium ",3000);
    
    private String size;
    private String name;
    private int distance;

    Planets(String size,int distance){
        this.size = size;
        this.distance = distance;

    }
    public String getSize(){
        return size;
    }
    public String getName(){
        return name;
    }

    public void distanceFromEarth(){
        System.out.println(name() + " " + distance);
    }

    @Override
    public String toString() {
        return size + " " + name;
    }
}

