package Test;

/**
 * @Author zhenggk22579
 * @Date 2021/4/20 15:18
 */

public class SynchronizedTest {
    public synchronized void hello(){
        System.out.println("同步方法");
    }

    public void hello2(){
        synchronized (SynchronizedTest.class){
            System.out.println("代码块同步");
        }
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println("线程名：" + Thread.currentThread().getName());
            }
        },"线程1");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程名：" + Thread.currentThread().getName());
            }
        },"线程2");
        t1.start();
        //t2.start();
    }

}
