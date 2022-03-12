package Pages;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
//
//        for ( int i =0;i <=10; i++){
//
//            System.out.println(i*9);
//        }

        int mul;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter multiple table ::");
        int n = input.nextInt();
        for (int i = 1; i <=n; i++) {
            mul = i * n;
            System.out.println(mul);
        }
    }
}
