package javaadvanced.oop.concurrency;

public class Main {
    public static void main(String[] args) throws InterruptedException {
/*
        Thread myThread = new MyThread();
        myThread.start();

        MySecondThread mySecondThread = new MySecondThread();  // implementam RUNNABLE
        Thread myNewThread = new Thread(mySecondThread);
        myNewThread.start();

        System.out.println("Main thread starts here ");
        Thread.sleep(3000);
        System.out.println("Main thread is still running ");
        Thread.sleep(6000);
        System.out.println("Main thread ends here ");

*/
        Bench myBench= new Bench(1);
        SeatTakerThread seatTaker1 = new SeatTakerThread(myBench,0);
        SeatTakerThread seatTaker2 = new SeatTakerThread(myBench,1);
        seatTaker1.start();
        seatTaker2.start();
    }
}
