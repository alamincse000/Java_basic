package class_1;

import java.util.Scanner;

// Find the only even number in array
public class EvenNumberArray {
    public static void main(String[] args) {

        int[] arr = {8, 5, 2, 3, 4, 5, 8, 12, 22, 44, 8, 12};
        for (int i = 0; i <= arr.length; i ++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);

            }

        }
    }
}

