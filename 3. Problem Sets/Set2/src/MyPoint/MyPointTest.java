package MyPoint;

public class MyPointTest {
    public static void main(String[] args) {

        MyPoint point1 = new MyPoint(3,4);
        point1.translate(2,2);

        System.out.println(point1);
        System.out.println(point1.distanceFromOrigin());
    }
}
