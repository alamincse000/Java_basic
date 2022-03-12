package Pages;

import java.util.Scanner;
//Write a program to sum of numbers which only divisible by 5 from 1 to 100
public class DivisibleNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer number::");

        int n = input.nextInt();
        for (int i = 0; i <= n; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }


        }
    }
}
