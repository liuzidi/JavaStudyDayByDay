package StaticTest;

public class StaticTest {
    public static void main(String []args){
        Chinese c1 =new Chinese();
        Chinese c2 =new Chinese();
        Chinese c3 =new Chinese();
        Chinese.nation ="China";
        System.out.println(c2.nation);
    }
}
class Chinese{
    int age;
    String name;
    static String nation;
}
