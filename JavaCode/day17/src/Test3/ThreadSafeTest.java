package Test3;

/**
 * @author:liuzidi
 * @Description:
 * 采用同步锁完成线程安全的问题；
 * 某个线程在操作共享数据的过程中，操作尚未完成时，其他线程参与进来，导致了不安全的操作
 * 解决方案：线程完成操作后，其他线程才能进去，即使这个线程现在被阻塞了
 */
public class ThreadSafeTest implements Runnable {
    private static int total = 1000;
    public Object obj = new Object();

    @Override
    /**
     * 线程安全问题的解决
     */
    public void run() {
        while (true) {
            synchronized (obj) {
                if (total > 0) {
                    total--;
                    System.out.println(Thread.currentThread().getName() + "卖出一张票，还剩下" +
                            (total) + "张票");
                } else {
                    break;
                }
            }
        }
    }
}
class ThreadTest11 extends ThreadSafeTest {
    public static void main(String[] args) {
        ThreadSafeTest t  =new ThreadSafeTest();
        Thread tt1 =new Thread(t);
        Thread tt2 =new Thread(t);
        Thread tt3 =new Thread(t);
        tt1.start();
        tt2.start();
        tt3.start();
        tt1.setName("窗口1");
        tt2.setName("窗口2");
        tt3.setName("窗口3");
    }
}
