package com.company;

public class Account {
    private long accountNumber;
    private double balanceAmount;

    public Account(long accountNumber, double balanceAmount) {
        this.accountNumber = accountNumber;
        this.balanceAmount = balanceAmount;
    }

    public double getBalanceAmount() {
        return balanceAmount;
    }

    public int withdraw(double amount){
        if(amount>getBalanceAmount())
            return -1;
        else {
            this.balanceAmount = this.balanceAmount - amount;
            return 1;
        }
    }

    public void deposit(double amount){
            this.balanceAmount = this.balanceAmount + amount;
    }
}
