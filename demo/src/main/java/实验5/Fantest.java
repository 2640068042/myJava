package 实验5;
/*
电风扇测试类
9.8
 */
public class Fantest {
    public static void main (String[] args)
    {
        Fan a=new Fan();
        a.setSpeed(3);
        a.setColor("yellow");
        a.setRadius(10);
        a.setOn(true);

        Fan b=new Fan();
        b.setSpeed(2);
        b.setColor("blue");
        b.setRadius(5);
        b.setOn(false);

        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}
