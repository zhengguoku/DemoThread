import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author zhenggk22579
 * @Date 2021/3/30 16:33
 */

public class DemoThreadPool02 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程1" + Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程2" + Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程3" + Thread.currentThread().getName());
            }
        });

        executorService.shutdown();
    }
}
