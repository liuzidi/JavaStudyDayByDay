package SuperTest;


public class Students extends Person{
    public Students (int age , String name){
        super(age);
        super.setName(name);
    }
    public Students(){
//        super.age=1;
        //子类无法用super. 属性的方式来调用父类private属性
    }
}
