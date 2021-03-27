package com.sda;

public class MyCustomThread extends Thread {


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
