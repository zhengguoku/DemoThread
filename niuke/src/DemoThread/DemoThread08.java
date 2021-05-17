package DemoThread;

/**
 * @Author zhenggk22579
 * @Date 2021/3/30 10:05
 * 守护线程
 */

public class DemoThread08 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("守护进程");
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

       // t1.setDaemon(true);
        t1.start();
        try {
            Thread.sleep(2000);

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("主线程结束了");


    }
}
