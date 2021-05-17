package DemoThread;

/**
 * @Author zhenggk22579
 * @Date 2021/3/29 14:33
 */

public class DemoThread01 {
    public static void main(String[] args) {
        Thread t1 = new Mythread01();
        t1.start();
    }

}
class Mythread01 extends Thread {

    @Override
    public void run() {
        System.out.println("这是一个线程");
    }

}

