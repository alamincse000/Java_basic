package Pages;

import java.util.Scanner;

public class SameDoWhile {
    public static void main(String[] args) {

        try {
            int sum = 0;
            char ch;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter number::");
            do {
                int num = input.nextInt();
                sum += num;

                System.out.println(sum);
                System.out.println("Do you want to continue?");
                ch = input.next().charAt(0);
            }
            while (ch != 'q');

        }catch (Exception e){
            System.out.println("Does not valid key ");
        }

    }
}
