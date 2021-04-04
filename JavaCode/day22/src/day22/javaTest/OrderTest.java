package day22.javaTest;

import jdk.jfr.StackTrace;
import org.junit.Test;

/**
 * @author:liuzidi
 * @Description:
 */

public class OrderTest {
    public static void main(String[]args){
        Order o1 =new Order();
        o1.setOrder(12);
        System.out.println(o1);
        Order<String> o =new Order<String>();
        o.setOrder("sfd");
        System.out.println(o);
    }
    @Test
    public void test1(){

    }
}
 class Order<T>{
    T OrderT;
    void setOrder(T orderT){
        this.OrderT=orderT;
    }

     @Override
     public String toString() {
         return "Order{" +
                 "OrderT=" + OrderT +
                 '}';
     }
     //静态方法中不能指定泛型类
     //泛型方法可以声明为静态的
 }

