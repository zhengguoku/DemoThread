package Enum;

/**
 * @Author zhenggk22579
 * @Date 2021/5/16 14:31
 */

public class EnumDemo03 {
    public static void main(String[] args) {
        IMessage iMessage = Color03.RED;
        System.out.println(iMessage.getMessage());
    }
}

enum Color03 implements IMessage{
    RED("红色"), BULE("蓝色"), GREEN("绿色");
    private String title;

    private Color03(String title) {
        this.title = title;
    }

    public String toString() {
        return this.title;
    }

    @Override
    public String getMessage() {
        return this.title;
    }
}

interface IMessage{
    public String getMessage();
}