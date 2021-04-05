package day24JavaTest;

import org.junit.Test;


import java.io.*;

/**
 * @author:liuzidi
 * @Description:
 * 自定义对象IO测试：需要满足要求才能序列化
 */
public class day24Test {
    @Test
    public  void test1() {
        ObjectOutputStream oos =null;
        try {
            oos =new ObjectOutputStream(new FileOutputStream("ok.dat"));
            oos.writeObject(new Person(28,"小明"));
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(oos != null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public  void test2() {
        ObjectInputStream ois =null;
        try {
            ois =new ObjectInputStream(new FileInputStream("ok.dat"));
            Object obj =ois.readObject();
            Person p =(Person)obj;
            System.out.println(p);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(ois != null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
class Person implements Serializable {
    public static final long serialVersionUID =55656L;
    int age;
    String name;
    Person(int age, String name){
        this.age=age;
        this.name =name;
    }
    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
