package day21.JavaTest;


import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author:liuzidi
 * @Description:
 */
public class MapTest {
    @Test
    public void test1(){
        Map map = new HashMap();
        map.put("AA",23);
        map.put("AA",43);     //key相同时替换
        map.put("sd",new Person());
        map.put(new Person(),new Person());//可以以Object对象作为key和value
        System.out.println(map);
        System.out.println(map.size());
        map.clear();
        System.out.println(map);
        System.out.println(map == null);
        System.out.println(map.size());
    }

}
class Person{
    public static int age =10;
    public Person(){
        age++;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age='" + age + '\'' +
                '}';
    }
}
