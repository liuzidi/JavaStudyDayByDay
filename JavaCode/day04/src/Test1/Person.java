package Test1;

public class Person {
    int age;
    String name;
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

}
class TestTest{
    public static void main(String [] args){
        Person p1 = new Person();
        System.out.println(p1.age);
    }
}
