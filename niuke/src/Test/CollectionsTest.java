package Test;

import org.apache.commons.collections4.CollectionUtils;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author zhenggk22579
 * @Date 2021/4/13 16:46
 */

public class CollectionsTest {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        CollectionUtils.addIgnoreNull(list,null);
        CollectionUtils.addIgnoreNull(list,"a");
        System.out.println(list);
        if (list.contains(null)){
            System.out.println("Null value is present");
        }else {
            System.out.println("Null value is not present");
        }

    }
}
