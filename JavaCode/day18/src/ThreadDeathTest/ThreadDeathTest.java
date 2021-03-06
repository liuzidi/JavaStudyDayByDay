package ThreadDeathTest;

/**
 * @author:liuzidi
 * @Description:
 * 死锁：DeadLock
 */
public class ThreadDeathTest {
    public static void main(String[] args) {
        StringBuffer s1 =new StringBuffer();
        StringBuffer s2 =new StringBuffer();
/**
 * s1 和 s2 可能发生死锁，都在等待对方放弃自己需要的同步资源不放弃，形成了线程的死锁
 */

        new Thread(){
            @Override
            public void run() {
                synchronized(s1){
                    s1.append("a");
                    s2.append("1");
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (s2){
                        s1.append("b");
                        s2.append("2");
                        System.out.println(s1);
                        System.out.println(s2);
                    }
                }
            }
        }.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized(s2){
                    s1.append("c");
                    s2.append("3");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (s1){
                        s1.append("d");
                        s2.append("4");
                        System.out.println(s1);
                        System.out.println(s2);
                    }
                }
            }
        }).start();
    }
}
