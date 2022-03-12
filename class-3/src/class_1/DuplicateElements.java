package class_1;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 9, 8, 3, 2, 1, 7, 2, 9};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println(numbers[j]);
                }
            }
        }

    }
}
