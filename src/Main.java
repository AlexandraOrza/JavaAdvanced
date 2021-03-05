import javaadvanced.oop.contBancar.ExtendedBankAccount;
import javaadvanced.oop.student.Persoana;
import javaadvanced.oop.inherintence.*;
import javaadvanced.oop.sistemDeCurierat.GenericPackage;
import javaadvanced.oop.student.Student;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        //playWithPolymorphism();
        //playWithInherintence();
        //playWithAbstraction();
        //playWithGeometricFigures();
       // playWithBankAcccount();
       // playWithTime();
       // playWithPersoana();
        //playWithGenericPackage();


    }
    public static void playWithGenericPackage(){
        GenericPackage genericPackage = new GenericPackage();
        genericPackage.setUniqueID("213142341425");
        genericPackage.setPackageName("LaptopAsus");
        genericPackage.setWeight(4.65);
        genericPackage.getCourierName("CArgus");

        System.out.println(genericPackage.checkID((genericPackage.getUniqueID())));
        genericPackage.addItem(4.5);
        System.out.println("Greutatea:" + genericPackage.getWeight());
        System.out.println(genericPackage);


    }
    public static void playWithTime(){

    }
    public static void playWithPersoana(){

        Scanner scanner = new Scanner(System.in);
        Student[] facultate = new Student[2];
        for(int i =0; i< facultate.length;i++)

            System.out.println("Introduceti numele studentului: ");
        String nume = scanner.next();

        System.out.println("Introduceti prenumele studentului: ");
        String prenume = scanner.next();

        System.out.println("Introduceti varsta: ");
        int varsta = scanner.nextInt();

    }

    public static void playWithBankAcccount(){
        ExtendedBankAccount account1 = new ExtendedBankAccount(300,5);
        System.out.println(account1.getBalance());
        account1.addMonthlyInterest();
        System.out.println(account1.getBalance());
    }

    private static void playWithGeometricFigures() {
   //     GeometricFigure figure = new GeometricFigure(); //the class is abstract and can not be instantiated
        GeometricFigure square = new Square(5);
        GeometricFigure circle = new Circle(5);
        GeometricFigure triungle = new Triungle(4,5,7);
        GeometricFigure dreptunchi = new Dreptunghi(2,5);

        System.out.println("Perimetrul patratului este: " + square.calculatePerimeter());
        System.out.println("Perimetrul cercului este: " + circle.calculatePerimeter());
        System.out.println("Perimetrul triunghiului este: " + triungle.calculatePerimeter());
        System.out.println("Perimetrul dreptunchiului este: " + dreptunchi.calculatePerimeter());

    }

    public static void playWithPolymorphism() {
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();
        Cat otherCat = new Cat();

        animal.makeSound();
        dog.makeSound();
        cat.makeSound();

        otherCat.purr();
        otherCat.purr("Angel");           //compile time polimorfism(static) overloading


        System.out.println("1------------------");

        Animal[] arrayOfAnimals = new Animal[3];   //sau
                                                   //    Animal arrayOfAnimals2[] = new Animal[3];
        arrayOfAnimals[0] = animal;
        arrayOfAnimals[1] = dog;
        arrayOfAnimals[2] = cat;

        //for este varianta de for clasic de iterare(parcurgere) a elementelor unui array, pentru doar un element

        for (int i = 0; i < arrayOfAnimals.length; i++) {
            arrayOfAnimals[i].makeSound();
        }

        //sau foreach- este varianta de for enhanced  de iterare(parcurgere) a elementelor unui array   ...pentru fiecare element
        System.out.println("2---------------------");

        for (Animal element : arrayOfAnimals) {
            element.makeSound();                //putem folosi back, return.....in if  run time polymorfism(dinamic)overriding
        }
    }

    private static void playWithInherintence() {

        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        animal.eat();
        dog.eat();
        dog.bark();
        cat.eat();
        cat.purr();
    }

    public static void playWithAbstraction() {
        javaadvanced.oop.advanced.abstraction.Cat cat = new javaadvanced.oop.advanced.abstraction.Cat();     //printeaza adresa din memorie unde se gaseste acel obiect ,daca nu  avem public String toString(){}
        cat.sleep();
        System.out.println(cat);    //cat-variabila de tip obiect
        cat.play();
        System.out.println(cat);
        cat.feed();
        System.out.println(cat);

    }

}
