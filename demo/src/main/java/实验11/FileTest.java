package 实验11;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author ZZM
 * @creater 2022-05-20  16:56
 */
public class FileTest {
    public static void main(String[] args)throws Exception {
        java.io.File file = new java.io.File("D:\\作业\\Java 数据\\数据.txt");
        Scanner input1=new Scanner(System.in);
        if (file.exists()) {
            System.out.println("文件已经存在");
            System.exit(0);
        }
        System.out.println("请输入数据（数据用空格隔开）");
        try(PrintWriter output=new PrintWriter(file)){
            output.print(input1.nextLine());
        }
        double x=0;
        double sum=0;
        int num=0;
        try (Scanner input = new Scanner(file);){
            while(input.hasNext()){
                x= input.nextDouble();
                sum+=x;
                num++;
            }
        }
        System.out.println("平均数为"+sum/num);
        file.delete();
    }
}
