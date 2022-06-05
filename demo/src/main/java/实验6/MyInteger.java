package 实验6;
/*
书p359
10.3
 */
public class MyInteger {

    //数据域
    int value;

    //构造方法
    public MyInteger()
    {
    }
    public MyInteger(int value)
    {
        this.value=value;
    }

    //方法
    public int getValue() {
        return value;
    }
    //判断偶数
    public boolean isEven(){
        return isEven(value);
    }
    public static boolean isEven(int value){
        if(value==0)return false;
        if(value%2==0)return true;
        return false;
    }
    public static boolean isEven(Object a){
        if(a instanceof MyInteger) {
            MyInteger b=(MyInteger)a;
            return isEven(b.value);
        }
        else{
            System.out.println("类型不匹配");
            return false;
        }
    }
    //判断奇数
    public boolean isOdd(){
        return isOdd(value);
    }
    public static boolean isOdd(int value){
        if(value==0)return false;
        if(value%2==0)return false;
        return true;
    }
    public static boolean isOdd(Object a){
        if(a instanceof MyInteger) {
            MyInteger b=(MyInteger)a;
            return isOdd(b.value);
        }
        else{
            System.out.println("类型不匹配");
            return false;
        }
    }
    //判断素数
    public boolean isPrime(){
        return isPrime(this.value);
    }
    public static boolean isPrime(int value){
        if(value<=1)return false;
        for(int i=1;i<value;i++)
        {
            if(value/i==0)return false;
        }
        return true;
    }
    public static boolean isPrime(Object a){
        if(a instanceof MyInteger) {
            MyInteger b=(MyInteger)a;
            return isPrime(b.value);
        }
        else{
            System.out.println("类型不匹配");
            return false;
        }
    }
    //判断是否相等
    public boolean equals(int a){
        if(this.value==a)return true;
        else return false;
    }
    public boolean equals(MyInteger a){
        if(a.value==this.value)return true;
        else return false;
    }
    //将字符数组转化为一个int值
    public static int parseInt(char[] a)
    {
        int answers=0;
        for(int i=0;i<a.length;i++)
        {
            answers=answers*10+(a[i]-'0');
        }
        return answers;
    }
    public static int parseInt(String a){
        return Integer.parseInt(a);
    }

}
