package Test;

import java.io.*;
import java.util.Properties;

/**
 * @Author zhenggk22579
 * @Date 2021/4/14 19:40
 */

public class IocReflectTest {
    public static void main(String[] args) throws IOException {
        Properties pro = init.getPro();
        fruit f = Factory.getInstance(pro.getProperty("orange"));
        if (f!=null){
            f.eat();
        }

    }
}
class init{
    public static Properties getPro() throws IOException {
        Properties pro = new Properties();
        File f = new File("src/resource/fruit.properties");
        if (f.exists()){
            pro.load(new FileInputStream(f));
        }else {
            pro.setProperty("apple","Test.Apple");
            pro.setProperty("orange","Test.Orange");
            pro.store(new FileOutputStream(f),"FRUIT CLASS");
        }
        return pro;
    }
}