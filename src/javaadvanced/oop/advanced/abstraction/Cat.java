package javaadvanced.oop.advanced.abstraction;

public class Cat {
    //variabilele in java in mom. cand le declaram trebuie sa fie 2 cuvinte:tipul si numele

    private int mood;
    private int energy;
    private int hungry;

    //metodele au si modificator de acces, tip, nume, si parentezele(){}.
    // metoda poate sa aibe si tipul de returnare void, adica nu returneaza nimic.

    private void meow() {

        System.out.println("meow");
    }

    public void sleep() {
        hungry++;
        energy++;             //energy = energy+1
    }
    public void play() {
        mood++;
        energy--;
        meow();
    }
    public void feed() {
        hungry--;
        mood++;
        meow();
    }

    @Override                   //generate+toString
    public String toString() {
        return "Cat{" +
                "mood=" + mood +            //concatenare folosim "+"
                ", energy=" + energy +
                ", hungry=" + hungry +
                '}';
    }
}

