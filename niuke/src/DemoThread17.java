import java.util.concurrent.locks.LockSupport;

/**
 * @Author zhenggk22579
 * @Date 2021/3/30 16:55
 *
 * 指定线程唤醒LockSupport
 */

public class DemoThread17 {
    private static Object obj = new Object();
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj){
                    System.out.println("t1:start");
                    LockSupport.park();
                    System.out.println("t1:countinue");
                }



            }
        }, "t1");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj){
                    System.out.println("t2:start");
                    LockSupport.park();
                    System.out.println("t2:countinue");
                }

            }
        }, "t2");

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj){
                    System.out.println("t3:start");
                    LockSupport.park();
                    System.out.println("t3:countinue");
                }

            }
        }, "t3");
        t1.start();
        t2.start();
        t3.start();
        Thread.sleep(5000);
        LockSupport.unpark(t1);
        LockSupport.unpark(t2);
        LockSupport.unpark(t3);
//        t3.notifyAll();

    }
}
