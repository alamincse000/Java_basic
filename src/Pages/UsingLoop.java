package Pages;
// write a program to print 1 to 100

public class UsingLoop {
    public static void main(String[] args) {
        for (int i =0 ;i <=100; i++){
            if (i ==5){
                continue;
            }
            System.out.println(i);
        }

    }
}
