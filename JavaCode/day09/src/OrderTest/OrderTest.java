package OrderTest;

public class OrderTest {
    public static void main(String []args){
        Person p1 =new Man(3);
        Person p2 =new Woman();
        p1.eat();
        p2.eat();
        System.out.println("-----------------");
        Man m1 =(Man)p1;
        Woman m2 =(Woman)p2;
        System.out.println(m1==p1);//m1和p2是指向同一个对象
        Person p3 =(Person)m1;
        System.out.println(m1==p1);//m1和p2是指向同一个对象
        //子父类可以用关键符进行强行转换
        if(p1 instanceof Person){
            System.out.println("p1 is an object of Person");

        }
        if(m1 instanceof Person){
            System.out.println("m1 is an object of Person");
        }
        if(p1 instanceof Man){
            System.out.println("p1 is an object of Man");
        }
//        if(m2 instanceof Man){
//            System.out.println("m2 is an instance of Man");
//        }//如果明显类之间不匹配则直接编译就不通过


    }
}
