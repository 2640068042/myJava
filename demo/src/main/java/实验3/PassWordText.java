package 实验3;
import java.util.Scanner;
import static java.lang.Character.isDigit;
import static java.lang.Character.isLetterOrDigit;
/*
密码
包含8个字符
必须包含字母和数字
至少包含两个数字
 */
public class PassWordText {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password;
        password = input.nextLine();
        CheckThePassword(password);

    }

    public static void CheckThePassword(String s) {
        boolean x = true;
        int numbers=0;
        if (s.length() < 8) {
            x = false;
        }
        for(int i=0;i<s.length();i++){
            if(!isLetterOrDigit(s.charAt(i))){
                x=false;
            }
        }
        for(int i=0;i<s.length();i++){
           if(isDigit(s.charAt(i))){
               numbers++;
            }
        }
        if(numbers<2||numbers==s.length()){
            x=false;
        }
        if(x){
            System.out.println("Valid Password");
        }
        else{
            System.out.println("Incvalid Password");
        }
    }

}
