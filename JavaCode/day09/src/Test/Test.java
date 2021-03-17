package Test;

import java.sql.SQLOutput;

public class Test {
    int age;
}
class TestTest {
    public void showSth(int age){
        Test t =new Test();
        t.age=age;
        Test t1 =t;
        System.out.println(t.hashCode());
        System.out.println(t1.hashCode());
    }
}
class TestTestTest{
    public static void main(String []args){
        TestTest ttt= new TestTest();
        ttt.showSth(3);
        //66386784
        //66386784
        String str1= new String("ok");
        String str2= new String("ok");
        String str3 ="ok";
        String str4  ="ok";
        System.out.println(str1.equals(str2));//true
        System.out.println("---------");
        System.out.println(str1==str2);//false
        System.out.println(str1==str3);//false
        System.out.println(str2==str3);//false
        System.out.println(str3==str4);//true

    }
}
