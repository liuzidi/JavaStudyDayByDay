package RecursionTest;

public class RecursionTest {
    public static void main(String []args){
        RecursionTest obj =new RecursionTest();
        int a = obj.getSum(100);
        System.out.println(a);

    }
    public int getSum(int n){
        if(n==1){
            return 1;
        }else{
            return n+getSum(n-1);
        }
    }
}

