package 练习;
import java.util.Scanner;

    public class  Exercise01 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter list size:");
            int size=8;
            int[] numbers = {15,51,78,87,65,32,5,7};
            int a=partition(numbers,size);
            System.out.println(a);
            for(int i=0;i<size;i++){
                System.out.printf("%4d",numbers[i]);
            }

        }


        public static int  partition(int[] list,int x)
        {
            if(x<2){
                return 0;
            }
            int theMidnumber=list[0];
            int right=x-1;
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
                    if (list[left] < theMidnumber) {
                        left++;
                        continue;
                    }
                    list[right] = list[left];
                    right--;
                    choose = 2;
                    continue;

                }
            }
            partition(list,left-1);
            partition(list,x-left-1);
            return left;
        }



    }
