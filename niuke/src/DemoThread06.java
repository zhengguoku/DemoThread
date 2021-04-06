/**
 * @Author zhenggk22579
 * @Date 2021/3/30 9:21
 * 当前线程休眠指定毫秒数
 */

public class DemoThread06 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName() + "->" + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "线程1").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName() + "->" + i);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }, "线程2").start();
    }
}
