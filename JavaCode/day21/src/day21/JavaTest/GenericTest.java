package day21.JavaTest;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @author:liuzidi
 * @Description:
 */
class People{
    int age;
    String name;
    People(int age,String name){
        this.age=age;
        this.name=name;
    }

    public void show(){
        System.out.println(age);
        System.out.println(name);
    }

    @Override
    public String toString() {
        return "People{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
public class GenericTest {
    @Test
    //在集合中使用泛型
    public void test1(){
        ArrayList list =new ArrayList();
        list.add(78);
        list.add(65);
        list.add(new People(13,"liuzidi"));
        System.out.println(list.size());
        for(Object o :list){
            if (o instanceof Integer) {
                System.out.println(o);
            }
        }
    }
    //集合中使用泛型
    @Test
    public void test2(){
        ArrayList<Integer>list = new ArrayList<Integer>();
        list.add(56);
        list.add(59);
        list.add(89);
        //list.add(new People(13,"zddf"));

    }

    @Test
    public void test3(){

    }
}
