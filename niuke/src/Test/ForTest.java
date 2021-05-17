package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @Author zhenggk22579
 * @Date 2021/4/14 14:03
 */

public class ForTest {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("zzzzz");
        list.add("ddddd");
        list.add("222222");
//        for (int i = 0; i <= list.size(); i++) {
//            System.out.println(list.size());
//            System.out.println(list);
//            list.remove(i);
//        }
        for (String s : list) {
            if ("zzzzz".equals(s)) {
                list.remove(s);
            }
        }
        System.out.println(list);
    }
}
