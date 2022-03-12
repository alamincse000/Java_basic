package class_1;

public class SumOfArray {
    public static void main(String[] args) {

        try {
            int[] arr = {12, 20, 3, 5};
            int sum = 0;
            for (int i = 0; i <= arr.length; i++) {
                sum = sum + arr[i];
                System.out.println(sum);
            }

        }catch (Exception e){
            System.out.println(e);
        }

    }
}
