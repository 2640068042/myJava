package 实验6;

public class Queue {
    int[] element ;
    int size=0;
    int finalsize=8;
    public Queue(){
        element=new int[8];
    }

    //加入数据
    public void enqueue(int a){
        if(size>=finalsize)
        {
            finalsize=finalsize*2;
            int[] numbers=new int[finalsize];
            for(int i=0;i<finalsize/2;i++)
            {
                numbers[i]=element[i];
            }
            element=numbers;
        }
        element[size]=a;
        size++;
    }
    //抽出数字
    public int dequeue(){
        int a=element[0];
        for(int i=0;i<size-1;i++)
        {
            element[i]=element[i+1];
        }
        size--;
        return a;
    }
    public boolean empty()
    {
        if(size==0)return true;
        else  return false;
    }
    public int getSize()
    {
        return this.size;
    }

}
