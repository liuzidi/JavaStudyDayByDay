package SingletonTest2;

public class SingletonTest2 {
    public static void main(String []args){

    }
}

//懒汉式单例模式：啥时候用啥时候造对象
class Order{
    private Order(){

    }
    private static Order instance =null;

    public static Order getInstance(){
        if(instance == null) {
            instance = new Order();
        }
        return instance;
    }

}