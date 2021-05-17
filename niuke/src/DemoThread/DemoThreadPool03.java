package DemoThread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Author zhenggk22579
 * @Date 2021/3/30 16:42
 */

public class DemoThreadPool03 {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("5s后开始执行，每3秒执行一次");
            }
        },5,3, TimeUnit.SECONDS);
//        scheduledExecutorService.shutdown();
    }

}
