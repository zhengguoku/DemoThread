package Enum;

/**
 * @Author zhenggk22579
 * @Date 2021/5/16 12:40
 */

public class EnumDemo01 {
    public static void main(String[] args) {
        for (Color01 c : Color01.values()){
            System.out.println(c.ordinal()+" - "+c.name());
        }
    }
}

enum Color01{
    RED,BULE,GREEN;
}