package Test;

public class PersonTest {
     public static void main(String []args){
         Person lzd =new Person("lzd");
         lzd.sayName();

     }
}
class Person {
    String name;
    int age;
    //构造器
    public Person(){
        System.out.println("12");

    }
    public Person(String name){
        this.name= name;
    }
    public void sayName(){
        System.out.println(this.name);
    }

}
