package main.date;

import java.util.Calendar;
import java.util.Date;

public class DateEx1 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        int year = date.getYear();
        System.out.println(year);


        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH)+1);
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH)); //몇 번째 요일이냐
        //요일은 1부터 7까지 1(일요일)부터 시작
        System.out.println(MyDate.getWeek(cal.get(Calendar.DAY_OF_WEEK)));
        System.out.println(MyDate.getAmPm(cal.get(Calendar.AM_PM)));
        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.SECOND));
        System.out.println(MyDate.getTime());
        System.out.println(MyDate.getFullTime());
        //yyyy-mm-dd
        MyDate.getDate();
        MyDate myDate = new MyDate();
    }



}
