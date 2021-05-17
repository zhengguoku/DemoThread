package Test;

import java.util.ArrayList;

/**
 * @Author zhenggk22579
 * @Date 2021/3/30 10:24
 */

public class lottery {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
//        int num1 = (int)(Math.random()*10);
        int num1 = 35;
        for (int i = 1; i<=num1;i++){
            list1.add(i);
        }
        for (int i = 0;i<5;i++){
            int val = (int)(Math.random()*list1.size());
            Object obj = list1.get(val);
            list1.remove(obj);
            System.out.print(obj);
            System.out.print(" ");
        }

//        System.out.println();

    }
}
