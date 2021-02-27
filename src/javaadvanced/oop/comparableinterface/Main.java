package javaadvanced.oop.comparableinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(170);

        Person person2 = new Person(189);


        if(person1.compareTo(person2) < 0){
            System.out.println("Person 1 is taller than person2 ");

        }else if (person1.compareTo(person2) == 0){
            System.out.println("Person1 has the same size as person2 ");
        }
        else {
            System.out.println("Person2 is taller than person1 ");
        }

        List<Person> personList = new ArrayList<>();
        personList.add(person2);
        personList.add(person1);
        System.out.println(personList);

        Collections.sort(personList);
        System.out.println(personList);
    }
}
