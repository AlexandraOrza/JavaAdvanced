package javaadvanced.oop.contBancar;

public class ExtendedBankAccount extends BankAccount{
    float annualInterestRate;

    public void addMonthlyInterest(){

        this.balance += this.balance * annualInterestRate / 12;
    }

    public ExtendedBankAccount(float balance, float annualInterestRate){
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
}
