package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        Car car = new Car();
//        Car car1 = new Car();
//        car.Brand = "Toyta";
//        car.Model = "BMW";
//
//        car1.Model = "Pajaro";
//        car1.Brand = "Royel";
//
//        System.out.println("Brand " + car.Brand);
//        System.out.println("Model " + car.Model);
//
//        System.out.println("Brand " + car1.Brand);
//        System.out.println("Model " + car1.Model);
//
//        System.out.println(car.Model + " has " + car.wheel + " Wheel ");
//        System.out.println(car1.Model + " has " + car1.Model + " Wheel ");
//        purchase(car.Brand, car1.Model);
//
//    }
//
//    public static void purchase(String Brand, String Model) {
//        String name = "Mr. Alamin Mondol";
//
//        System.out.println(name + " want buy a  " + Brand + " " + Model + " car ");
//        System.out.println("let\\'s go ");
//                  //        Type casting Example
//        int a = 3;
//        double b = 6.44;
//        System.out.println(Math.max(a,b));
//        System.out.println(Math.min(a,b));
//        System.out.println(Math.sqrt(a));
//        System.out.println(Math.pow(a,b));
//        System.out.println(Math.abs(b));
//        System.out.println(Math.floor(b));
//        System.out.println(Math.ceil(b));
//        System.out.println(Math.random());
//        System.out.println(Math.round(b));
//        System.out.println(Math.ceil(b));
//        System.out.println(generateRandom(10, 1000));
//
//    }
//    public static int generateRandom(int max, int min) {
//        double rand = Math.ceil(Math.random() * (max - min) + min);
//        System.out.println((int) rand);
//        return (int) rand;


//        user input example

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter input value :");
//        int a = input.nextInt();
//        System.out.println("Enter double value :");
//        double b = input.nextDouble();
//        System.out.println("Enter String value :");
//        String c = input.next();
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);

//        try {
//            Scanner input = new Scanner(System.in);
//            System.out.println("Enter value ::");
//            int num1 = input.nextInt();
//            int num2 = input.nextInt();
//            int num = num1 - num2;
//            System.out.println(num);
//
//        } catch (Exception e) {
//            System.out.println("Please enter correct data");
//        }

//       1.Write a program to get a number from the user and print whether it is positive or negative
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter input value ::");
//        int n = input.nextInt();
//
//        if (n > 0) {
//            System.out.println("positive ");
//
//        }else {
//            System.out.println("Negative");
//        }


//        2.Take three numbers from the user and print the greatest number

//            Scanner number = new Scanner(System.in);
//            System.out.println("Enter a greater number::");
//            int num = number.nextInt();
//            if (num >= 100) {
//                System.out.println("Highest value");
//            } else if (num > 85) {
//                System.out.println("2nd highest value ");
//
//            } else {
//                System.out.println("3rd highest value");
//            }

//        Write a program that takes a year from user and print whether that year is a leap year or not
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Leap year value::");
//        int year = sc.nextInt();
//
//
//        if (((year % 4 == 0 ) && (year % 100!= 0)) ||(year % 400==0)){
//            System.out.println("Specification year is leap year ");
//        }
//        else {
//            System.out.println("Speciation year is not leap year ");
//        }


//        Write a program to check if inputted letter is small or capital


//        try {
//            Scanner input = new Scanner(System.in);
//            System.out.println("Enter Uppercase or lowercase value:: ");
//            char ch = input.next().charAt(0);
//            if (ch >= 'A' && ch <= 'Z'){
//                System.out.println("Capital letter");
//            }else if (ch >= 'a' && ch<= 'z'){
//                System.out.println("Small letter");
//            }else {
//                System.out.println("Not a small or capital letter");
//            }
//        }catch(Exception e){
//            System.out.println(e);
//
//        }


        // java program to calculate passing Divisions..
//
//try {
//
//    int m, e, art, s, comp, total, per;
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter marks out of 100");
//    System.out.println("Enter math marks =");
//    m = sc.nextInt();
//    System.out.println("Enter english marks =");
//    e = sc.nextInt();
//    System.out.println("Enter arts marks =");
//    art = sc.nextInt();
//    System.out.println("Enter Science marks =");
//    s = sc.nextInt();
//    System.out.println("Enter computer marks =");
//    comp = sc.nextInt();
//    total = m + e + s + art + comp;
//    System.out.println("Total marks out of 500=" + total);
//    per = total / 5;
//    System.out.println("Percents of marks ="+ per);
//    if (per < 33){
//        System.out.println("Fail");
//    }
//    else if (per >= 33 && per < 45){
//        System.out.println("Third division");
//    }
//    else if (per > 45 && per < 60){
//        System.out.println("Second division");
//
//    }else if(per >= 60 && per < 80){
//        System.out.println("First division");
//    }
//    else {
//        System.out.println("Star Marks ");
//    }
//
//
//}catch (Exception e){
//    System.out.println(e);
//
//}


//   Write a program to check if the provided user credentials are valid during login

//        String userName = "Alamin";
//        String password = "12345";
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("enter user name ::");
//        String username = sc.next();
//        System.out.println("Enter password ");
//        String Password = sc.next();
//
//        if (username.equals(userName) && password.equals(Password)) {
//            System.out.println("Accept granted");
//        } else {
//            System.out.println("Accept not granted");
//        }

//        Using switch case statements

//           int age = 16;
//        switch (age){
//            case 16:
//                System.out.println("You are under 18");
//                break;
//            case 18:
//                System.out.println("You are eligible 18");
//                break;
//            case 65:
//                System.out.println("You are senior citizen");
//                break;
//            default:
//                System.out.println("please give the valid age");
//        }


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter age ::");
//        int age1 = sc.nextInt();
//        if (age1>18){
//            System.out.println("you are voter ");
//        }
//        else if  (age1 <18){
//            System.out.println("ÿoe are a junior voter in this village ");
//        }
//        else {
//            System.out.println("please give right age");
//        }

    }

}







