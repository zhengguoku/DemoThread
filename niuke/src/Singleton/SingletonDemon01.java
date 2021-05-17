package Singleton;

/**
 * @Author zhenggk22579
 * @Date 2021/5/16 11:50
 *
 * 饿汉式单例
 */

public class SingletonDemon01 {
    public static void main(String args[]){
        Singleton01 instance = null;
        instance = Singleton01.getSingleton();
        instance.print();
    }
}

class Singleton01{
    private static final Singleton01 SINGLETON = new Singleton01();
    private Singleton01(){}
    public static Singleton01 getSingleton(){
        return SINGLETON;
    }
    public void print(){
        System.out.println("饿汉式单例模式");
    }
}