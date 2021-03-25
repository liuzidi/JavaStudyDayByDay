package Test;

/**
 * @author:liuzidi
 * @Description:
 * 多线程
 */
public class MyThread extends Thread {
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"thread1");
        }
    }
}
 class ThreadTest{
     public static void main(String[] args) {
         //主线程中创建一个新的线程
         MyThread t1 =new MyThread();
         t1.start();//start只能进行一次，否则会由IllegalThreadException的异常
         //主线程接着进行
         for (int i = 0; i < 100; i++) {
             System.out.println(Thread.currentThread().getName()+"main");
         }
     }
 }
