/**
 * @Author zhenggk22579
 * @Date 2021/3/30 13:48
 * 同步方法
 */

public class DemoThread11 {
    public static void main(String[] args) {
        MyThread04 mythread04 = new MyThread04();

        Thread t1 = new Thread(mythread04, "线程1");
        Thread t2 = new Thread(mythread04, "线程2");
        t1.start();
        t2.start();
    }
}

class MyThread04 implements Runnable {
    @Override
    public void run() {
        method02();
        //method01();

    }

    public synchronized void method01() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("method01->" + Thread.currentThread().getName() + "->" + i);
        }
    }

    public synchronized static   void method02() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("method02->" + Thread.currentThread().getName() + "->" + i);
        }
    }
}
