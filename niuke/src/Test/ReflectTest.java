package Test;

/**
 * @Author zhenggk22579
 * @Date 2021/4/14 17:37
 */

public class ReflectTest {
    public static void main(String[] args) {
        fruit f = Factory.getInstance("Test.Apple");
        if (f != null) {
            f.eat();
        }
    }
}
class Apple implements fruit {
    @Override
    public void eat() {
        System.out.println("Apple");
    }
}
class Orange implements fruit{
    @Override
    public void eat() {
        System.out.println("Orange");
    }
}
class Factory {
    public static fruit getInstance(String ClassName) {
        fruit f = null;
        System.out.println(ClassName);
        try {
            f = (fruit) Class.forName(ClassName).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
}
