package DemoThread;

/**
 * @Author zhenggk22579
 * @Date 2021/3/30 9:50
 * 等待当前代码的结束
 * */

public class DemoThread07 {
    public static void main(String[] args) {
        Thread downLoadThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 1;i<= 10;i++){
                    System.out.println("已经下载了：" + (i * 10) + "%");
                    try {
                        Thread.sleep(500);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        });
        downLoadThread.start();
        Thread showThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    downLoadThread.join();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("显示图片");
            }
        });
        showThread.start();

    }
}
