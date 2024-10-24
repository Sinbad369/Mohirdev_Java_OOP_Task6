public class Triangle extends GeometricFigure{
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double area(){
        double semiPerimeter = (sideA + sideB + sideC) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) *
                (semiPerimeter - sideB) * (semiPerimeter - sideC));
    }

    public double perimeter(){
        return sideA + sideB + sideC;
    }
}
