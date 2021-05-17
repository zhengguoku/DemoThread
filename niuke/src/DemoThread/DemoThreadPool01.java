package DemoThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author zhenggk22579
 * @Date 2021/3/30 16:26
 */

public class DemoThreadPool01 {
    public static void main(String[] args) {
        //创建线程池
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程1：" + Thread.currentThread().getName());

                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程2：" + Thread.currentThread().getName());
            }
        });
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程3：" + Thread.currentThread().getName());
            }
        });
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程4：" + Thread.currentThread().getName());
            }
        });
        executorService.shutdown();
    }
}
