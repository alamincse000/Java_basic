package class_1;

public class MaxMin {
    public static void main(String[] args) {
        int max =0;
        int min =0;
        int [] numbers = {100,32,52,10,2};
        for (int i =0;i<numbers.length;i++){
            if (numbers[0]>numbers[i]){
                max=numbers[i];


            }
        }
        System.out.println(numbers[numbers.length-1]);
        System.out.println(numbers[0]);

    }
}
