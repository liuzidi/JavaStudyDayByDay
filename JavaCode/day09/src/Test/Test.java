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

    }
}
