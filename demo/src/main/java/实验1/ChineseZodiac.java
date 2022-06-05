package 实验1;
import java.util.Scanner;
public class ChineseZodiac{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please input  your birth year");
        int birthyear=input.nextInt();
        if(birthyear<=0)
        {
            System.out.println("the number error");
        }
        birthyear=birthyear%12;
       String message="error";
        switch(birthyear)
        {
            case 0:message="monkey";break;
            case 1:message="rooster";break;
            case 2:message="dog";break;
            case 3:message="pig";break;
            case 4:message="rat";break;
            case 5:message="ox";break;
            case 6:message="tiger";break;
            case 7:message="rabbit";break;
            case 8:message="dragon";break;
            case 9:message="snake";break;
            case 10:message="horse";break;
            case 11:message="sheep";break;
        }
            System.out.println(message);
    }
}
