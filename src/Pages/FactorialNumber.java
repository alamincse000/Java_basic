package Pages;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
//        int fact =1,n =5,i;
//        for (i = 1 ; i<=n;i++){
//            fact = fact*i;
//        }
//        System.out.println("Fact number of  " + n + " is " + fact);
int fact=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter factorial number :: ");

        int n =input.nextInt();
        for (int i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println("Factorial number " + n + " is " + fact);

    }
}
