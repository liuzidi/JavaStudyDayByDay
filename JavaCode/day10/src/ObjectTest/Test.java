package ObjectTest;

public class Test {
    int age;
    int grade;
    public Test(int age,int grade){
        this.age=age;
        this.grade=grade;
    }
}
class TestTestTest{
    public static void main(String []args){
        String str1= new String("ok");
        String str2= new String("ok");
        String str3 ="ok";
        String str4  ="ok";
        Test t1=new Test(1,2);
        Test t2=new Test(1,2);
        System.out.println("----------------");
        System.out.println(str1==str2);//false
        System.out.println(str1.equals(str2));//true
        // (equals()对String引用变量进行了重写)
        System.out.println(str1==str3);//false
        System.out.println(str1.equals(str3));//true
        System.out.println(str2==str3);//false
        System.out.println(str2.equals(str3));//true
        System.out.println(str3==str4);//true
        // (只有不是通过new方式的，而是通过常量池的String才会true)
        System.out.println(str3.equals(str4));//true
        System.out.println(t1==t2);//false
        System.out.println(t1.equals(t2));//false
        //equals并未对Test类的equals方法进行重写
    }
}