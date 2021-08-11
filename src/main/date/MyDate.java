package main.date;

import java.util.Calendar;

public class MyDate {
    public static String getDate(){
        Calendar cal = Calendar.getInstance();
        return cal.get(Calendar.YEAR)+"년"
                        +twoDigit(cal.get(Calendar.MONTH)+1)+"월"
                        +twoDigit(cal.get(Calendar.DATE))+"일";
    }
    public static String getDate(Calendar cal){
        return cal.get(Calendar.YEAR)+"년"
                +twoDigit(cal.get(Calendar.MONTH)+1)+"월"
                +twoDigit(cal.get(Calendar.DATE))+"일";
    }

    public static String twoDigit(int num) {

        return num < 10 ? "0" + num : num + "";
    }
    public static String getWeek(int week){
        String[] arr = {"일", "월", "화", "수", "목", "금", "토", "일"};
        return arr[week-1]+"요일";
//        String[] arr = {"", "일", "월", "화", "수", "목", "금", "토", "일"};
//        return arr[week]+"요일"; 이렇게 해도 됨

        }
        public static String getAmPm(int ampm){
//        String[] tmp = {"오전", "오후"};
//        return tmp[ampm];
            return new String[]{"오전", "오후"}[ampm];

        }
        public static String getTime(){
            Calendar cal = Calendar.getInstance();
        String time = cal.get(Calendar.HOUR_OF_DAY)+"시" + cal.get(Calendar.MINUTE)+"분" +cal.get(Calendar.SECOND)+"초";
        return time;
        }
        public  static String getFullTime(){
//            Calendar cal = Calendar.getInstance();
//            String fulltime = cal.get(Calendar.YEAR)+"년"+ cal.get(Calendar.MONTH)+"월"+cal.get(Calendar.DATE)+"일"+
//                    cal.get(Calendar.HOUR_OF_DAY)+"시" + cal.get(Calendar.MINUTE)+"분" +cal.get(Calendar.SECOND)+"초";
//            return fulltime; 이코드를 아래 처럼 대체 가능 위에 다 선언 되어있기때문 이렇게 하면 중복을 하는것이기 때문에 좋지않은 코드임
            return getDate()+"  "
                    +getAmPm(Calendar.getInstance().get(Calendar.AM_PM))
                    +" "+getTime();
        }
    }

