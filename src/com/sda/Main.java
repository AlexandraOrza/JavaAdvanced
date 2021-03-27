package com.sda;

import java.io.*;
import java.util.*;

public class Main {


    public static Optional<User> findUserByEmail(String email) {
        // this is for our example
        //1 cautam in baza de date
        //2 returnam userul gasit

        if (userulEinBazaDeDate()) {//daca userul cu aceasta adresa de email exista in baza de date
            return Optional.of(new User("bogdan@judele.com", "iloveyou"));
        } else {
            return Optional.empty();
        }
    }

    private static boolean userulEinBazaDeDate() {
        return true;
    }

    public static void main(String[] args) {

        Person john = new Person();
//        int someMoneyFromJohn = john.getWallet().take(10);
        int someMoneyFromJohn = john.pleaseGiveMeSomeMoney(10);
        System.out.println("am luat de la john " + someMoneyFromJohn);


    }
}
