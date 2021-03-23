package JDK8Interface;

interface InterfaceTestTestA{
    public static void method1(){
        System.out.println("Interface 1");
    }
    public default void method2(){
        System.out.println("Interface 2");
    }
}

class SuperClass  {
    public void method2(){
        System.out.println("SuperClass 2");
    }
}
class SubClass extends SuperClass implements InterfaceTestTestA{
    public void myMethod(){
        method2();//调用自己定义的重写的方法
        super.method2();//调用的是父类中声明
        InterfaceTestTestA.super.method2();//调用接口中的默认方法
    }
}
public class TestTest{
    public static void main(String[] args) {
        SubClass s =new SubClass();
        s.myMethod();
    }
}