package 实验6;

/*
类似栈数据
数据先进先出
书p361 10.10 题
 */
public class QueueTest {
    public static void main(String[] args) {
        Queue num=new Queue();
        for(int i=0;i<=20;i++)
        {
            num.enqueue(i);
        }
        for (int i=0;i<=20;i++)
        {
            System.out.print("  "+num.dequeue());
        }
        System.out.println("\n是否为空"+num.empty());

    }
}
