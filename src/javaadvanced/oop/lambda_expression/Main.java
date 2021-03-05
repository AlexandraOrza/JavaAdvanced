package javaadvanced.oop.lambda_expression;

import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

        Person person = new Person(30);
/*
        //Ex without lambda
        Predicate<Person> adultPersonTest = new AdultPersonTest();
        System.out.println((adultPersonTest.test(person)));

        // Ex with lambda
        Predicate<Person> adultPersonTest2 = person1 -> person1.getAge()> 18;
        System.out.println(adultPersonTest2.test(person));


        //Ex with lambda runnable
        Runnable runnable = () -> System.out.println("running is runnable");
        runnable.run();

        //Lambda expression method ref
        Predicate<Person> adultPersonTest3 = person::isAdultNoParam;
        System.out.println(adultPersonTest3.test(person));

        Predicate<Person> adultPersonTest4 = person::isAdult;
        System.out.println(adultPersonTest4.test(person));
*/

        UnaryOperator<Integer> square = i -> {
            int result = i * i;
            return result;
        };
        System.out.println("Result: " + square.apply(100));
    }
}
