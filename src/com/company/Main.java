package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account number:");
        long acNo = sc.nextLong();
        System.out.println("Enter the available amount in the account:");
        double am = sc.nextDouble();
        Account account = new Account(acNo, am);

        System.out.println("Enter the amount to be deposited:");
        account.deposit(sc.nextDouble());
        System.out.println("Available balance is:"+String.format("%.2f", account.getBalanceAmount()));

        System.out.println("Enter the amount to be withdrawn:");
        int c = account.withdraw(sc.nextDouble());
        if(c==-1)
            System.out.println("Insufficient balance");
        System.out.println("Available balance is:"+String.format("%.2f", account.getBalanceAmount()));
    }
}
