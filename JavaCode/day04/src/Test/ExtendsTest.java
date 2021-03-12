package Test;
public class ExtendsTest {
    public static void main(String [] args){
        Student s = new Student();
        s.eat();
        System.out.println(s.age);//3：子类中定义的构造器初始化的内容
        //子类的构造器优先级比父类的高
    }
}
