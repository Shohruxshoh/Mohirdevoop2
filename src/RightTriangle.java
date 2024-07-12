public class RightTriangle {
    private double a;
    private double b;
    private double c;

    public RightTriangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public RightTriangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public RightTriangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public RightTriangle(long a, long b, long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public double getArea() {
        return 0.5 * a * b;
    }

    public void displayTriangleInfo() {
        System.out.println("Right Triangle Information:");
        System.out.println("Base: " + b);
        System.out.println("Height: " + a);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }

    @Override
    public String toString() {
        return "RightTriangle{" +
                "base=" + b +
                ", height=" + a +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                '}';
    }


}