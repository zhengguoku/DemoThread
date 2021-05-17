package Proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author zhenggk22579
 * @Date 2021/4/15 14:33
 */

class HelloServiceProxyTest {
    @Test
    public void testProxy(){
        HelloService target = new HelloServiceImpl();
        HelloServiceProxy proxy = new HelloServiceProxy(target);
        proxy.say();
    }

}