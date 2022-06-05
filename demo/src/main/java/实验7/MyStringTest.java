package 实验7;

/*
MyStringBuder1测试
书p365  10.27
 */
public class MyStringTest {
    public static void main(String[] args) {
        MyStringBuilder1 a=new MyStringBuilder1("AAAAaaa");
        MyStringBuilder1 b=new MyStringBuilder1("BBBBBbbbbb");
        MyStringBuilder1 c=a.append(b);
        System.out.println(c.toString());
        c=c.append(2);
        System.out.println(c.toString());
        c=c.toLowerCase();
        System.out.println(c.toString());
        System.out.println(c.charAt(2));


    }
}
