package Circle;

class CircleTest {
    public static void main (String []args){
        Circle c1 = new Circle();
        c1.radius= 2.3;
        c1.findArea();
    }
}

public class Circle {


    double radius;
        void findArea(){
            double area = Math.PI * radius *radius;
            System.out.println("面积是"+area);
        }
}
