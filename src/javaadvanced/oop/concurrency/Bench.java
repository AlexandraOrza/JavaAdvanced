package javaadvanced.oop.concurrency;

public class Bench {
    Integer availableSeats;

    public Bench(Integer availableSeats){
        this.availableSeats = availableSeats;
    }

    public synchronized void takeASeat(Integer threadIndex) {
        if(availableSeats > 0 ){
            System.out.println("Take a seat from thread " + threadIndex);
            availableSeats--;
            System.out.println("Free seats left: " + availableSeats + "in thread" + threadIndex);
        }else{
            System.out.println("There are no seats available in thread" + threadIndex);
        }
    }

    public void printSynchronizedBlock(Integer threadIndex){
        synchronized(this){
            System.out.println("In synced block in thread " + threadIndex);
        }
        System.out.println("Not synchronized code in thread " + threadIndex);
    }
}
