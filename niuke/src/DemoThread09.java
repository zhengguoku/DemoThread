/**
 * @Author zhenggk22579
 * @Date 2021/3/30 11:06
 * 获取线程的状态
 *  * State getState():获取线程的状态
 * NEW
 * 线程实例化后还从未执行start()方法时的状态
 * RUNNABLE:
 * runnable状态是线程进入运行的状态
 * BLOCKED:
 * 某一个线程在等待锁的时候的状态
 * WAITING
 * 是线程执行了Object.wait()方法后所处的状态
 * TIMED_WAITING
 * 代表线程执行了Thread.sleep()方法，呈等待状态，等待时间到达，继续向下运行。
 * TERMINATED
 * 终结
 */

public class DemoThread09 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程执行。。。");
            }
        });
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        Thread.sleep(2000);
        System.out.println(t1.getState());
    }

}
