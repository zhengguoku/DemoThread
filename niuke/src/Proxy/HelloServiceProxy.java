package Proxy;

/**
 * @Author zhenggk22579
 * @Date 2021/4/15 14:23
 */

public class HelloServiceProxy implements HelloService {

    private HelloService target;
    public HelloServiceProxy(HelloService target){
        this.target = target;
    }
    @Override
    public void say() {
        System.out.println("记录日志");
        target.say();
        System.out.println("清理数据");
    }
}
