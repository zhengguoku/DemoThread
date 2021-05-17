package Enum;

/**
 * @Author zhenggk22579
 * @Date 2021/5/16 12:42
 */

public class EnumDemo02 {
    public static void main(String[] args) {
        for (Color02 c : Color02.values()) {
            System.out.println(c.ordinal() + " - " + c.name() + " - " + c);
        }
    }
}


enum Color02 {
    RED("红色"), BULE("蓝色"), GREEN("绿色");
    private String title;

    private Color02(String title) {
        this.title = title;
    }

    public String toString() {
        return this.title;
    }
}