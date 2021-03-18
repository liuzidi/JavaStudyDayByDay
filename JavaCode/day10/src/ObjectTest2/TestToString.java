package ObjectTest2;

import java.util.Date;

public class TestToString {
    public static void main(String []args){
        Person p1 =new Person();
        System.out.println(p1.toString());//ObjectTest2.Person@7ef20235
        System.out.println(p1);//ObjectTest2.Person@7ef20235

        String str ="lzd";
        System.out.println(str);//lzd

        Date date =new Date(1132332L);
        System.out.println(date);//Thu Jan 01 08:18:52 CST 1970
    }
}
class Person{
    int age;
    String name;
    public void eat(){
        System.out.println("eat");
    }
}

