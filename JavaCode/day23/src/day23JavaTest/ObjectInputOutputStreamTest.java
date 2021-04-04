package day23JavaTest;

import org.junit.Test;

import java.io.*;

/**
 * @author:liuzidi
 * @Description:
 * IO流和网络编程
 */
public class ObjectInputOutputStreamTest {
    @Test//序列化的过程
    public void test1()  {
        ObjectOutputStream oos =null;
        try {
            oos =new ObjectOutputStream(new FileOutputStream(("object.dat")));
            oos.writeObject(new String("我爱Java"));
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(oos!= null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void test2(){
        ObjectInputStream ois =null;

        try {
            ois =new ObjectInputStream(new FileInputStream("object.dat"));
            Object obj =ois.readObject();
            String str =(String)obj;
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois!=null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
