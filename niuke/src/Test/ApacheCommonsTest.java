package Test;

import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.functors.InvokerTransformer;

/**
 * @Author zhenggk22579
 * @Date 2021/4/16 11:09
 */

public class ApacheCommonsTest {
    public static void main(String[] args) {
        Transformer transformer = new InvokerTransformer("exec",new Class[]{String.class},new Object[]{"C:\\Windows\\System32\\calc.exe"});
        transformer.transform(Runtime.getRuntime());
    }
}
