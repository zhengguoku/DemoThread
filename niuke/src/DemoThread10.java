/**
 * @Author zhenggk22579
 * @Date 2021/3/30 13:41
 * 同步代码块
 */

public class DemoThread10 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread(),"线程1");
        Thread t2 = new Thread(new MyThread(),"线程2");
        t1.start();
        t2.start();
    }
}

class MyThread implements Runnable{

    private  Object objA = new Object();
    private static Object objB = new Object();
    @Override
    public void run() {
        synchronized (objB){
            for (int i = 0; i < 5; i++){
                System.out.println(Thread.currentThread().getName()+"->"+i);
            }
        }

    }
}