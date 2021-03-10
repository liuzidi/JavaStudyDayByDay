package TestUtil;

import ArrayUtil.Array;
//其他package的必须带有import字样才能进行引用

public class TestTest {
    public static void main(String []args){
        //静态初始化，直接声明类型，并且给出确定的数组初始化内容
        double [] arr ={8,15,58,13,53,3,5,24,56,42};
        Array arrayMethod =new Array();
        arrayMethod.printArr(arr);
        arrayMethod.sumValue(arr);
        arrayMethod.averageValue(arr);
        arrayMethod.maxValue(arr);
        arrayMethod.minValue(arr);
        //动态初始化，给数组长度，但是不直接赋值
        double [] arr1 =new double[10];
        arrayMethod.printArr(arr1);
        arr1= arrayMethod.copyArr(arr);
        arrayMethod.printArr(arr1);

        arrayMethod.reverseArray(arr);
        arrayMethod.bubbleSortArr(arr);
    }
}
