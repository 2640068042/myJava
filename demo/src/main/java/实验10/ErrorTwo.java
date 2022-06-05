package 实验10;

import java.util.Scanner;

/**
 * @author ZZM
 * @creater 2022-05-16  15:59
 */
public class ErrorTwo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int [] numbers=new int[100];
        for(int i=0;i<numbers.length;i++){
            numbers[i]=(int)(Math.random()*100);
        }
        System.out.println("请输入要取数字的下标");
        int x=input.nextInt();
        try{
            System.out.println(numbers[x]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Out of Bounds");
        }
    }
}
