/**
 * @Author zhenggk22579
 * @Date 2021/3/29 15:52
 * 获取/设置线程的名字
 */

public class DemoThread04 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程名：" + Thread.currentThread().getName());
            }
        });
        t1.setName("线程1");
//        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程名："+Thread.currentThread().getName());
            }
        },"线程2");
        t2.start();

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程名："+Thread.currentThread().getName());
            }
        },"线程3");
        t3.start();

        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程名："+Thread.currentThread().getName());
            }
        },"线程4");
        t4.start();

        Thread t5 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程名："+Thread.currentThread().getName());
            }
        },"线程5");
        t5.start();
        t1.start();

    }

}

