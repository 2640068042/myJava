package 实验3;
import java.util.Scanner;
/*
简单排序
 10个数据
 12 23 43 56 33 2 12 4 23 123
 */
public class List {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          System.out.println("Enter list size:");
          int size=input.nextInt();
          int[] numbers = new int[size];
          for(int i=0;i<size;i++){
               numbers[i]=input.nextInt();
          }
          int a= partition(numbers);
          System.out.println(a);
          for(int i=0;i<size;i++){
            System.out.printf("%4d",numbers[i]);
          }

     }
     public static int partition(int[] list)
     {
          int theMidnumber=list[0];
          int right=list.length-1;
          int left=0;
          int choose=2;//choose为1时移动左下标，2使移动右下标
          while(right>left) {
               while (choose==2) {
                  if(list[right]>theMidnumber)
                  {
                       right--;
                       continue;
                  }
                       list[left]=list[right];
                       left++;
                       choose=1;
                       continue;
               }
               while (choose==1) {
                    if(list[left]<theMidnumber)
                    {
                         left++;
                         continue;
                    }
                         list[right]=list[left];
                         right--;
                         choose=2;
                         continue;
               }
          }
          list[left]=theMidnumber;
          return left;
     }
}
