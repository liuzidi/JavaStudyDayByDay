package TemplateTest;

public class TemplateTest {
    public static void main(String []args){
        SubTemplate s =new SubTemplate();
        s.spendTime();
    }
}

/**
 * 计算某段代码花费的时间
 */
abstract class Template{
    public void spendTime(){
        long start =System.currentTimeMillis();
        this.code();
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为"+(end - start));
    }
    public abstract void code();
}

class SubTemplate extends Template{
    public void code(){
        for (int i = 2; i <=1000; i++) {
            boolean isFlag = true;
            for (int j = 2; j <=Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isFlag = false;
                    break;
                }
            }
                if(isFlag){
                    System.out.println(i);
                }
            }
    }
}
