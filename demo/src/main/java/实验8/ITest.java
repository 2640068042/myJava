package 实验8;
/*
11.8.7
书p382
2022.5.6
 */
public class ITest {
    public static void main(String[] args) {
        new A();
        new B();
    }
}

class A {
    int i = 7;

    public A() {
        setI(20);
        System.out.println("i from A is " + i);
    }

    public void setI(int i) {
        this.i = 2 * i;
    }
}
    class B extends A {

        public B() {
            System.out.println("i from B is " + i);
        }

        public void setI(int i) {
            this.i = 3 * i;
        }

    }