package InterfaceTest;


//接口和类是并列的结构

import javax.swing.*;

public class Interface {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);
        //Flyable.MIN_SPEED = 2; 默认为final无法赋值

    }
}

interface Flyable{
    //全局变量
    public static final int MAX_SPEED =7900;//第一宇宙速度
    int MIN_SPEED = 0;//省略了public static final
    //抽象方法
    public abstract void fly();
    void stop();//省略了public abstract
}
interface Attackable{
    void attack();
}
class Plane implements Flyable{
    public void fly(){
        System.out.println("飞机起飞");

    }
    public void stop(){
        System.out.println("飞机停止");
    }
}

class Kite implements Flyable{
    public void fly(){
        System.out.println("风筝起飞");

    }
    public void stop(){
        System.out.println("风筝停了");

    }
}
class Bullet implements Flyable,Attackable{
    public void fly(){
        System.out.println("风筝起飞");

    }
    public void stop(){
        System.out.println("风筝停了");

    }
    public void attack(){
        System.out.println("子弹具有攻击性");
    }
}
