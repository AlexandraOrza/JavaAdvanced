package JavaAdvancedHomework;

import static JavaAdvancedHomework.Employee.average;
import static JavaAdvancedHomework.Employee.largestSalary;

public class Main {
    public static void main(String[] args) {
//	    System.out.println("you rolled a : 6");
//
//	    Random numberCool = new Random();
//	    int x = numberCool.nextInt(6) + 1;
//	    System.out.println("You rolled a: "+ x);
//
//
//	    // variables
//        int num =5;
//        double doubley = 4.6;
//        String name = "Alexandra";
//        System.out.println(num);
//
//    }
//
//    public void findLargestElement(){
//        double [] myArray = {3, 2.5, -8, 11};
//
//        double max = myArray [0];
//       // double max = myArray[1];
//        for (int i=1; i<myArray.length; i++){
//            if (max < myArray[i]){
//                max = myArray[i];
//            }
//        }
//        System.out.println("Max is " + max);

        IntSequence list = new IntSequence();
        list.getList();

     //   (------------------------------------------------------------------)
        Employee ang1 = new Employee("Fiona", 320.0);
        Employee ang2 = new Employee("Sabrina", 475.0);
        Employee ang3 = new Employee("Mary", 532.0);
        Employee ang4 = new Employee("Ivan", 690.0);

        Employee[] angajati = {ang1, ang2, ang3, ang4};
        System.out.println("Media salariilor: " + average(angajati));
        System.out.println("Angajatul cu cel mai mare salariu este: " + largestSalary(angajati));


    }

}
