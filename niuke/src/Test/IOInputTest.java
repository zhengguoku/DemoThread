package Test;

import java.io.*;

/**
 * 字节流转成字符流
 * @Author zhenggk22579
 * @Date 2021/4/14 16:02
 */

public class IOInputTest {
    public static void main(String[] args) throws IOException {
        File f = new File("test.txt");
        InputStreamReader inr = new InputStreamReader(new FileInputStream(f),"UTF-8");
        char [] buf = new char[1024];
        int len = inr.read(buf);
        System.out.println(new String(buf,0,len));

        inr.close();
    }
}
