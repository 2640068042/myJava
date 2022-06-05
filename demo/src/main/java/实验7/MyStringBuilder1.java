package 实验7;

import static java.lang.Character.isUpperCase;

public class MyStringBuilder1 {

    char[] myString;
    int big=0;
    int capacity=10;

    public MyStringBuilder1(String s){
        while(s.length()>capacity){
            capacity=capacity*2;
        }
        myString=new char[capacity];
        big=s.length();
        int i=0;
        for(int j=0;j<big;j++){
            if(s.charAt(j)!=0) {
                myString[i] = s.charAt(j);
                i++;
            }
        }
        big=i;
    }

    public MyStringBuilder1 append(MyStringBuilder1 s){
        MyStringBuilder1 a=new MyStringBuilder1(new String(myString)+s);
        return a;
    }

    public MyStringBuilder1 append(int i){
        MyStringBuilder1 a=new MyStringBuilder1(new String(myString)+i);
        return a;
    }

    public int length()
    {
        return big;
    }

    public char charAt(int index){
        return myString[index];
    }

    public MyStringBuilder1 toLowerCase(){
        char[] b=new char[big] ;
        for(int i=0;i<big;i++){
            b[i]=myString[i];
        }
        for(int i=0;i<big;i++){
            if(isUpperCase(b[i])){
                b[i]=Character.toLowerCase(b[i]);
            }
        }
        MyStringBuilder1 a=new MyStringBuilder1(new String(b));
        return a;
    }

    public MyStringBuilder1 substring(int begin ,int end){
        char[] b=new char[end-begin];
        int j=0;
        for(int i=begin;i<=end;i++,j++)
        {

            b[j]=myString[i];
        }
        MyStringBuilder1 a=new MyStringBuilder1(b.toString());
        return a;
    }

    public String toString(){
        String s=new String(myString,0,big);
        return s;
    }


}
