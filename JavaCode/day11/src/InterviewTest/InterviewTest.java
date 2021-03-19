package InterviewTest;
import org.junit.Test;

public class InterviewTest {
    @Test
    public void test1(){
        Object o1 =true? 1 :2.0;
        System.out.println(o1);//1.0
        //编译器会优先转化为最高精度的数字表达方式，三元运算符需要统一前后类型
    }
    @Test
    public void test2(){
        Object o2;
        if(true){
            o2 = new Integer(1);
        }
        else{
            o2 =new Double(2.0);
        }
        System.out.println(o2);//1
    }
    @Test
    public void test3(){
        Integer i =new Integer(1);
        Integer j =new Integer(1);
        System.out.println(i==j);//false
        //引用类型的==比较的是地址

        Integer m= 1;
        Integer n= 1;
        System.out.println(m==n);//true

        Integer x =128;
        Integer y =128;
        System.out.println(x==y);//false
        /**
         * 包装类中的Integer封装定义了Integer cache定义了Integer[],
         * 该数组会保存-128到127的数字（因为常用）
         * 如果数字来自其中，则直接取出来使用即可，如果超出范围，则new一个
         */
    }
}
