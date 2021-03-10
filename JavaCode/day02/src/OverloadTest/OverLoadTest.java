package OverloadTest;

public class OverLoadTest {
    public static void main(String []args){
        int i =3 ;
        String s ="sss";
        OverLoad x =new OverLoad();
        x.showSth(s);
        x.showSth(i);
    }
}
class OverLoad{
    public void showSth(String s){
        System.out.println("这是一个字符串，内容是"+s);
    }
    public void showSth(int i){
        System.out.println("这是一个整数，内容是"+i);
    }
}

