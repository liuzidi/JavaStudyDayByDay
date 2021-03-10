package MethodArgs;

public class MethodArgsTest {
    public static void main(String []args){
        new MethodArgs().show(new String[]{"AA","BB","CC"});

    }

}
class MethodArgs{
    public void show(int i){
        System.out.println("int i");
    }
    public void show(String s){
        System.out.println("String s");
    }
    public void show(String ...strs){
        System.out.println("String ...strs");
        for(int i= 0; i<strs.length;i++){
            System.out.println(strs[i]);
        }
    }

    /**
     * 上面的和以下一样，二者不能共存,都是指的是字符串数组
     *     public void show(String []strs){
     *         System.out.println("String ...strs");
     *     }
     */
}
