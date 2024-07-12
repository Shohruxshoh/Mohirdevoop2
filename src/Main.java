public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Qizil", "Toyota", 25000, true);
        myCar.displayCarInfo();


        RightTriangle triangle1 = new RightTriangle(3, 4, 5);
        triangle1.displayTriangleInfo();

        RightTriangle triangle2 = new RightTriangle(5.0, 12.0, 13.0);
        triangle2.displayTriangleInfo();

        RightTriangle triangle3 = new RightTriangle(6.0f, 8.0f, 10.0f);
        triangle3.displayTriangleInfo();

        RightTriangle triangle4 = new RightTriangle(7L, 24L, 25L);
        triangle4.displayTriangleInfo();

        Point point1 = new Point(1.0, 2.0, 3.0);
        System.out.println("Point 1: " + point1);

        Point point2 = new Point(0.5, 0.5, 0.0);
        System.out.println("Point 2: " + point2);
    }

}