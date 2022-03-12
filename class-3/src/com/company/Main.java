package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

// Find out today date time using java
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello Java!");
        Date date = new Date();
        System.out.println(date);

        long timeStamp = date.getTime();
        System.out.println(timeStamp);

        SimpleDateFormat simpleDateFormat =new SimpleDateFormat("dd-MM-YYYY hh:mm:ss: aa");
        String myDate =simpleDateFormat.format(timeStamp);
        System.out.println(myDate);


    }
}
