package com.company;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
//        int balance = 100000,withdraw,deposited;
//        Scanner input = new Scanner(System.in);
//        while (true){
//            System.out.println("Automated teller machine ");
//            System.out.println("choose for 1 withdraw ");
//            System.out.println("Choose for 2 deposited");
//            System.out.println("Choose for 3 check balance");
//            System.out.println("Choose for 4 exit");
//
//            int choice = input.nextInt();
//
//            switch (choice){
//                case 1:
//                    System.out.println("Enter money to the withdraw ");
//                    withdraw= input.nextInt();
//
//                    if (balance>= withdraw){
//                        balance = balance-withdraw;
//                        System.out.println("Please collect money ");
//                    }
//                    else {
//                        System.out.println("insufficient balance");
//                    }
//                    break;
//
//                case 2:
//                    System.out.println("Enter deposited money");
//                    deposited = input.nextInt();
//                    balance = balance + deposited;
//                    System.out.println("Deposited Successfully done");
//                    break;
//                case 3:
//                    System.out.println("Please check for balance ");
//                    System.out.println("Balance = " + balance);
//                    break;
//                case 4:
//                    System.exit(0);
//
//            }
//        }


//         Same code again practice

        int balance = 10000, withdraw, deposited;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Automated teller machine!");
            System.out.println("Choose 1 for withdraw money");
            System.out.println("Choose 2 for deposited money");
            System.out.println("Choose 3 for check balance ");
            System.out.println("Choose 4 for exit ");
            System.out.println("Choose the operation you want to perform ::");

            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter to the withdraw ");
                    withdraw = input.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("please collect money");
                    } else {
                        System.out.println("In sufficient balance");
                    }
                    break;

                case 2:
                    System.out.println("Enter the deposited balance");
                    deposited = input.nextInt();
                    balance = balance + deposited;
                    System.out.println("Successfully deposited done");
                    break;

                case 3:
                    System.out.println("Enter the check balance ");
                    System.out.println("Balance = " + balance);
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}
