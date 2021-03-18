package JUnit;

import org.junit.Test;
import java.util.Date;

public class JUnitTest {

    @Test
    public void test1(){
        String s1 ="MM";
        String s2 ="MM";
        System.out.println(s1.equals(s2));
    }
    @Test
    public void test2(){
        System.out.println("test2");
    }

}
