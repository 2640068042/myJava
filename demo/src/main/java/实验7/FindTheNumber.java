package 实验7;

import java.math.BigInteger;

/*
找能被5，6 整除的大于Long.MAX_VALUE的前十个数字
书p364  10.21
 */
public class FindTheNumber {
    public static void main(String[] args) {
        BigInteger number=BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger addnumber=BigInteger.valueOf(1);
        BigInteger divide1=BigInteger.valueOf(5);
        BigInteger divide2=BigInteger.valueOf(6);
        BigInteger zero=BigInteger.valueOf(0);
        int i=0;
        while(i<10){
            number=number.add(addnumber);
            if(number.remainder(divide1).equals(zero)||number.remainder(divide2).equals(zero))
            {
                System.out.println(number.toString());
                i++;
            }
        }
    }
}
