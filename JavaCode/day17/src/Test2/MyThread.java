package Test2;

/**
 * @author:liuzidi
 * @Description:
 * 三个窗口同时卖票，共100张，卖完即止
 */
public class MyThread extends Thread{
    private static int total=100;
    @Override
    /**
     * 存在线程安全问题
     */
    public void run() {
        while(true){
            if(total>0){
                total--;
                System.out.println(Thread.currentThread().getName()+"卖出一张票，还剩下"+
                        (total)+"张票");
            }
            else{
                break;
            }
        }
    }
}
class ThreadTest1 extends MyThread{
    public static void main(String[] args) {
        MyThread t1  =new MyThread();
        MyThread t2  =new MyThread();
        MyThread t3  =new MyThread();
        t1.start();
        t2.start();
        t3.start();
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
    }
}
