/**
 * @Author zhenggk22579
 * @Date 2021/3/29 14:44
 */

public class DemoThread02 {
    public static void main(String[] args) {
        Thread t1 = new Mythread01();
        Thread t2 = new Thread(new Mythread02());
        t1.start();
        t2.start();

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
        t3.start();
        System.out.println(t3.getId());

        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
        t4.start();
        //返回线程的标识符
        System.out.println(t4.getId());

        System.out.println(Thread.currentThread());
        System.out.println(t4.currentThread());
    }
}
class Mythread02 implements Runnable {
    @Override
    public void run() {
        System.out.println("这是第二个线程");
    }
}
