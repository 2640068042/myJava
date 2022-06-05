package 实验12;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * @author ZZM
 * @creater 2022-05-23  16:18
 */
public class PrintCalender {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入月份，年份");
        int month=input.nextInt();
        int year=input.nextInt();
        Calendar calendar=new GregorianCalendar(year,month-1,1);
        System.out.println("    "+getMonthName(month)+"    "+year);
        System.out.println("--------------------------");
        System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");

        for(int i=1;i<calendar.get(Calendar.DAY_OF_WEEK);i++){
            System.out.print("     ");
        }
        int j=calendar.get(Calendar.DAY_OF_WEEK);
        for (int i=1;i<calendar.getActualMaximum(Calendar.DAY_OF_MONTH);i++){
            System.out.printf("%-5d",i);
            if(j%7==0) System.out.println();
            j++;
        }

    }
    static String getMonthName(int month){
        String monthName="";
        switch(month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            default:
                monthName = "December";
                break;
        }

return monthName;
    }

}
