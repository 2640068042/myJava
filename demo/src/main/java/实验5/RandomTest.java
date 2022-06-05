package 实验5;

import java.util.Random;

/*
测试Random
输出50个随机数
9.4
 */
public class RandomTest {
    public static void main(String[] args)
    {
        Random a =new Random(1000);
        for(int i=0;i<50;i++) {
            if(i%10==0) System.out.println();
            System.out.printf("%5d",a.nextInt(100));
        }

    }
}
