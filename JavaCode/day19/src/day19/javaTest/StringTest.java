package day19.javaTest;


import org.junit.Test;

import java.util.Arrays;

public class StringTest {

    @Test
    public  void test1() {
        String str1 = "123a";
        byte[] b =str1.getBytes();
        byte[] b2 =b;
        System.out.println(Arrays.toString(b));
    }
}




