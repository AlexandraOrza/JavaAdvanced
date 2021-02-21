package javaadvanced.oop.exceptions.homework;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("Intr un sir");
        String doubleString = "10.5";
        System.out.println(Double.parseDouble(doubleString));
        String doubleString1 = "10.5";
        System.out.println(Double.valueOf(Double.parseDouble(doubleString1)));

 //       try (Scanner scanner = new Scanner(System.in)) {
 //           if (scanner.hasNextInt()) {
 //               int n = scanner.nextInt();
 //               System.out.println("INT " + n);
 //           } else if (scanner.hasNextDouble()) {
//                double n = scanner.nextDouble();
//                System.out.println("DOUBLE " + n);
 //           } else {
//                throw new MyException("Hey! That's not a value! Try once more.");
 //           }
 //       } catch (MyException e) {
 //           System.out.println(e.getMessage());
        }
    }





