package 练习;

public class Day02 implements Runnable {
    int  ticket=10000;
    @Override
    public void run() {
        while(ticket>0){
          sold();
        }
    }
    private synchronized void sold(){
        if(ticket>0){
            System.out.println(Thread.currentThread().getName()+"    "+ticket);
            ticket--;
        }
    }

    public static void main(String[] args) {
        Day02 a=new Day02();
        Thread b=new Thread(a);
        Thread c=new Thread(a);
        c.start();
        b.start();

    }

}