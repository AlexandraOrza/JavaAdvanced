package javaadvanced.oop.concurrency.homework;
import com.sun.org.apache.bcel.internal.generic.FALOAD;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<EmployeeThread> employeeList = new ArrayList<>();

        Employee employee1 = new Employee("Mark");
        Employee employee2 = new Employee("Clark");
        Employee employee3 = new Employee("Mark");
        Employee employee4 = new Employee("Helen");
        Employee employee5 = new Employee("Barry");

        EmployeeThread employeeThread1 = new EmployeeThread(employee1);
        employeeList.add(employeeThread1);
        EmployeeThread employeeThread2 = new EmployeeThread(employee2);
        employeeList.add(employeeThread2);
        EmployeeThread employeeThread3 = new EmployeeThread(employee3);
        employeeList.add(employeeThread3);
        EmployeeThread employeeThread4 = new EmployeeThread(employee4);
        employeeList.add(employeeThread4);
        EmployeeThread employeeThread5 = new EmployeeThread(employee5);
        employeeList.add(employeeThread5);

        for (EmployeeThread element : employeeList){
            element.start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int index = 0;
        while (employeeList.size()> 0 ){
            employeeList.get(0).stopWork();
            employeeList.remove(0);
            Thread.sleep(5000);
        }
        employeeThread1.stopWork();

    }
}




