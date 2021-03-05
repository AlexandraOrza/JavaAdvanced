package javaadvanced.oop.concurrency.homework;
import java.time.LocalTime;
import java.util.List;


public class EmployeeThread extends Thread{
     private Employee employee;

    public EmployeeThread(Employee employee){
        this.employee = employee;
   }

    public void stopWork(){
        employee.setIfLeaving();
    }

    @Override
    public void run() {

        employee.setIfArrived();
        while (employee.isIfArrived()){
            try{
                System.out.println(employee.getName() + " I am still working " + LocalTime.now() );
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
