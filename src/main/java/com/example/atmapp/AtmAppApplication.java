package com.example.atmapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class AtmAppApplication {

    public static void main(String[] args) {
        int balance = 1000 , input,amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ATM");
        System.out.println("balance : " + balance + "  dollars");

        while (balance > 0) {
            System.out.println();
            System.out.println("1-) add balance");
            System.out.println("2-) make it cash");
            System.out.println("3-) ask to see balance");
            System.out.println("4-) exit");
            System.out.println("5-) choose the operation");
            input = sc.nextInt();

            if (input == 1) {
                System.out.println("how much do you want to add to balance?");
                amount = sc.nextInt();
                balance += amount;
            } else if (input == 2) {
                System.out.println("how much cash do you want?");
                amount = sc.nextInt();
                if (amount > balance){
                    System.out.println("insufficient balance");
                }else {
                    balance -= amount;
                }
            } else if (input == 3) {
                System.out.println("current balance : " + balance);
            } else if (input == 4) {
                System.out.println("logging out");
                break;
            }else {
                System.out.println("Unavailable service");

            }
        }
    }

}
