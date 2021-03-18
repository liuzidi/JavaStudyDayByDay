package ObjectTest2;

public class Test2 {
    int age;
    int grade;
    String name;

    public Test2(int age, int grade, String name) {
        this.age = age;
        this.grade = grade;
        this.name = name;
    }
   @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o instanceof Test2){
            return this.age==((Test2) o).age && this.grade==((Test2)o).grade && this.name.equals(((Test2)o).name);
        }
        return false;
    }
}
    class TestTestTest{
    public static void main(String []args){
        Test2 t1=new Test2(1,2,"liuzidi");
        Test2 t2=new Test2(1,2,"liuzidi");
        System.out.println(t1==t2);//false
        System.out.println(t1.equals(t2));//true
        //equals对Test类的equals方法进行重写
    }
}