package Singleton;

/**
 * @Author zhenggk22579
 * @Date 2021/5/16 11:50
 *
 * 懒汉式单例
 */

public class SingletonDemon02 {
    public static void main(String args[]){
        Singleton02 instance02 = null;
        instance02 = Singleton02.getSingleton();
        instance02.print();
    }
}

class Singleton02{
    private static  Singleton02 singleton02;
    private Singleton02(){}
    public static Singleton02 getSingleton(){
        if (singleton02 == null){
            singleton02 = new Singleton02();
        }
        return singleton02;
    }
    public void print(){
        System.out.println("懒汉式单例模式");
    }
}