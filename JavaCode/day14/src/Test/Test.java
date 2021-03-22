package Test;

public class Test {
    public static void main(String [] args){
//      B b =new B();//abstract 类不能实例对象
        C c =new C();
        c.eat();
        System.out.println("--------");
        D d =new D();
        d.eat();
        /**
         * A is constructing
         * C is constructing
         * C is eating
         * --------
         * A is constructing
         * B is constructing
         * D is constructing
         * B is eating
         */
    }

}
abstract class A{
    A(){
        System.out.println("A is constructing");
    }
    public abstract  void  eat();

}

abstract class B extends A{
    B(){
        System.out.println("B is constructing");
    }
    public void eat(){
        System.out.println("B is eating");
    }

}

class C extends A{
    C(){
        System.out.println("C is constructing");
    }
    public void eat(){
        System.out.println("C is eating");
    }

}
class D extends B{
    D(){
        System.out.println("D is constructing");
    }
}
