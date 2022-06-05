package 实验4;
import java.util.Scanner;
/**
 * JAVA书p281 8.27
 *给矩阵的每一列上的值排序
 * 2022.4.15 17：34
    3  3
0.15 0.875 0.375
0.55 0.005 0.225
0.3 0.12 0.4
 */

public class text01 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入矩阵的大小（m*n）");
        int a=input.nextInt();
        int b=input.nextInt();
        double[][] juzhen1=new double[a][b];
        double[][] juzhen2;
        System.out.println("Enter a m-by-n matrix row gy now");
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                juzhen1[i][j]=input.nextDouble();
            }
        }
        juzhen2=sortColumns(juzhen1);
        System.out.println("The column-sorted array is");
        for(int i=0;i<juzhen2.length;i++)
        {
            System.out.println();
            for(int j=0;j<juzhen2[0].length;j++)
            {
                System.out.printf("%8.3f",juzhen2[i][j]);
            }
        }

    }

public static double[][] sortColumns(double[][] n )
{
    double[][] m=new double[n.length][n[0].length ];
    for(int i=0;i<n.length;i++)
    {
        for(int j=0;j<n[0].length;j++)
        {
            m[i][j]=n[i][j];
        }
    }
    for(int j=0;j<m[0].length;j++)
    {
        for(int i=0;i< m.length;i++)
        {
            for(int k=0;k<m.length-1;k++)
            {
                if(m[k][j]>m[k+1][j])
                {
                    double change=0;
                    change=m[k][j];
                    m[k][j]=m[k+1][j];
                    m[k+1][j]=change;
                }
            }

        }
    }
    return m;
}
}