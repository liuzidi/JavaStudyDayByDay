package Test;

public class Test {
    public void method(){
        int num =2;
        class AA{
            public void show(){
                //num =5;//Variable 'num' is accessed from within inner class,
                // needs to be final or effectively final
                System.out.println(num);
            }
        }
    }
}
