package 练习;

public class NumberChange {
    public static void easyChange(int[] numbers,int left,int right)
    {
        int middle=numbers[left];
        int line=2;//line 为1是移动left，2时移动right
        for(;;)
        {
            if(right==left)
            {
                numbers[left]=middle;
                break;
            }
            while(line==1)
            {
                if(numbers[left]>middle)
                {
                    numbers[right]=numbers[left];
                    right--;
                    line=2;
                    break;
                }
                else
                {
                    left++;
                    break;
                }
            }
            while(line==2)
            {
                if(numbers[right]<middle)
                {
                    numbers[left]=numbers[right];
                    left++;
                    line=1;
                    break;
                }
                else
                {
                    right--;
                    break;
                }
            }
        }

    }



    public static void AllChange(int[] numbers,int left,int right)
    {
        if(right-left<2)return;
        int middle=numbers[left];
        int line=2;//line 为1是移动left，2时移动right
        int low=left;
        int high=right;
        while(left!=right)
        {
            while(line==1)
            {
                if(numbers[left]>middle)
                {
                    numbers[right]=numbers[left];
                    right--;
                    line=2;
                    break;
                }
                else
                {
                    left++;
                    break;
                }
            }
            while(line==2)
            {
                if(numbers[right]<middle)
                {
                    numbers[left]=numbers[right];
                    left++;
                    line=1;
                    break;
                }
                else
                {
                    right--;
                    break;
                }
            }
        }
        numbers[left]=middle;
        if(high-low>2)
        {
            AllChange(numbers,low,left-1);
            AllChange(numbers,left,high);
        }
        

    }

}
