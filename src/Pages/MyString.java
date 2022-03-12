package Pages;

import java.util.Locale;

public class MyString {
    public static void main(String[] args) {
        String string  = "Hello World";
        String string1 = "Something wrong ";
 char ch =string.charAt(4);
        System.out.println(ch);

//        System.out.println(string.indexOf('t'));
//        System.out.println(string.contains(string1));
//        System.out.println(string.equals(string1));
//        System.out.println(string.replace("Something wrong","Something else" ));
//        System.out.println(string.concat(string1));
//       boolean status= string.startsWith("Trnx");
//        System.out.println(status);
//       String[] arr = string.split("\\.");
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr.length);
        System.out.println(string.substring(0,5));
        System.out.println(string.toLowerCase(Locale.ROOT));
        System.out.println(string.toUpperCase(Locale.ROOT));
    }
}
