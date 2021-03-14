package OrderTest;


import OverRideTest.OverRideTest;
//import 包名 .  （public开头）类名

public class OrderTest extends OverRideTest {
    public static void main(String[] args) {

        OrderTest o =new OrderTest();
        o.superPublic();
        o.superProtected();
       //就近原则 显示Students类的重写方法
        o.show();
    }
}
