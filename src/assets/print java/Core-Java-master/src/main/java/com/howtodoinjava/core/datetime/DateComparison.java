package com.howtodoinjava.core.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class DateComparison {
  @SuppressWarnings({ "deprecation", "static-access" })
  public static void main(final String[] args) throws InterruptedException {
    LocalDate today = LocalDate.now();
    LocalDate anotherDay = LocalDate.of(2018, 01, 10);

    System.out.println(today.isEqual(anotherDay)); // false
    System.out.println(today.isAfter(anotherDay)); // true
    System.out.println(today.isBefore(anotherDay)); // false
    System.out.println(today.compareTo(anotherDay)); // 4

    int diff = today.compareTo(anotherDay);
    if (diff > 0) {
      System.out.println(today + " is greater than " + anotherDay);
    } else if (diff < 0) {
      System.out.println(today + " is less than " + anotherDay);
    } else {
      System.out.println(today + " is equal to " + anotherDay);
    }

    // LocalDateTime and ZonedDateTime use time part as well during comparison

    // Both instances are on same day but time is 100 milliseconds off
    // They are not equal during comparison

    LocalDateTime instance = LocalDateTime.now();
    // To have different time part in both instances
    Thread.currentThread()
      .sleep(100);
    LocalDateTime anotherInstance = LocalDateTime.now();

    // Compare only date part
    boolean isEqual = instance.toLocalDate()
      .isEqual(anotherInstance.toLocalDate());
    System.out.println(isEqual); // true

    //// Compare date and time parts
    System.out.println(instance.isEqual(anotherInstance)); // false
    System.out.println(instance.isAfter(anotherInstance)); // false
    System.out.println(instance.isBefore(anotherInstance)); // true

    // Compare only date part from LocalDateTime

    System.out.println(instance.toLocalDate()
      .isEqual(anotherInstance.toLocalDate())); // true

    // Comparing ZonedDateTime
    ZonedDateTime now = ZonedDateTime.now();
    ZonedDateTime nowInUTC = now.withZoneSameInstant(ZoneId.of("UTC"));

    System.out.println("Current Date in [Asia/Calcutta] - " + now);
    System.out.println("Current Date in [UTC] - " + nowInUTC);

    ZonedDateTime zdtInUTC = ZonedDateTime
      .parse("2022-02-15T11:21:12.123+05:30[UTC]");

    System.out.println("Current Date in [UTC] - " + zdtInUTC);

    long difference = nowInUTC.toInstant()
        .compareTo(zdtInUTC.toInstant());

    if (difference > 0) {
      System.out.println("zoneddatetime1 > zoneddatetime2");
    } else if (difference < 0) {
      System.out.println("zoneddatetime1 < zoneddatetime2");
    } else {
      System.out.println("\"zoneddatetime1 = zoneddatetime2");
    }

    // Date Comparison till Java 7

    // Comparing two date instances along with time
    Date date1 = new Date();
    // To have different time part in both instances
    Thread.currentThread()
      .sleep(100);
    Date date2 = new Date();

    System.out.println(date1.equals(date2)); // false
    System.out.println(date1.after(date2)); // false
    System.out.println(date1.before(date2)); // true

    // Comparing two date instances - only date part and ignore time part

    // date1 and date2 are on same day
    System.out.println(
      "Date part comparison result :: " + compareDatePartOnly(date1, date2));

    // date1 and date2 are on different day
    System.out.println("Date part comparison result :: "
      + compareDatePartOnly(new Date(2020, 2, 3), new Date(2020, 3, 4)));
  }

  /*
   * @return 0 if date1 and date2 falls on same day
   * 	       negative (-) value if date2 is greater
   * 		   positive (+) value if date1 is greater  
   */
  private static int compareDatePartOnly(final Date date1, final Date date2) {
    Calendar cal1 = Calendar.getInstance();
    Calendar cal2 = Calendar.getInstance();

    cal1.setTime(date1);
    cal2.setTime(date2);

    int result = cal1.get(Calendar.YEAR) - cal2.get(Calendar.YEAR);

    if (result == 0) {
      result = cal1.get(Calendar.DAY_OF_YEAR) - cal2.get(Calendar.DAY_OF_YEAR);
    }

    return result;
  }
}
