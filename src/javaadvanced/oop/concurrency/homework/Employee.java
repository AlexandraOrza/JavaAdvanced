package javaadvanced.oop.concurrency.homework;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.concurrent.atomic.AtomicBoolean;


public class Employee {
    private String name;
    private AtomicBoolean ifArrived;

    public Employee(String name) {
        this.name = name;
    }

    public void setIfArrived() {
        this.ifArrived = new AtomicBoolean(true);
        System.out.println(this.name + " I come to work at:  " + LocalTime.now());
    }

    public void setIfLeaving() {
        this.ifArrived.set(false);
        System.out.println(this.name + " I left from work at: " + LocalTime.now());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIfArrived() {
        return ifArrived.get();
    }
}
