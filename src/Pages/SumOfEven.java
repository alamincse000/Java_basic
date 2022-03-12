package Pages;
// Write a program to print only even numbers

public class SumOfEven {
    public static void main(String[] args) {
        int sum =0;
        for (int i = 0; i <=100; i +=2){
            sum += i;
        }
        System.out.println(sum);
    }
}
