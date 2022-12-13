import java.time.DayOfWeek;
import java.time.LocalDate;

public class DateTime {

    public static void main(String args[]) {

        int year = 1983;
        int month = 04;
        int day = 13;
        //solution 1
        LocalDate dt = LocalDate.of(year, month, day); //2015-12-22
        DayOfWeek dayOfWeek = dt.getDayOfWeek();
        System.out.println("Day of the Week :: " + dayOfWeek);

        //solution 2:
        System.out.println( LocalDate.of(year, month, day).getDayOfWeek().name());

        //solition 3

        String DAYS[] = { "SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        int a = (14 - month) / 12;
        int y = year - a;
        int m = month + 12 * a - 2;

        int d = (day + y + y/4 - y/100 + y/400 + (31*m)/12) % 7;
        System.out.println(DAYS[d]);



    }
}
