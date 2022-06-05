package 实验12;

import java.util.Scanner;

/**
 * @author ZZM
 * @creater 2022-05-23  16:04
 */
public class MytriangleTest {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        double a,b,c;
        String color;
        boolean filled;
        System.out.println("请输入三角形三边边长,颜色，是否填充");
        a= input.nextDouble();
        b= input.nextDouble();
        c= input.nextDouble();
        color=input.next();
        filled=input.nextBoolean();
        MyTriangle triangle=new MyTriangle(color,filled,a,b,c);
        triangle.toString();
    }
}
