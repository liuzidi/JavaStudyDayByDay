

# **Java**



## 一.Java工具IDEA的使用

### 1.1 IDEA的使用

安装和卸载；

设置快捷键；

设置背景和其他设置；

## 二. Java基础学习

## 2.1 计算机基础介绍

### 2.1.1 计算机组成原理

冯诺依曼体系结构：输入设备-存储器-输出设备（CPU（运算器和控制器））；

CPU：控制单元和算术/逻辑单元；

IT三大定律：摩尔/反摩尔定律，安迪-比尔定律；

内存断电时数据会丢失；（内存读取比从存储读取快得多）；

1 Byte =8 bits ,bit存储0和1是最小的存储单元，byte是存储数据最小单位；

（操作流程）CPU-内存-硬盘，内存相当于高速通道；

输入输出设备：鼠标键盘；通信设备；

图灵：计算机之父 人工智能之父；冯诺依曼：计算机之父 博弈论之父；

### 2.1.2 操作系统

硬件-操作系统-应用程序-用户；

### 2.1.3 计算机网络

World Wide Web（万维网）；

通过//http协议（超文本传输协议）交流；

万维网-因特网-互联网（包含关系）；

## 2.2 Java的基础

### 2.2.1  Java概述

JavaEE，大数据，Android开发；

Spring框架（JAVAEE）；Spark框架（scala安卓开发）；

### 2.2.2 Java基础知识

#### 2.2.2.1 编程语言介绍

语言：机器语言-汇编语言-高级语言：

C：面向过程

C++面向过程/对象

Java 跨平台的纯面向对象的语言

.NET跨语言的平台

开发难度：C＞Java＞Python

运行效率：C< Java < Python

Objective C:苹果的开发应用

#### 2.2.2.2 Java历史

SUN公司1995年推出的一门高级编程语言

针对C缺少垃圾回收系统；

Java：Oak：家电

面向Web和Internet的编程语言（后台开发）

后台开发：Java，PHP，Python，Go，Node.js

前端和后端：服务员和厨师的关系；

JDK：Java环境；里程碑式的版本：JDK 5.0，JDK8.0是5以后变化最大的版本

2018年3月：JDK10.0版本号也叫JDK18.3；

#### 2.2.2.3 Java体系平台

![image-20201210194558221](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201210194558221.png)

JavaME和Java Card现在已经合并；（MP3等小型设备已经被淘汰）

![image-20201210194934044](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201210194934044.png)

（Java的指针封装得很好，原理本质还是寻址指针）

#### 2.2.2.4 Java的特点

面向对象，健壮性，跨平台性（原理：安装虚拟机JVM：Java Virtual Machine）

![image-20201210195349395](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201210195349395.png)

<img src="C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201210195551001.png" alt="image-20201210195551001" style="zoom:67%;" />

#### 2.2.2.5 Java的环境

##### 2.2.2.4.1 JDK

JDK（Java Development Kit）Java开发工具包：包括JRE，（因此安装JDK后不用再安装JRE了），开发必须

​	包含编译工具；打包工具；

​	JDK=JRE+开发工具集(编译工具)

##### 2.2.2.4.2 JRE

JRE（Java Runtime Environment）：Java运行环境，运行“Java文件只需JRE即可

​	包含 Java虚拟机和核心类库；

​	JRE=JVM+Java SE标准类库；	

![image-20201210200641667](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201210200641667.png)

#### 2.2.2.6 Java的程序运行

![image-20201211190632961](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201211190632961.png)

javac运行代码txt后形成字节码文件，再用java进行运行；

![image-20201211195140466](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201211195140466.png)

总结：java文件可以声明多个类，但只能有一个public；

public只能加到和文件名同名的文件中；

即程序名就是类方法；

```java
class helloworld{
    public static void main(String[] args){
        System.out.println("Hello World1");
    }
}
```



#### 2.2.2.7 Java的注释

单行注释//，多行注释： /*/

文档注释（java特有的注释方法）

格式:

/**

文档注释：@author 

@version

*/

然后再cmd中代码目录中javadoc -d 文件名 -version 注释文档名.java

#### 2.2.2.8 Java API文档

![image-20201211193650778](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201211193650778.png)

API文档：相当于java说明书

下载网址：http：//www.oracle.com/technetwork/java/javase/downloads/index.html

#### 2.2.2.9 Java 基本语法

##### 2.2.2.9.1 输出

```java
System.out.print();

System.out.println();//换行
```

##### 2.2.2.9.2 关键字

![image-20201211201409655](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201211201409655.png)

![image-20201211201451150](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201211201451150.png)

##### 2.2.2.9.3 保留字

![image-20201211201550868](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201211201550868.png)

##### 2.2.2.9.4 标识符

标识符（Identifier）

变量，方法，类名即标识符；

数字不可以开头

包含_ $ 数字 大小写字母；

##### 2.2.2.9.5 命名方式

驼峰命名法；

![image-20201211202144488](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201211202144488.png)

包名：全部小写；

类名，接口名：首字母大写驼峰；

变量名，方法名 首字母小写驼峰；

常量名：全部大写用单词间_隔开

##### 2.2.2.9.6 变量

变量类型 变量名 =变量值

定义变量的注意点：

1.变量声明后才能使用（和C差不多）；

2.变量只能定义在作用域内，出了作用域之后无法使用；

变量类型：

基本数据类型：byte int(short long) float double char boolean 

引用数据类型： class  interface    []（数组）

注：byte（1字节）：范围-128-127 ）(8个bit)

short(2字节)：范围：

int（4字节）：范围：

long（6字节）：范围**（定义long需要加l或者L)**

float（4字节）：范围大，精度小（范围比long还大，但是精度无法计算）**（定义float需要加f或者F）**

double（8字节）：范围大，精度大

char（2字节）：转义字符\ : \n:换行 \t:制表符 \u(unicode:字符编码集)

boolean: 只能取true和false两个值之一；（和C++不一样的是不是用整型0和1表示）

**（注：java的变量一般定义为int类型，除非特别大的数才用long，变量名后必须加l或者L）**

基本数据类转换规则

长度长的加上短的用长的来容纳；

byte \ short \ char->int->long->float->double

**byte \ short \ char三种类型做运算时必须用int 容纳**（包括同类型之间的运算）

强制类型转换：类型（变量名） =（强制转换的类型）类型：可能导致精度损失；

```java
class a{
    public static void main (String [] args) {
        byte b= 1;
        byte b1= b+1; //编译错误，因为默认1为int类型
        long l= 132l;//没加l后缀但是仍然编译通过 ，因为系统默认当做了int类型
        long l1 =12312312414132; //编译失败 
        long l2 -1334234234324234L;//编译成功；
    }       
}
```

##### 2.2.2.9.7 String 类型变量

String 类型变量属于引用数据类型；

定义String时用”  “来定义；

可以和八种数据类型进行运算；结果都是String类型；

和数据进行加减乘除的时候 ，直接进行连接运算；

```java
class a {

public static void main (String [] args){
    char c= 'a';
 	int num = 10;
    String str ="b";
    
    System.out.println(c + num +str）; //107b;
    System.out.println(c + str +num);  //ab10;
    System.out.println(c +(num +str)); //a10b;    
    System.out.println((c + num ) +str);//107b;
    System.out.println((str +num) +c);// b10a;
   }
```

**注意：char用单引号，字符串用双引号；**

##### 2.2.2.9.8 运算符

###### 1. 算术运算符

（加减乘除余）

```java
//除法运算
int a = 5;
int b = 12;
double c0 = b/a; //2 
double c1 = b/(a+0.0);//2.4
double c2 = (double)b/a; //2.4
double c3 =(double)(b/a); //2.0

//取余运算
//符号和被除数相同；
 //加法运算 注意点：
short s1=10;
s1= s1+1;//编译失败；1 为int
s1= (short)(s1+1);//成功
s1++;//自增不改变本身变量的数据类型；
```



###### 2. 赋值运算符

= 可以连续赋值

```java
int i1= i2 =3;//可以
```

![image-20201216164838161](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201216164838161.png)

+=和 普通的还是有区别的；不改变数据类型

![image-20201216152905932](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201216152905932.png)

练习：

![image-20201216153047669](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201216153047669.png)



可以通过 结果为0；

![image-20201216153236448](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201216153236448.png)

结果为32



###### 3. 比较运算符

结果都是 boolean类型（区分好==和=的区别）

![image-20201216153643236](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201216153643236.png)

**instanceof**



###### 4. 逻辑运算符

![image-20201216153857363](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201216153857363.png)

短路和逻辑的区别：
![image-20201216154347624](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201216154347624.png)

当前情况没区别（因为存在前面是false的情况直接pass，短路会pass）

![image-20201216154653327](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201216154653327.png)

![image-20201216154820325](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201216154820325.png)

开发中推荐是用短路；

练习：

![image-20201216155114463](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201216155114463.png)



###### 5. 位运算符

（一般不使用，看的懂就行）

![image-20201216155426754](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201216155426754.png)

![image-20201216160250095](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201216160250095.png)

应用1：交换值：

![image-20201216160836983](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201216160836983.png)



![image-20201216160909798](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201216160909798.png)

应用2：经典面试题

![image-20201216165048486](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201216165048486.png)

应用2：手动实现0-255转换为16进制

**<img src="C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201216165534408.png" alt="image-20201216165534408" style="zoom: 67%;" />

###### 6. 三元运算符

![image-20201216161100862](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201216161100862.png)



![image-20201216161241129](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201216161241129.png)

![image-20201216161624814](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201216161624814.png)

三元运算符可以嵌套

![image-20201216161852756](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201216161852756.png)

三元运算符与if-else的转换

![image-20201216162436229](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201216162436229.png)

运算符的优先级：

<img src="C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201216162546733.png" alt="image-20201216162546733" style="zoom: 80%;" />

#### 2.2.2.10 Java 流程控制

![image-20201216163325874](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201216163325874.png)

 ![image-20201216163543163](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201216163543163.png)

##### 2.2.2.10.1 分支结构

if-else运算方式

<img src="C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201216163729198.png" alt="image-20201216163729198" style="zoom: 50%;" />

从键盘导入包:采用Scanner类

![image-20201216180200148](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201216180200148.png)

```java
import java.util.Scanner;
class ScannerTest{
    public static void main{
        Scanner scan = new Scanner(System.in);
        
        int num =scan.nextInt();
        System.out.println(num);//整型的输入
        String  str=scan.next();        
        System.out.println(str);
        double dd =scan.nextDouble();//双精度浮点数的输入
        System.out.println(dd);
        boolean b =scan.nextBoolean();//boole数的输入
        System.out.println(b);
    }
}
```

![image-20201216183137570](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201216183137570.png)

![image-20201216183311288](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201216183311288.png)

随机数的产生：

```java
Math.random()          //[0.0,1.0]
    //公式 ：[a,b] :(int)(Math.random()*(b - a + 1 ) + a );
```

![image-20201216183936209](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201216183936209.png)

swtch-case

<img src="C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201216184802476.png" alt="image-20201216184802476" style="zoom:67%;" />

switch结构中的表达式中：只能是以下六种数据类型：

![image-20201216185101048](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201216185101048.png)

**（不允许用boolean类型）**

case不允许有范围，即不能是boolean类型

switch-case 和if-else的选择情况：

![image-20201216190456765](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201216190456765.png)

##### 2.2.2.10.2 循环结构

过程图示：

![image-20201216190655021](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201216190655021.png)

for循环

![image-20201216190747648](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201216190747648.png)

初始化和迭代条件可以很灵活“

![image-20201216191109526](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201216191109526.png)

while循环：

![image-20201216194803898](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201216194803898.png)

![image-20201216194740067](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201216194740067.png)

切记：循环过程注意别漏了迭代条件，否则会陷入死循环

for循环和while循环可以互相转换；

小区别：初始条件就是作用域不同而已

while可以用break'跳出循环；

```java
while (true){
    if{}
    else if{}.....
    else{break;}
}
```



do-while循环

![image-20201216195409667](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201216195409667.png)

do-while循环与其他循环体的小区别：至少会进行一次循环体



总结：跳出循环的方式：

1.循环条件的跳出

2.break；



 嵌套循环：

1.默认规定：一般不超过三层；超出就考虑新方法；

2.内层循环遍历一次，外层循环仅仅循环一次；

3.外循环控制行数，内循环控制列数；

P121：质数输出

数据结构与算法非常重要

![image-20201217151648297](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201217151648297.png)

![image-20201217151731566](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201217151731566.png)

使用开方进行优化



break 和continue 关键字的使用

![image-20201217152034156](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201217152034156.png)

就近原则：跳出最近的循环；

可以指定break的循环体：

```java
A: for(----){
    	for (===)    {
            break A;
        }
}
```

return 结束一个方法；

阶段性项目：

收支明细记录系统

![image-20201217154101632](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201217154101632.png)



### 2.2.3JavaEE进阶



#### 2.2.3.1 eclipese 

快捷键：

-----

main Alt+/  

sysomain Alt+/ 

![image-20201229221530774](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201229221530774.png)

----

区分安装目录和workspace

软件存放的位置

安装目录

workspace：代码存放的位置，因此软件卸载后代码仍然存在；

----







#### 2.2.3.2 数组概述

---

概念

----

数组名

下标

元素

数组长度

---

特点

----

1. 有序排列
2. 属于引用数据类型的变量
3. 长度确定后无法改变
4. 内存空间连续



---

一维数组的初始化

---

```java
//声明
int[]ids;
//静态初始化		
int[]ids =new int[] {1,2,3,4};

//动态初始化
int[] ids =new int[5];
       
//也是正确的写法 类型推断
    int[] arr ={1,2,3,4};
```

错误的初始化方式

![image-20201229203452050](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201229203452050.png)

---

调用数组的指定位置的元素

----

数组的角标是从0开始的，到数组的长度-1结束；



---

获取数组的长度

---

属性：length

```java
ids.length;
```

---

遍历数组

---

用一个循环配合输出进行输出遍历

```java
for(int i=0; i<ids.length; i++){
    System.out.println(a[i]);
}
```

----

数组元素的默认初始化值

---

int/short/long类型的数组默认为0；

float/double默认为0.0；+

char类型默认为：**0或  ‘/u000’** 形式上像个空格（注意不是‘0’）；

Boolean类型默认B为false；

引用数据类型的默认为：null



---

数组的内存解析

---

![image-20201229205639738](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201229205639738.png)



![image-20201229210211302](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201229210211302.png)

只要有new字符，就会在堆中开辟新空间，并且在栈中生成一个记录地址的数组（类似指针引用），在初始化数组后如果让他重新开辟，会指向新开辟的堆空间对象，并且会将先前初始化好的堆空间当作垃圾在适当的时候释放；



---

多维数组

---

实质：数组的元素为数组；

---

二维数组的初始化

---

![image-20201229214446731](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201229214446731.png)

---

二维数组的调用

-----

下标都要相应的减一；

如：

```java
arr[1][2] //指第二行的第三列的元素的调用
```

---

二维数组的长度

---

长度为第一行的长度

因为实质上多维数组就是个嵌套的一维数组；



----

遍历二维数组

---

嵌套for循环

```java
for(int i= 0 ; i<arr.length; i++){
    for (int j= 0 ; j<arr[i].length ; j++){
        arr[i][j]=.....
    }
}
```

---

数组元素的默认初始值

---

规定：二维数组分为外层和内层的元素

初始化方式1：

```java
int [][]arr=new int [4][3];
```

1. 外层：地址值

2. 内层：

   1. int/short/long类型的B数组默认为0；

   2. float/double默认为0.0；

   3. char类型默认为：**0或  ‘/u000’** 形式上像个空格（注意不是‘0’）；

   4. Boolean类型默认为false；

   5. 引用数据类型的默认为：null

      

初始化方式2:

```java
int [][]arr=new int [4][];
```

1. 外层：null
2. 内层：无法调用，否则报错；

-----

二维数组的数据内存解析

---

![image-20201229220842962](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20201229220842962.png)



数据结构:

---

逻辑关系：集合，一对一，一对多，多对多

存储结构：

线性表：顺序表（数组）链表 栈 队列

树形结构：二叉树

图形结构

---

算法：

排序算法

搜索算法

---

各排序算法的时间复杂度对比

![image-20210201154825370](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20210201154825370.png)

---

数组：Array工具类的使用

![image-20210201223606110](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20210201223606110.png)

```java
import java.util.Arrays;
Arrays.equals(a,b);

```

数组中常见异常：

1.越界异常 ArrayIndexOutOfBoundsException

角标不能为负数，不能大于length-1；

2.空指针异常 NullPointerexeption

指针是Null不会报错，但是如果让null的指针进行指向会发生错误

如：

```java
int[][]arr=new int [2][];
sysout(arr[1][]);//输出null，并不构成报错
sysout(arr[1][0]);//NullPointerexeption，空指针不能指向
```

项目 包（某一大类的包） 类

util包：Arrays提供了很多操作数组的方法

import java.util.Arrays

### 2.2.4 Java面向对象

#### 2.2.4.1 Java类及类的成员

---

属性 方法 构造器 代码块 和内部类

属性=成员=域=field

方法=成员函数=Method

对象是引用变量



新建对象

```java
类名 对象名= new 类名();
```

如果创建了一个类的多个对象，则每个对象都拥有一套独立的类的属性

```java
class person{};
person p1 =new person();
person p2 = p1;//p1 p2指向同一块堆空间


```

对象的创建

![image-20210204115040026](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20210204115040026.png)

#### 2.2.4.2 面向对象的三大特征

---

封装性 继承性 多态性 抽象性

#### 2.2.4.3 其他关键字

---

```java
this super static final abstract interface package import
```

#### 2.2.4.4 对象的内存解析

---

堆空间（Heap）创建新对象的位置

栈空间（Stack）引用变量，局部变量

![image-20210204115741456](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20210204115741456.png)

#### 2.2.4.5 属性vs局部变量

---

不同点

1.类中的声明的位置不同

2.函数内的变量和调用形参的情形为局部变量

3.声明方法：变量名 = 变量值



相同点：

1.先声明后使用

2.都有其作用域



 关于权限修饰符的不同

1.属性：声明属性时，指明权限 private public 缺省

2.局部变量：无权限修饰符



默认初始化值的情况：（非static）

属性：根据其类型都有默认初始化值

![image-20210204121016807](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20210204121016807.png)



局部变量：没有默认赋值，必须显性赋值

#### 2.2.4.6 Method

![image-20210204122919347](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20210204122919347.png)

 不能在方法中建新的方法

编译完源代码以后，生成一个或多个字节码文件

我们使用JVM的类的加载器和解释器对生成的字节码文件进行解释运行，这就意味着需要将字节码文件对应的类加载到内存中，涉及到内存解析

<img src="C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20210208140228837.png" alt="image-20210208140228837" style="zoom:80%;" />

虚拟机栈：即栈，我们将局部变量存储到栈结构中

堆：new出来的结构（如对象，数组）加载到堆空间中，对象的属性（非static类型的）加载到堆空间中

方法区：类的加载信息，常量池，静态域



变量的分类：

方式一：按照数据类型

<img src="C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20210208140720731.png" alt="image-20210208140720731" style="zoom:80%;" />

方式二：	

![image-20210208141057108](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20210208141057108.png)

### LESS

![image-20210216095340965](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20210216095340965.png)

无形参的

![image-20210216094959180](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20210216094959180.png)

命名参数 

匹配参数第一个可以是匹配符

git操作总结

<img src="C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20210216181928971.png" alt="image-20210216181928971" style="zoom: 50%;" />

**1.状态查看操作**

git status

查看工作区和暂存区的状态

**2.添加操作**

git add<文件名>

**3.查看历史记录**

git log

完整显示

git log --pretty=oneline

用一行显示

git log --oneline:只显示过去

更简洁的形式显示（缩短哈希值）

多屏显示操作：

空格向下翻页

b向上翻页

q 退出

4.前进后退

tail -n 3文件名（打开对应文件并展示最后三行的内容）

git reflog

HEAD@{移动到当前版本需要多少步}

git reset--hard(索引值：哈希值)

 使用^符号：只能后退 git reset --hard HEAD^^^（退3步）

使用~符号：只能后退  git reset --hard HEAD~n（退n步）



reset命令的三个参数对比

--soft：仅在本地库移动HEAD指针

--mixed：再本地库移动HEAD指针和重置暂存区

--hard ：三区全部移动到相应的指针上

删除文件

rm 文件名

git diff 比较两个文件的不同

git 分支

![image-20210216194026669](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20210216194026669.png)

![image-20210216194132993](C:\Users\86173\AppData\Roaming\Typora\typora-user-images\image-20210216194132993.png)



继续java

return的作用：

1.使用范围：在方法体内

2，作用：结束一个方法

方法的使用中可以使用类的属性和方法

方法A中又调用了方法A：递归

方法中不能定义方法

。