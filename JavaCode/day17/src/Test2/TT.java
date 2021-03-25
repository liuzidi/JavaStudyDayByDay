package Test2;

/**
 * @author:liuzidi
 * @Description:
 * 使用Runnable接口继承
 * 这种方式的优点：用接口的方式进行可以让实现类从应有的父类中继承，多个对象可以共享数据;
 */
public class TT implements Runnable {
    private  int total=100;
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
class ThreadTest2 extends TT {
    public static void main(String[] args) {
        TT t =new TT ();
        Thread t1 =new Thread(t);
        Thread t2 =new Thread(t);
        Thread t3 =new Thread(t);
        t1.start();
        t2.start();
        t3.start();
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
    }
}
