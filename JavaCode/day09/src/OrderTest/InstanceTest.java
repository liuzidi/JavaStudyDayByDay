package OrderTest;

public class InstanceTest {
    Person p =new Man(4);
    Person p1 = new Person();
    public void showGetClass(){
        TestTest t =new TestTest();
        System.out.println(t.getClass());
    }
}
class TestTest{

}
class Run{
    public static void main(String []args){
        InstanceTest i =new InstanceTest();
        System.out.println("............");
        i.showGetClass();

        System.out.println("............");
    }
}
