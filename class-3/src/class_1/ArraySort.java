package class_1;
// Sort numbers in ascending and descending from an array
import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        int count,temp;

        int [] numbers = {100,98,98,78,-90,8,9,1,2,7,10};
        Arrays.sort(numbers);
        for (int i = 0; i <=numbers.length; i++){

            System.out.println(numbers[i]);
        }

    }
}
