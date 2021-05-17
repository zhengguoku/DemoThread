package Test;

/**
 * @Author zhenggk22579
 * @Date 2021/4/20 19:18
 */

public class VolatileTest {
    public static volatile int race = 0;

    public static void increase() {
        synchronized (VolatileTest.class) {
            race++;
        }
    }

//    public static synchronized void increase() {
//        race++;
//    }

    private static final int THREADS_COUNT = 20;

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[THREADS_COUNT];
        for (int i = 0; i < THREADS_COUNT; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 10000; i++) {
                        increase();
                    }

                }
            });
            threads[i].start();
        }
        while (Thread.activeCount() > 2)
            Thread.yield();

        System.out.println(race);
    }
}
