package Test;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.*;


/**
 * @Author zhenggk22579
 * @Date 2021/4/16 17:10
 */

public class ThreadDateTest {
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private static ThreadFactory namedThreadFactory = new ThreadFactoryBuilder().setNameFormat("demo-pool-%d").build();

    private static ExecutorService pool = new ThreadPoolExecutor(5, 200, 0L, TimeUnit.MILLISECONDS,
            new LinkedBlockingDeque<Runnable>(1024),namedThreadFactory,new ThreadPoolExecutor.AbortPolicy());

    private static CountDownLatch countDownLatch = new CountDownLatch(100);

    public static void main(String[] args) throws InterruptedException {
        Set<String> dates = Collections.synchronizedSet(new HashSet<String>());
        for (int i = 0;i<100;i++){
            Calendar calendar = Calendar.getInstance();
            int finalI = i;
            pool.execute(()->{
                calendar.add(Calendar.DATE, finalI);
                synchronized (simpleDateFormat){

                    String dateString = simpleDateFormat.format(calendar.getTime());
                    dates.add(dateString);
                }

                countDownLatch.countDown();
            });
        }
        countDownLatch.await();
        System.out.println(dates.size());
    }
}
