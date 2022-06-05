package 实验10;

import java.util.Scanner;

/**
 * @author ZZM
 * @creater 2022-05-16  15:53
 * 书p441
 * 12.1
 */
public class ErrorOne {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int a=0,b=0;
        String s1;
        String s2;
        String s3;
        s1=input.next();
        s2=input.next();
        s3=input.next();
        try{
            a=Integer.parseInt(s1);
            b=Integer.parseInt(s3);
       switch(s2){
           case"+":System.out.println(""+a+"+"+b+"="+(a+b));break;
           case"-":System.out.println(""+a+"-"+b+"="+(a-b));break;
           case"*":System.out.println(""+a+"*"+b+"="+(a*b));break;
           case"%":System.out.println(""+a+"%"+b+"="+(a%b));break;
           case"/":System.out.println(""+a+"/"+b+"="+(a/(double)b));break;
       }
        }catch (NumberFormatException e){
            System.out.println("Wrong input  "+e.getLocalizedMessage());
        }

    }
}
