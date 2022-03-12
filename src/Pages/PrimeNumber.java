package Pages;

public class PrimeNumber {
    public static void main(String[] args) {
        int num =28,n=3,i,m;
        m= n/2;
         boolean flag =true;
       for (i = 3 ;i<=m;i++){
           if (num % i ==0){
               flag = false;
               break;
           }
        }
       if (flag ==true){
           System.out.println(num + "is a prime number");
       }else {
           System.out.println(num + "is not a prime number");
       }

    }
}
