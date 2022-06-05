package 实验12;

/**
 * @author ZZM
 * @creater 2022-05-23  15:48
 * 书p480
 * 13.1
 */
public class MyTriangle extends GeometricObject{
    double side1;
    double side2;
    double side3;
    MyTriangle(){
        this(1,1,1);
    }

    @Override
    double getArea() {
        double p=(side1+side3+side2)/2;
        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }

    @Override
    double getlength() {
        return side1+side2+side3;
    }

    public MyTriangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public MyTriangle(String color, boolean Filled, double side1, double side2, double side3) {
        super(color, Filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
}

abstract class GeometricObject{
    String color;
    boolean Filled;
    protected GeometricObject(){
        this(null,false);
    }
    protected GeometricObject(String color,boolean Filled){
        this.color=color;
        this.Filled=Filled;
    }
    abstract double getArea();
    abstract double getlength();
    String getColor(){
        return this.color;
    }
    boolean getFilled(){
        return this.Filled;
    }
    public String toString(){
        System.out.println("面积为"+getArea()+"周长为"+getlength()+"颜色"+getColor()+"是否填充"+getFilled());
        return null;
    }
}