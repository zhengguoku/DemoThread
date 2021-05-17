package Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * @Author zhenggk22579
 * @Date 2021/4/16 16:53
 */

public class DateTest {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //simpleDateFormat.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("CET"));
        System.out.println(simpleDateFormat.format(Calendar.getInstance().getTime()));
    }
}
