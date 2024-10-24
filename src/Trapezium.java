public class Trapezium extends GeometricFigure{
    private double sideA;
    private double sideB;
    private double high;

    public Trapezium(double sideA, double sideB, double high) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.high = high;
    }

    public double area(){
        return (sideA + sideB) * high / 2;
    }

    public double perimeter() {
        return 0; // Placeholder since there is no sideC and sideD
    }

}
