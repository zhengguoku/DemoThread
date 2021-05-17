package Proxy;

/**
 * @Author zhenggk22579
 * @Date 2021/4/15 14:22
 */

public class HelloServiceImpl implements HelloService {
    @Override
    public void say() {
        System.out.println("hello world!");
    }
}

