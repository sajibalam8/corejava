package mypack;

import java.util.*;
public class Date {
    public static void main(String[] args)
    {
     int year = 2022;
     int month = 3; // January
     int date = 2;

     Calendar cal = Calendar.getInstance();
     // Sets the given calendar field value and the time value
     // (millisecond offset from the Epoch) of this Calendar undefined.
     cal.clear();
     System.out.println();
     cal.set(Calendar.YEAR, year);
     cal.set(Calendar.MONTH, month);
     cal.set(Calendar.DATE, date);

     System.out.println(cal.getTime());
     System.out.println();
	 }
}