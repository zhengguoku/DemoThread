package Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @Author zhenggk22579
 * @Date 2021/4/14 16:06
 */

public class IOOutTest {
    public static void main(String[] args) throws IOException {
        File f = new File("test.txt");

        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(f),"UTF-8");

        osw.write("我是字符流转换成字节流输出的");

        osw.close();
        System.out.println();
    }
}
