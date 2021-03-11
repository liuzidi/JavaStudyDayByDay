package Test;

public class JavaBean {
    public static void main(String []args){
        System.out.println("helloWorld");
    }
}

/**
 * JavaBean是一种Java语言写成的可重用组件
 * 所谓javaBean，是指符合以下标准的Java类：
 * 1.类是公共的
 * 2.有一个无参数的公共的构造器
 * 3.有属性，且对应上午get和set方法
 */
class person{
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String n){
        name= n;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age= a;
    }
}
