package class_1;

public class Array {
    public static void main(String[] args) {
        String [] fruits ={"Mango","Banana","Apple","Orange"};
        System.out.println(fruits[1]);
        System.out.println(fruits.length);
//        for (int i =0;i<fruits.length;i++){
//
//            System.out.println(fruits[i]);
//        }


//        Foreach using
        for (String fruit:fruits) {
            System.out.println( " I love fruits : " + fruit);

        }
    }
}
