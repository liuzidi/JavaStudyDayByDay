package Test;

public class Test {
    public static void main(String []args){
        showEat(new Person());//非匿名类的匿名对象

        Person p1 =new Person();
        showEat(p1);//非匿名类的非匿名对象：名字为p1

        //创建了一个匿名子类的对象 p：只能在抽象类进行抽象类的重写,重写但不调用
        Worker w= new Worker(){
            public void testMethod(){
                System.out.println("worker");
            }
        };
        w.testMethod();
    }
    public static void showEat(Person p){
        p.eat();
    }
}

class Person{
    int age;
    String name;
    public void eat(){
        System.out.println("Person eat");
    }

}
 abstract class Worker{
    public abstract void testMethod();

 }
