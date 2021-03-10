package javastudy;

public class anonymousTest {
    public static  void main (String[] args){
        PhoneUsed test= new PhoneUsed();
        test.showPhone(new Phone());
        /* 匿名对象只能使用一次 */
        new Phone().playGame();
    }
}



class Phone {

    double price;
    public void playGame(){
        System.out.println("我在玩游戏");
    }

}
 class PhoneUsed{
    public void showPhone(Phone p){
        p.playGame();

    }
}
