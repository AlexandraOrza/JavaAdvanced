package javaadvanced.oop.student;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Student student[] = new Student[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            String nume, prenume, facultate;
            int varsta, matricol;

            System.out.println("Nume: ");
            nume = scanner.next();
            System.out.println("Prenume: ");
            prenume = scanner.next();
            System.out.println("Varsta: ");
            varsta = scanner.nextInt();
            System.out.println("Facultate: ");
            facultate = scanner.next();
            System.out.println("Matricol: ");
            matricol = scanner.nextInt();
            student[i] = new Student(nume, prenume, varsta, facultate, matricol);
        }
        int contor = 0;
        for (int i = 0; i < 3; i++) {
            String prenume = student[i].getPrenume();
            if (prenume.compareTo("Ion") == 0)
                contor++;
        }
        System.out.println(contor);
    }
}
