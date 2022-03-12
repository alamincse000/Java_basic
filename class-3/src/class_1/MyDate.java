package class_1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        long timeStamp = date.getTime();
        System.out.println(timeStamp);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-YYYY hh:mm:ss aa");
        String timeFormat=simpleDateFormat.format(timeStamp);
        System.out.println(timeFormat);

    }
}
