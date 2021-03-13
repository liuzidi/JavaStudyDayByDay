package OverRideTest;

public class OverRideTest {
    public static void main(String[]args){
    Students s1 = new Students();
    s1.showSuperPrivate();
    s1.showSuperNo();
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
    private void superPrivate(){
        System.out.println("这是父类Person的私有方法");
    }
    void superNO(){
        System.out.println("这是父类Person的缺省方法");
    }
    protected void superProtected(){
        System.out.println("这是父类Person的保护方法");
    }

    public void superPublic(){
        System.out.println("这是父类Person的公共方法");
    }
}
class Students extends Person{
    //重写方法
    private void superPrivate(){
        System.out.println("这是子类Students的重写私有方法");
    }
    public void showSuperPrivate(){
        superPrivate();
    }
    private void superNo(){
        System.out.println("这是子类Students的重写缺省方法");
    }
    public void showSuperNo(){
        superNo();
    }
}
//dfsafsadfdsfsdaf