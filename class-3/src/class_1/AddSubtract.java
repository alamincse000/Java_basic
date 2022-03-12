package class_1;

import java.util.Calendar;
import java.util.Date;

// Add or Subtract date
public class AddSubtract {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        Calendar calendar =Calendar.getInstance();

        calendar.setTime(date);
        calendar.add(Calendar.YEAR,3);
        calendar.add(Calendar.MONTH,3);
        calendar.add(Calendar.DATE,-3);


        System.out.println(calendar.getTime());

    }
}
