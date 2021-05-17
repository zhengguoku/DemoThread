package DemoThread;

/**
 * @Author zhenggk22579
 * @Date 2021/3/29 15:19
 * 获取当前代码块片段的线程
 */

public class DemoThread03 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t1 run方法中的线程:" + Thread.currentThread());
            }
        });
        t1.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t2 run方法中的线程:" + Thread.currentThread());
            }
        });
        t2.start();
        method01();
        method02();
    }

    public static void method01() {
        System.out.println("方法1中的线程：" + Thread.currentThread());
    }

    public static void method02() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("方法2中的线程：" + Thread.currentThread());
            }
        }).run();

    }
}
