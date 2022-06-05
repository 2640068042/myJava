package 实验2;
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Please input your SSN");
        String ssn= input.nextLine();
        char ch1=ssn.charAt(3);
        char ch2=ssn.charAt(6);
        int number=1;
        if(ch1!='-'||ch2!='-')
        {
            System.out.println(ssn+" is a invalid social security number");
        }
        else
        {
            for(int i=0;i<=10;i++)
            {
                if(i==3||i==6)i++;
                ch1=ssn.charAt(i);
                if(ch1<'0'||ch1>'9')
                {
                    number = -1;
                }
            }
            if(number>0)
            {
                System.out.println(ssn+" is a valid social security number");
            }
            else
            {
                System.out.println(ssn+" is a invalid social security number");
            }
        }



    }
}
