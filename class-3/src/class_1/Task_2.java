package class_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// Parsing date time and get date difference
public class Task_2 {
    public static void main(String[] args) throws ParseException {

        String thatDay = "15/08/2019 01:15:47 PM";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/YYYY hh:mm:ss aa");
        Date date1 = simpleDateFormat.parse(thatDay);
        Date date2 = new Date();

        long d = date2.getTime() - date1.getTime();
        long year = d / (1000l * 60 * 60 * 24 * 365);
        long day = d / (1000 * 60 * 60 * 24) % 365;
        long hour = (d / (1000 * 60 * 60)) % 24;
        long minutes = (d / (1000 * 60)) % 60;
        long second = (d / 1000) % 60;

        System.out.println("Year= " + year);
        System.out.println("Day=" + day);
        System.out.println("Hour= " + hour);
        System.out.println("Minutes= " + minutes);
        System.out.println("Second= " + second);

    }
}
