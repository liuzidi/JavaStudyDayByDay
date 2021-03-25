package SuperTest;

public class Person {
    private int age;
    private String name;
    public Person(int age){
        this.age = age;
        System.out.println("age="+this.age);
    }
    public Person(){
        System.out.println("调用Person类默认构造器");
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
