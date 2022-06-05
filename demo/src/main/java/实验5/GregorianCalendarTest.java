package 实验5;

import java.util.GregorianCalendar;

/*
现在的时间
setTimeMillis
9.5
 */
public class GregorianCalendarTest {
    public static void main(String[] args)
    {
        GregorianCalendar today=new GregorianCalendar();
        System.out.println(today.get(today.YEAR));
        System.out.println(today.get(today.MONTH)+1);
        System.out.println(today.get(today.DAY_OF_MONTH));
        today.setTimeInMillis(123457898765L);
        System.out.println(today.get(today.YEAR));
        System.out.println(today.get(today.MONTH)+1);
        System.out.println(today.get(today.DAY_OF_MONTH));

    }
}
