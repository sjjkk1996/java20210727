package date;

import javax.swing.*;
import java.util.Calendar;

public class CalendarPrintEx {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(
                "출력하고자 하는 년월(yyyy-mm)을 입력해주세요\nex)2021 08");
        //1. 해당월의 1일이 무슨 요일인지? 2. 그달의 마지막 일자를 알아야 함.
        int year = Integer.parseInt(input.split(" ")[0]);
        int month = Integer.parseInt(input.split(" ")[1]);
        Calendar cal = Calendar.getInstance();
        cal.set(year, month-1, 1);
        int firstOfMonthWeek = cal.get(Calendar.DAY_OF_WEEK); //첫번째 요일
        int lastOfMonth = cal.getActualMaximum(Calendar.DATE); //마지막 일자
        int start = 0;
        System.out.printf("      %4d년 %2d월 %n", year, month);
        System.out.println(" SU MO TU WE TH FR SA");
        for (int i = 1; i < firstOfMonthWeek; i++) {
            System.out.printf("%3s", " ");
            start++;
        }
        for (int i = 1; i < lastOfMonth; i++) {
            System.out.printf("%3d", i);
            if(++start%7==0) System.out.println();
        }

    }
}
