package javaadvanced.oop.from.begining;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.print("Java ");           // Am scos "ln" din ""println"" si apar in consola cuv unul dupa altul ca un text!
//        System.out.print("is ");
//        System.out.print("cool ");
//        System.out.println("You \"are\" the one"); //Asa printam ceva in ghilimele in ghilimelele de la un String
//        System.out.println("The file is located on ~\\Desktop\\funnypics ");
//
//
//        Scanner scan = new Scanner(System.in);  //< -- system.in te lasa sa scri tu in consola orice vrei sau orice ceri tu intre ghilimele in String
//        System.out.println("Enter pokemon 1 ");
//        String pokemon1 = scan.nextLine();

//        int a = 20;
//        int b = 13;
//        System.out.println(a + b);
//        System.out.println(a / b);
//        System.out.println(a * b);

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Type what a double is : ");
//        String str = scan.nextLine();
//        int a = 5;
//        float b = 2.5f;
//        long c = 999999999;
//        double d = 599999999999999999999999999999999.4; // "double" e defapt un float mai mare,foarte mare.Incap multe,multe cifre !!!!!!

//        int a = 0;
//        boolean b = (a == 0);    // Boolean e numai TRUE sau False. Aici a rezultat TRUE in consola pt ca a verifict ce am introdus intre (),
//                                // adica A e intr-adevar egal cu 0,pt ca asa am dat valoarea 0 prin int=0 !!!
//                                // Boolean e folosit pt IF statements !!
//        System.out.println(b);
//
//        if (true){
//            System.out.println("We are in the if statement"); // Booleanul printeaza in consola mesajul pt ca are intre paranteze la IF(true) !!!!
//                                                                // IF-ul printeaza DOAR daca ce e intre paranteze e adevarat !! Putem scrie orice intre paranteze si numere si comparatii, etc!!!!
//        }
//
//        boolean passedDoor = true;
//        boolean missedDoor = false;
//        boolean passedAllDoors = false;
//        int doorCount = 0;
//
//        if(passedDoor){
//            System.out.println("We passed the first door ");
//            doorCount = doorCount + 1;
//        }
//        if(passedDoor){
//            System.out.println("We passed the second door ");
//            doorCount = doorCount + 1;
//        }
//        if(passedDoor){
//            System.out.println("We passed the third door ");
//            doorCount = doorCount + 1;
//        }
//        if(doorCount == 3){
//            passedAllDoors = true;
//        }
//        if(passedAllDoors){
//            System.out.println("Congratulations! ");
//        }


        // IF ELSE(****************************************)
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a grade: ");
//        int grade = scan.nextInt();
//
//        if(grade >=9 && grade <= 10){
//            System.out.println("A");
//        }else if(grade >=8 && grade < 9){
//            System.out.println("B");
//        }else if(grade >=7 && grade< 8){
//            System.out.println("C");
//        }else if(grade >=6 && grade <5){
//            System.out.println("D");
//        }else if(grade >=5 && grade<4){
//            System.out.println("E");
//        }else{
//            System.out.println("The number you entered is not in the range! ");
//        }


        // EXPONENTI( un nr la puterea altui nr **********************************************)

//        int a = 5;
//        //System.out.println(5*5*5*5*5*5); Ca sa prescurtam inmultirea folosim MATH.POW. ACesta ne va afisa in consola un nr cu .0 -> 23.0
//        System.out.println(Math.pow(5,6));
//
//        // Ca sa ne afiseze fara .0 punem doua paranteze rotunde in fata lui Math.Pow !!!
//        System.out.println((int)Math.pow(5,6));


        // WHILE LOOP (****************************************************************************************)


//        while (true) {              // Daca while e TRUE ruleaza la infinit
//            System.out.println("A");
//        }

//        int a =0;
//        do{
//            System.out.println("A");
//        }while (a == 0);              //Ruleaza la infinit pt ca a e intr-adevar egal cu 0 !!!!!

//
//        String sentence ="flapkacks are awesome";
//        Scanner scan = new Scanner(sentence);
//        ArrayList<String> words = new ArrayList<String>();
//        while (scan.hasNext()){                        // WHILE afiseaza toate cuvintele in ordine unul dupa altul !!
//            words.add(scan.next());
//        }
//        System.out.println(words);

        // FOR (**************************************************************************)
//
//        for (int i =0; i > 10;i++){
//            System.out.println("I love dogs and cats! ");
//        }
//        int[] grades = {9,5,8,6,2};
//        for (int i=0; i< grades.length;i++){
//            System.out.println(grades[i]);
//        }
//
//        for (int i=0; i<12;i++){
//            System.out.println(i);
//        }

        //CONVERT STRING INTO AN INTEGER (*******************************************************)
        //EX 1
//        String s = "102";
//        System.out.println(Integer.parseInt(s) + 4); //parse.Int face sa adauge string-ul cu cifra 4, altfel ar fi postat in consola mesajul dintre ghilimele 1024
//
//    //EX 2
//        int a = 8;
//        System.out.println(Integer.toString(a) + 1);

        //EX 3
//        String s1 = "age: 30";
//        s= s.replaceAll("",""); //?????????????
//
//        int n = Integer.parseInt(s1);
//        System.out.println(n + 2);


        //TYPE CASTING (***************************************************)

//        int a = (int )2.5; // int-ul asta intre paranteze dupa egal converteste un nr decimal intr-un nr integral !!!!
//        System.out.println(a);   // ex 2.5 -> osa fie in consola afisat 2
//
//
//        // Initialization, declaration, assignment
//
//        String pizza1 = "pineapple"; // initialization ....am initializat stringul dupa egal
//        String pizza2;               // declaration......am declarat numele stringul
//        pizza2 = "bbq";              //assignment........am declarat "valoarea" dupa egal
//

        // SWITCH Case (**************************************)
        // IN LOC DE IF ELSE, IF IF ELSE, IF ELSE


        // Doar ca un exemplu aleatoriu :

//        ArrayList<String> list = new ArrayList<String>();
//        list.add("One book");
//        System.out.println(list.get(0));

        // Null pointer Exception (***********************************************)

        // apare cand e o eroare(Exception) si e ca un container gol, punem programul sa ruleze un nimic, pt ca
        // atunci cand scriem String s= null; e nul, e gol, complet gol.
        // nu putem atribui NULL la int sau double sau etc, dar la string sau scanner putem
        // int i=null; NU O SA RULEZE
        // String a= null; PUTEM ATRIBUI


        // Try-Catch folosim pentru a face sa functioneze un NULL POINTER EXCEPTION(e eroare)(**************************************)

      //Ex 1
//        Scanner scan = new Scanner(System.in);
//        System.out.println("What's your fav number? "); //daca scriu in consola un cuvant in loc de nr atunci apare
//        try{                                                                                            //       |
//            int n = scan.nextInt();                                                                     //       |
//            System.out.println(n);                                                                      //       |
//        }catch (Exception e){                                                                           //       |
//            System.out.println("Sorry, please enter a number: ");//  <-----------------------------------------<-|
//        }

        
        //Ex2
//        try {
//            int[] a = null;
//            System.out.println(a[1]); //rulam acuma progr.si apare "Exception in thread "main" java.lang.NullPointerException"
//            // aici intervine TRY-CATCH. In interiorul try-catch-ului scriem efectiv (NullPointerException)
//        }catch (NullPointerException e){
//            System.out.println("Your array is null");
//        }

//        try {
//            int[] a = {4};
//            System.out.println(a[1]); //rulam acuma progr.si apare "Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException"
//            // aici intervine TRY-CATCH. In interiorul try-catch-ului scriem (ArrayIndexOutOfBoundsException)
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Your index is out of bounds! ");
//        }


        // HASHMAP (*******************************)

//        int a = 5;
//        int b = 6;
//        int c = 10;
//        int d = 45;
//        int e = 88; //etc
//
//        HashMap<String,Integer> happy = new HashMap<String,Integer>();
//        happy.put("a",5);
//        happy.put("b",6);
//        happy.put("c",10);
//        happy.put("d",45);
//        happy.put("e",88);
//
//       // System.out.println(happy);
//
//        //Daca vrem valoarea unui anumit int scriem asa :
//        System.out.println(happy.get("d"));


        // HASHSET

//        HashSet<String> h = new HashSet<String>();
//        h.add("cat");
//        h.add("dog");
//        h.add("lion");
//        h.add("tiger");
//
//        h.remove("dog"); // il scoate pe dog
//        h.clear();          // scoate tot din lista
//        System.out.println(h); // listeaza din Hashset(biblioteca)














    }
    }

