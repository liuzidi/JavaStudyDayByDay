package day22.javaTest3;

import org.junit.Test;
import java.util.*;


/**
 * @author:liuzidi
 * @Description:
 */
public class GenericTest {
    @Test
    public void test1(){
        List<String> list1 =null;
        List<String> list2 =null;
        List<String> list3 =null;

        list3 =list1;
        list3 =list2;
        //list2 =list3;
        List<String>list4 =new ArrayList<>();
        list4.add("?");
        list3=list4;
    }
}
