package Exception;

/**
 * @Author zhenggk22579
 * @Date 2021/5/16 15:51
 */

public class ExceptionDemo01 {
    public static void main(String[] args) {
        try {
            System.out.println(MyMath.div(10,0));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class MyMath {
    public static int div(int x, int y) throws Exception {
        int temp = 0;
        System.out.println("*** 【START】除法计算开始 ***");
        try {
            temp = x/y;

//        }catch (Exception e){
//            throw e;
        }finally {
            System.out.println("*** 【START】除法计算结束 ***");
        }
        return temp;
    }
}