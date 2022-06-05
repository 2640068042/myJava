package 练习;

public abstract class CircleWithException {

    int a=0;
    protected CircleWithException() {
    }
    protected CircleWithException(int a) {
        this.a=a;
    }

    abstract void getArea();


    public static void main(String[] args) {
        CircleWithException a=new CircleWithException(2) {
            @Override
            void getArea() {

            }
        };
    }

   
}

