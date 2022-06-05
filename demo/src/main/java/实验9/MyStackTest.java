package 实验9;

import java.util.Scanner;

/**
 * @author ZZM
 * @creater 2022-05-13  15:45
 */
public class MyStackTest {
    public static void main(String[] args) {
        MyStack list=new MyStack();
        Scanner input=new Scanner(System.in);
        String a;
        System.out.println("请输入5个字符串：");
        for(int i=0;i<5;i++)
        {
            a=input.next();
           list.push(a);
        }
        System.out.println("显示：");
        System.out.println(list);
        while(!list.isEmpty()){
            System.out.println(list.pop());
        }
    }
}
