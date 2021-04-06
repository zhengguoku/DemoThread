import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author zhenggk22579
 * @Date 2021/3/30 14:23
 * lock锁
 */

public class DemoThread12 {
    public static void main(String[] args) {
        MyThread03 myThread03 = new MyThread03();
        Thread t1 = new Thread(myThread03,"线程1");
        Thread t2 = new Thread(myThread03,"线程2");
        t1.start();
        t2.start();
    }
}

class MyThread03 implements Runnable {

    private static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        method();
    }

    public void method() {
        lock.lock();
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + "->" + i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

    }
}