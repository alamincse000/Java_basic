package Pages;

import java.util.Scanner;

public class Keyboard {
    public static void main(String[] args) {
        int sum =0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer value ::");
        while (true){
            int num=input.nextInt();
            sum+=num;
            System.out.println(sum);
            if (num == -1){
                break;
            }

        }
    }
}
