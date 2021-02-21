package javaadvanced.oop.collections.lists.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> counties = new ArrayList<>();
        counties.add("Brasov");
        counties.add("Maramures");
        counties.add("Cluj");

        System.out.println(counties.indexOf("Cluj"));
        System.out.println(counties.size());
        System.out.println("After remove ");

        System.out.println(counties.remove("Brasov"));
        System.out.println(counties.indexOf("Cluj"));
        System.out.println(counties.size());

        System.out.println(counties);

        for(int i=0; i< counties.size();i++){
            System.out.println(counties.get(i));
        }
        System.out.println("Listare cu FOR CLASIC******************");

        for (String element: counties) {    //FOR EACH
            System.out.println(element);
        }
        System.out.println("Listare cu FOR EACH *******************");
        counties.forEach(System.out::println);

        System.out.println("Listare cu ITERATOR *******************");
        Iterator<String> iterator = counties.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
