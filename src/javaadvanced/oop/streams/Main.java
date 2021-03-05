package javaadvanced.oop.streams;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.List.*;

public class Main {
    public static void main(String[] args) {

//        List<String> names = Arrays.asList("Elena", "Aris", "Evrika");
//        Stream<String> nameStream = names.stream();
//        System.out.println(nameStream);
//
//
//        List<String> namesCopy = names.stream().collect(Collectors.toList());
//        System.out.println(namesCopy);
//
//        Optional<String> firstName = names.stream().findFirst();
//        if(firstName.isPresent()){
//            System.out.println(firstName.get());
//        }
//        List<String> nameStartingWithA = names.stream()
//                .filter(element -> element.startsWith("A"))
//                .collect(Collectors.toList());
//        System.out.println(nameStartingWithA);
//
//        List<Integer> wordsSizeFinisWithA = names.parallelStream()
//                .filter(element->element.endsWith("a"))
//                .map(String::length)
//                .collect(Collectors.toList());
//        System.out.println(wordsSizeFinisWithA);
//
//        //Ex asta in loc de FOR EACH
//        names.stream().forEach(element-> System.out.println(element));
//
//


//        public enum Gender {
//            MALE, FEMALE
//        }
//
//        List<Person> people = getPeople();
//
//                // Imperative approach ❌
//
//    /*
//    List<Person> females = new ArrayList<>();
//    for (Person person : people) {
//      if (person.getGender().equals(Gender.FEMALE)) {
//        females.add(person);
//      }
//    }
//    females.forEach(System.out::println);
//    */
//
//                // Declarative approach ✅
//
//                // Filter
//                List<Person> females = people.stream()
//                        .filter(person -> person.getGender().equals(Gender.FEMALE))
//                        .collect(Collectors.toList());
//
////    females.forEach(System.out::println);
//
//                // Sort
//                List<Person> sorted = people.stream()
//                        .sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getGender).reversed())
//                        .collect(Collectors.toList());
//
////    sorted.forEach(System.out::println);
//
//                // All match
//                boolean allMatch = people.stream()
//                        .allMatch(person -> person.getAge() > 8);
//
////    System.out.println(allMatch);
//                // Any match
//                boolean anyMatch = people.stream()
//                        .anyMatch(person -> person.getAge() > 121);
//
////    System.out.println(anyMatch);
//                // None match
//                boolean noneMatch = people.stream()
//                        .noneMatch(person -> person.getName().equals("Antonio"));
//
////    System.out.println(noneMatch);
//
//                // Max (*************************************)
//                people.stream()
//                        .max(Comparator.comparing(Person::getAge));
////        .ifPresent(System.out::println);
//
//                // Min (*************************)
//                people.stream()
//                        .min(Comparator.comparing(Person::getAge));
////        .ifPresent(System.out::println);
//
//                // Group (*****************************************)
//
////                Map<Gender, List<Person>> groupByGender = people.stream()
////                        .collect(Collectors.groupingBy(Person::getGender));
//
////    groupByGender.forEach((gender, people1) -> {
////      System.out.println(gender);
////      people1.forEach(System.out::println);
////      System.out.println();
////    });
//
//                Optional<String> oldestFemaleAge = people.stream()
//                        .filter(person -> person.getGender().equals(Gender.FEMALE))
//                        .max(Comparator.comparing(Person::getAge))
//                        .map(Person::getName);
//
//                oldestFemaleAge.ifPresent(System.out::println);
//            }
//
//            private static List<Person> getPeople() {
//                return List.of(
//                        new Person("Antonio", 20, Gender.MALE),
//                        new Person("Alina Smith", 33, Gender.FEMALE),
//                        new Person("Helen White", 57, Gender.FEMALE),
//                        new Person("Alex Boz", 14, Gender.MALE),
//                        new Person("Jamie Goa", 99, Gender.MALE),
//                        new Person("Anna Cook", 7, Gender.FEMALE),
//                        new Person("Zelda Brown", 120, Gender.FEMALE)
//                );
           }

        }


