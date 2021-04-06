import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author zhenggk22579
 * @Date 2021/3/30 15:50
 * 生产者消费者
 */

public class DemoThread16 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1;i <= 4; i++) {
                    synchronized (queue) {
                        while (queue.size() == 1) {
                            System.out.println("通知消费者进行消费...");
                            try {
                                queue.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.println("生产了：" + i);
                        queue.offer(i);
                        queue.notifyAll();
                    }
                }
            }
        },"生产者").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    synchronized (queue){
                        while (queue.size() == 0){
                            System.out.println("缓冲区为空，等待生产者生产...");

                            try {
                                queue.wait();
                            }catch (InterruptedException e){
                                e.printStackTrace();
                            }
                        }

                        int num = queue.poll();
                        queue.notifyAll();

                        System.out.println("消费了元素：" + num);
                        if (num == 4){
                            break;
                        }
                    }
                }
            }
        },"消费者").start();
    }
}
