package Homework.DateTime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        System.out.println(isDateOdd("01 01 2023"));
        System.out.println(isDateOdd("02 01 2023"));
    }

    public static boolean isDateOdd(String date) {
        Date startDate = new Date();
        System.out.println("startDate is: "+startDate);

        DateFormat format = new SimpleDateFormat("MM dd yyyy");
        Date currectDate = null;

        try {
            currectDate = format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        int day = 1;
        day += (int) ((currectDate.getTime() - (startDate.getTime() - 24 * 60 * 60 * 1000)) / 24 / 60 / 60 / 1000);


        return day % 2 != 0;
    }
}

