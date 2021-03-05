package javaadvanced.oop.concurrency.homework;
import java.time.LocalTime;
import java.util.List;
import java.util.Locale;

public class MyThread extends Thread {

    private final List<Employee> employeeList;


    public MyThread(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public void run() {
        for (int i = 0; i < employeeList.size(); i++) {
            try {
                Thread.sleep(6000);
                System.out.println(employeeList.get(i) +  "  Im still working" + LocalTime.now());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}


