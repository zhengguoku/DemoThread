/**
 * @Author zhenggk22579
 * @Date 2021/3/30 15:06
 * 线程间的通讯方式wait()/notify()/notifyAll()
 */

public class DemoThread14 {
    private static int num = 0;
    private static int curThread = 1;
    private static Object obj = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                print(1, 2);
            }
        }, "线程1");
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                print(2, 3);
            }
        }, "线程2");
        t2.start();
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                print(3, 1);
            }
        }, "线程3");
        t3.start();

    }

    public static void print(int now, int next) {
        while (num <= 75) {
            synchronized (obj) {
                while (curThread != now) {
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                for (int i = 1; i <= 5; i++) {
                    num++;
                    System.out.println(Thread.currentThread().getName() + "->" + num);
                }
                if (num == 75) {
                    System.exit(0);
                }
                curThread = next;
                obj.notifyAll();
//                obj.notify();
            }
        }
    }
}
