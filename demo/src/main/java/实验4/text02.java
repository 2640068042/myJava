package 实验4;

import java.util.Scanner;
/**JAVA书p283
 * 找方阵的子方阵，返回最大字方阵的大小和位置
 * 2022.4.15 17：31
 */

/*
5

1 0 1 0 1
1 1 1 0 1
1 0 1 1 1
1 0 1 1 1
1 0 1 1 1

 */

public class text02 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrix:" );
        int wide=input.nextInt();
        System.out.println("Enter the matrix row by row:");
        int[][] fangzhen=new int[wide][wide];
        for(int i=0;i<wide;i++)
        {
            for(int j=0;j<wide;j++)
            {
                fangzhen[i][j]= input.nextInt();
            }
        }
        int[] answer=findLargestBlock(fangzhen);
        System.out.printf("The maximum square submarix is at (%d,%d)with size %d",answer[0],answer[1],answer[2]);

    }
    public static int[] findLargestBlock(int[][] m)
    {
        int a=0;
        int b=0;
        int number=0;
        for(int i=0;i<m.length;i++)
        {
            for(int j=0;j<m[0].length;j++)
            {
                int x=theBIggestnumber(i,j,m);
                if(x>number)
                {
                    number=x;
                    a=i;
                    b=j;
                }
            }
        }
        int[] shuzhu={a,b,number};
        return shuzhu;


    }
    public static int theBIggestnumber(int i,int j,int[][] m)
    {
        int number=0;
        int times;
        if (m.length-i<m[0].length-j)
        {
            times=m.length-i;
        }
        else
        {
            times=m[0].length-j;
        }
        for(int a=0;a<times;a++)
        {
            boolean it=true;
            for(int b=0;b<=a;b++)
            {
                for(int c=0;c<=a;c++)
                {
                    if(m[i+b][j+c]!=1)
                    {
                        it=false;
                        break;
                    }
                }
                if(it==false)break;
            }
            if(it==true)number=a+1;
        }
        return number;
    }

}
