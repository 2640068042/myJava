package 实验2;
public class Exercise2
{
    public static void main(String[] args)
    {
        for(int i=1;i<9;i++)
        {
            int a=1;
            for(int j=1;j<=9-i;j++)
            {
                System.out.printf("     ");
            }
            for(int j=1;j<=i;j++)

            {
                System.out.printf("%5d",a);
                a=a*2;
            }
            a=a/2;
            for(int j=1;j<i;j++)
            {
                a=a/2;
                System.out.printf("%5d",a);
            }
            System.out.println("");
        }
    }
}
