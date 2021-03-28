package BankTest;
/**
 * @author:liuzidi
 * @Description:
 * 懒汉式的线程安全问题解决
 */
public class BankTest {
    public static void main(String[] args) {
        T1 t1 =new T1();
        T2 t2 =new T2();
        T3 t3 =new T3();
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");
        t1.start();
        t2.start();
        t3.start();
        
    }
}
class Bank{
    private Bank(){
        System.out.println(Thread.currentThread().getName()+"进入单例对象");
    }
    private static Bank instance =null;
    public static Bank getInstance(){
        if (instance == null) {
            synchronized (Bank.class) {
                if(instance == null){

                    instance =new Bank();
                }
            }
        }
        return instance;
    }
    public void show(){
        System.out.println(Thread.currentThread().getName()+"ok");
    }
}
class T1 extends Thread{
    @Override
    public void run() {
        Bank b =Bank.getInstance();
        for (int i = 0; i < 10; i++) {
            b.show();
        }
    }
}
class T2 extends Thread{
    @Override
    public void run() {
        Bank b =Bank.getInstance();
        for (int i = 0; i < 10; i++) {
            b.show();
        }
    }
}
class T3 extends Thread{
    @Override
    public void run() {
        Bank b =Bank.getInstance();
        for (int i = 0; i < 10; i++) {
            b.show();
        }
    }
}
