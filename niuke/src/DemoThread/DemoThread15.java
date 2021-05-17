package DemoThread;

/**
 * @Author zhenggk22579
 * @Date 2021/3/30 15:34
 */

public class DemoThread15 {
    public static void main(String[] args) {
        Object obj = new Object();
        Thread downLoadThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++){
                    System.out.println("已经下载了：" + (i*10) + "%");
                    try {
                        Thread.sleep(500);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                synchronized (obj){
                    obj.notifyAll();
                }
            }
        });
        downLoadThread.start();
        Thread showThread = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj){
                    try {
                        obj.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println("显示图片");
            }
        });
        showThread.start();
    }
}
