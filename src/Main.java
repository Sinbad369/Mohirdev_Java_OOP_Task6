public class Main {
    public static void main(String[] args) {
        System.out.println("Testing Polymorphism Geometric Figure and its children below:");
        GeometricFigure triangle = new Triangle(3, 4,5);
        System.out.println("Area of a triangle " + triangle.area());
        System.out.println("Perimeter of a triangle " + triangle.perimeter());
        GeometricFigure trapezium = new Trapezium(4, 8,7);
        System.out.println("Area of a trapezium " + trapezium.area());
        System.out.println("Perimeter of a trapezium " + trapezium.perimeter());
        GeometricFigure rectangle = new Rectangle(4, 8);
        System.out.println("Area of a rectangle " + rectangle.area());
        System.out.println("Perimeter of a rectangle " + rectangle.perimeter());

        System.out.println("\nTesting Animal and its Children classes below:");
        Animal dog = new Dog();
        dog.setName("Alpha");
        System.out.print("Sound of Alpha: ");
        dog.sound();
        Animal duck = new Duck();
        duck.setName("Josh");
        System.out.print("Sound of Josh: ");
        duck.sound();
        Animal cat = new Cat();
        cat.setName("Trotsky");
        System.out.print("Sound of Trotsky: ");
        cat.sound();
    }
}