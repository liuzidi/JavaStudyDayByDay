package OverRideTest;

public class OverRideTest {
    public static void main(String[]args){

    }
}
//子类重写的权限修饰符不小于父类被重写的方法的权限修饰符
class Person{
    int age;
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

}