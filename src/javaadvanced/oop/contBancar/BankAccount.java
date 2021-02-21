package javaadvanced.oop.contBancar;

public class BankAccount {
    public float balance;

    public void addMoney(float z){

        this.balance += z;
    }

    public boolean withdrawMoney(float z){

        return this.balance >=z;
    }
    public float getBalance(){

        return balance;
    }
}
