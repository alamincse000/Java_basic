package class_1;

public class OddNumberArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,7,9,10,77,99};
        for (int i = 0; i<=arr.length;i++){
            if (arr[i]%2 !=0){
                System.out.println(arr[i]);
            }

        }

    }
}
