/**
 * @Author zhenggk22579
 * @Date 2021/3/30 14:34
 * 死锁
 */

public class DemoThread13 {
    private static Object objA = new Object();
    private static Object objB = new Object();

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (objA){
                    System.out.println(1);
                    synchronized (objB){
                        System.out.println(2);
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (objB){
                    System.out.println(3);
                    synchronized (objA){
                        System.out.println(4);
                    }
                }
            }
        }).start();
    }
}
