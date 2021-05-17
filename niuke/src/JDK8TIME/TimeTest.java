package JDK8TIME;

import java.time.LocalDate;
import java.time.Period;

/**
 * @Author zhenggk22579
 * @Date 2021/4/19 17:00
 */

public class TimeTest {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();
        System.out.println("year=" + year + ",month=" + month + ",day=" + day);
        boolean leapYear = today.isLeapYear();
        System.out.println(leapYear);

        Period period = Period.between(LocalDate.of(2018, 1, 5), LocalDate.of(2018, 2, 5));
        System.out.println(period.getMonths());
    }
}
