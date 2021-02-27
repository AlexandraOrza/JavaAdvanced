package javaadvanced.oop.input.output;
import java.io.Serializable;

public class Person implements Serializable {
    private String firstName;
    private String lasName;

    public Person (String firstName, String lasName){

    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lasName='" + lasName + '\'' +
                '}';
    }
}
