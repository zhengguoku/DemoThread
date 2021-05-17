package DemoThread;

/**
 * @Author zhenggk22579
 * @Date 2021/3/31 11:02
 * 线程优先级
 */

public class DemoThread18 {
    public static void main(String[] args) {
        System.out.println("main thread begin prioity="+ Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(6);

        System.out.println("main thread end priority=" + Thread.currentThread().getPriority());
        Mythread18 mythread18 = new Mythread18();
        mythread18.start();

    }
}
class Mythread18 extends Thread{
    @Override
    public void run(){
        System.out.println("MyThread18 run priority=" + this.getPriority());
        Mythread19 mythread19 = new Mythread19();
        mythread19.start();
    }
}
class Mythread19 extends Thread{
    @Override
    public void run(){
        System.out.println("MyThread19 run priority=" + this.getPriority());
    }
}