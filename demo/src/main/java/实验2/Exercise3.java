package 实验2;
import java.util.Scanner;
/*
书p179   5.47
978013213080 合法
97801320   不合法
 */
public class Exercise3
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 12 digits of an ISBN-13 as a string:");
        String ISBN = input.nextLine();
        if (ISBN.length() < 12)
        {
            System.out.print(ISBN+"is an invalid input");
        }
        else
        {
            int lastnumber = 0;
            int cutnumber = 0;
            for (int i = 0; i <= 11; i++, i++) {
                cutnumber = ISBN.charAt(i) - '0' + 3 * (ISBN.charAt(i + 1) - '0');
            }
            lastnumber = 10 - cutnumber % 10;
            System.out.print("The ISBN-13 number is" + ISBN + lastnumber);
        }
    }
}
