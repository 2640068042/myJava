package 实验3;
import java.util.Scanner;
/*
比较三个点的坐标
2 2 5 5 9 9

 */

public class PlaceOfThePoint {
    public static void main(String[] args) {
        double x0,y0,x1,y1,x2,y2;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter three points for p0,p1,p2:");
        x0=input.nextDouble();
        y0=input.nextDouble();
        x1=input.nextDouble();
        y1=input.nextDouble();
        x2=input.nextDouble();
        y2=input.nextDouble();
        if(leftOfTheLine(x0,y0,x1,y1,x2,y2)){
            System.out.println("p2在线段左侧");
        }
        if(rightOfTheLine(x0,y0,x1,y1,x2,y2)){
            System.out.println("p2在线段右侧");
        }
      if(onTheLineSegment(x0,y0,x1,y1,x2,y2)){
          System.out.println("p2在线段上");
      }
        if(onTheSameLine(x0,y0,x1,y1,x2,y2)){
            System.out.println("p2在直线上");
        }


    }


public static boolean leftOfTheLine(double x0,double y0,double x1,double y1,double x2,double y2){
    double numbers=(y2-y0)*(x1-x0)-(y1-y0)*(x2-x0);
    if(numbers>0){
        return true;
    }
    return false;
}
    public static boolean rightOfTheLine(double x0,double y0,double x1,double y1,double x2,double y2){
        double numbers=(y2-y0)*(x1-x0)-(y1-y0)*(x2-x0);
        if(numbers<0){
            return true;
        }
        return false;
    }
    public static boolean onTheLineSegment(double x0,double y0,double x1,double y1,double x2,double y2){
        double numbers=(y2-y0)*(x1-x0)-(y1-y0)*(x2-x0);
        double a=Math.sqrt((x2-x0)*(x2-x0)+(y2-y0)*(y2-y0));
        double b=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        double c=Math.sqrt((x1-x0)*(x1-x0)+(y1-y0)*(y1-y0));
        if(numbers==0&&c>a&&c>b){
            return true;
        }
        return false;
    }
    public static boolean onTheSameLine(double x0,double y0,double x1,double y1,double x2,double y2){
        double numbers=(y2-y0)*(x1-x0)-(y1-y0)*(x2-x0);
        double a=Math.sqrt((x2-x0)*(x2-x0)+(y2-y0)*(y2-y0));
        double b=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        double c=Math.sqrt((x1-x0)*(x1-x0)+(y1-y0)*(y1-y0));
        if(numbers==0&&(a>c||b>c)){
            return true;
        }
        return false;
    }
}