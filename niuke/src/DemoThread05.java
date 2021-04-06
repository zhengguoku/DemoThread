/**
 * @Author zhenggk22579
 * @Date 2021/3/30 9:16
 * 测试线程是否处于活跃状态
 */

public class DemoThread05 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("这是一个线程。。。");
            }
        });
        System.out.println("1" + t1.isAlive());

        t1.start();
        System.out.println("2" + t1.isAlive());
    }
}
