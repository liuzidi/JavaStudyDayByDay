package Test;

public class ThisTest {
    public static void main(String[]args){
        man man1= new man();
        System.out.println("..........");
        man man2 =new man(13);
        System.out.println("..........");
        man man3 =new man(12,"liuzidi");
    }

}

class man<main> {
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
        this(age);
        setName(name);
        System.out.println("name="+this.name);
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
//sout 快捷键：System.out.println()
//psvm 快捷键：public static void main(String[]args){}
//fori 快捷键：for循环


