package day24JavaTest2;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author:liuzidi
 * @Description:
 * 服务端和客户端通过网络链接
 */
public class TCPTest {
    @Test//客户端
    public void client(){
        Socket socket =null;
        OutputStream os = null;
        try {
            InetAddress inet =InetAddress.getByName("127.0.0.1");
            socket =new Socket(inet,8899);
            os= socket.getOutputStream();
            os.write("你好，服务器，我是客户端".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(os!=null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test//服务器
    public void server(){
        InputStream is = null;
        ByteArrayOutputStream baos = null;
        ServerSocket ss=null;
        Socket socket =null;
        byte[] buffer = new byte[0];
        try {
            ss=new ServerSocket(8899);
            socket= ss.accept();
            is = socket.getInputStream();
            baos = new ByteArrayOutputStream();
            buffer = new byte[5];
            int len;
            while((len =is.read(buffer)) != -1){
                baos.write(buffer,0,len);
            }
            System.out.println(baos.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(baos!=null){
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(ss!=null){
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
