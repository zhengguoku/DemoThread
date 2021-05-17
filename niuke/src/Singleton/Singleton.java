package Singleton;

/**
 * @Author zhenggk22579
 * @Date 2021/4/15 11:00
 */

public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }
}
