package 实验6;

/*
MyInteger测试
 */
public class MyIntegerTest {
    public static void main(String[] args) {
        MyInteger a=new MyInteger(17);
        System.out.println("值为："+a.getValue());
        System.out.println("是否为素数："+a.isPrime());
        System.out.println("是否为偶数"+a.isEven());
        System.out.println("是否为奇数"+a.isOdd());

        int b=32;
        System.out.println(b+"值为："+MyInteger.isPrime(b));
        System.out.println(b+"是否为素数："+MyInteger.isPrime(b));
        System.out.println(b+"是否为偶数"+MyInteger.isEven(b));
        System.out.println(b+"是否为奇数"+MyInteger.isOdd(b));

    }
}
