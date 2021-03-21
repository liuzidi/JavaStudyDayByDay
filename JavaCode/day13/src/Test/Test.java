package Test;

public class Test {
    public static void main(String []args){
//        Leaf.age=3;//加载类时，会从最顶端的父类的静态代码块到当前类的静态代码块全部执行
        System.out.println("--------------");
        Leaf l= new Leaf();

    }
}

class Root{
    Root(){
        System.out.println("Root构造器");
    }

    {
        System.out.println("Root非静态代码块");
    }

    static{
        System.out.println("Root静态代码块");
    }

}
class Mid extends Root{
    Mid(){
        System.out.println("Mid构造器");
    }
    {
        System.out.println("Root非静态代码块");
    }
    static{
        System.out.println("Root静态代码块");
    }

}
class Leaf extends Mid{
    Leaf(){
        System.out.println("Leaf构造器");
    }
    {
        System.out.println("Leaf非静态代码块");
    }
    static{
        System.out.println("Leaf静态代码块");
    }
    static int age ;

}
