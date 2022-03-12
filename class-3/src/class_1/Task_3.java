package class_1;

import java.util.concurrent.Callable;

public class Task_3 {
    public static void main(String[] args) {
        Human human =new Human();
        human.canTalk("Rahim");
        sayHello();
        Calculator calculator=new Calculator();
       int sum= calculator.doSum(50,20);
        System.out.println(sum);

    }
    public static void sayHello(){
        System.out.println("Hello Java!");

    }
}
class Human{
    public void canTalk(String anybody){
        System.out.println(anybody + " Can talk");
    }

}
class Calculator{
    public int doSum(int a ,int b){
        return a+b;

    }
}
