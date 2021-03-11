package Test;

public class ThisTest {
    public static void main(String[]args){

    }
}

class man{
    private String name;
    private int age;

    public man(){
        System.out.println("进入man无参数默认构造器");
    }
    public man(int age){
        this();   //用this调用构造器，系统识别出为无参数形式地构造器
        setAge(age);
        System.out.println("age="+this.age);
    }
    public man(int age, String name){

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

}