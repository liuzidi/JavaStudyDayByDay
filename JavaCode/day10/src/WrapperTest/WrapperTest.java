package WrapperTest;

import org.junit.Test;

//包装类的测试
//基本数据类型，包装类，String三者之间的转换
public class WrapperTest {
    @Test
    /**
     * 基本类型转化为包装类：调用包装类的构造器（但已经过时）
     */
    public void test1(){
        int num =10;
//      System.out.println(num.toString());
//      基本数据类型无法进行相应的属性操作
        Integer in = num;
        System.out.println(in.toString());//10

        //Integer
        Integer in2 = Integer.valueOf("123");
        System.out.println(in2);//123
//      Integer in3 = new Integer("123bc");
//      System.out.println(in3);
//      必须纯数字，否则运行无法通过

        //Float
        Float f1 = 12.3f;
        System.out.println(f1.toString());//12.3

        Float f2 =Float.valueOf("12.3");
        System.out.println(f2);//12.3

        //Boolean
        Boolean b1 =true;
        System.out.println(b1);//true

        Boolean b2 =Boolean.valueOf("true");
        System.out.println(b2);//true

        Boolean b3 =Boolean.valueOf("tRuE");
        System.out.println(b3);//true 忽略大小写

        Boolean b4 =Boolean.valueOf("true123");
        System.out.println(b4);//false
    }
    @Test
    /**
     * 包装类转化为基本类型：调用包装类的xxxValue方法
     */
    public void test2(){
        //int ---> Integer
        Integer in1 = 100 ;
        int numIn1 =in1.intValue();
        System.out.println(numIn1);//100

        //float --> Float
        Float f1 = 12.3f;
        float numFloat1 =f1.floatValue();
        System.out.println(numFloat1);//12.3

    }
    @Test
    /**
     * JDK 5.0新特性 ：自动装箱和自动拆箱
     *
     */

    public void test3(){
        // 自动装箱 ：基本数据类型-->包装类
        int num1 =100;
        Integer in1 = num1;//自动装箱

        boolean b1 =true;
        Boolean b2 =b1;//自动装箱

        //自动拆箱：包装类--->基本数据类型

        int num2 =in1;//自动拆箱
        boolean b3 = b2;//自动拆箱

    }
    @Test
    /**
     * 基本数据类型，包装类---> String类型
     */
    public void test4(){
        int num1 =10;
        //方式一：连接运算将基本数据类型转化为String类型
        String str1 =num1 +"";
        //方式二：调用String的valueOf（Xxx xxx）
        float f1 =12.3f;
        String str2 =String.valueOf(f1);//"12.3"

        Double d1 =12.4d;
        String str3 =String.valueOf(d1);
        System.out.println(d1);
        System.out.println(str3);

    }
}
