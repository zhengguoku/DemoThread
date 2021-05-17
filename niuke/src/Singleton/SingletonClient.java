package Singleton;

/**
 * @Author zhenggk22579
 * @Date 2021/4/15 11:01
 */

public class SingletonClient {
    public enum SingletonE {
        INSTANCE;
    }
    public static void main(String[] args) {
//        Singleton singleton1 = Singleton.getInstance();
//        Singleton singleton2 = Singleton.getInstance();
        SingletonE singleton1 = SingletonE.INSTANCE;
        SingletonE singleton2 = SingletonE.INSTANCE;
        System.out.println(singleton1==singleton2);
    }
}
