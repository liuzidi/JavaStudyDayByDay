package ArrayUtil;

public class Array {
    //求数组最大值
    public double maxValue(double[] arr){
        double temp = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>temp){
                temp=arr[i];
            }
        }
        System.out.println("数组最小值为"+temp);
        return temp;
    }
    //求数组最小值
    public double minValue(double[] arr){
        double temp = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<temp){
                temp=arr[i];
            }
        }
        System.out.println("数组最大值为"+temp);
        return temp;
    }
    //求数组的总和
    public double sumValue(double[] arr){
        double temp = 0.0;
        for(int i = 0; i<arr.length; i++){
                temp+=arr[i];
        }
        System.out.println("数组总和为"+temp);
        return temp;
    }
    //求数组的平均值
    public double averageValue(double[] arr){
        double temp = 0.0;
        for(int i = 0; i<arr.length; i++){
            temp+=arr[i];
        }
        temp /=arr.length;
        System.out.println("数组平均值为"+temp);
        return temp;
    }
    //反转数组
    public void reverseArray(double[] arr){
        double temp;
        for(int i=0; i<arr.length/2; i++){
            temp  = arr[i];
            arr[i]= arr[arr.length-1-i];
            arr[arr.length-i-1] =temp;
        }
        System.out.println("反转后的数组为:");
        for(int i =0; i<arr.length; i++){
            System.out.println("arr["+i+"]="+arr[i]);
        }
    }
    //复制数组
    public double[] copyArr(double[] arr){
        double[]tempArr = new double[arr.length];
        for(int i = 0; i<arr.length; i++){
            tempArr[i]=arr[i];
        }
        return tempArr;
    }
    //数组排序
    public void bubbleSortArr(double[] arr){
        double temp;
        for(int i =0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("冒泡排序后的数组为:");
        for(int i =0; i<arr.length; i++){
            System.out.println("arr["+i+"]="+arr[i]);
        }
    }
    //遍历数组并输出数组的值
    public void printArr(double []arr){
        for(int i =0; i<arr.length; i++){
            System.out.println("arr["+i+"]="+arr[i]);
        }
    }

}
