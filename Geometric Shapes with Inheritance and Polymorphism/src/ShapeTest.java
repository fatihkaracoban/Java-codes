import java.util.Random;

public class ShapeTest {

	public static void main(String[] args) {

		Random rand = new Random();
		Shape[] shapes = new Shape[5];

		for (int i = 0; i < shapes.length; i++) {

			int choice = rand.nextInt(4);
			switch (choice) {

			case 0:
				shapes[i] = new Circle(rand.nextDouble() * 10);
				break;

			case 1:
				shapes[i] = new Rectangle(rand.nextDouble() * 10, rand.nextDouble() * 10);
				break;

			case 2:
				shapes[i] = new Square(rand.nextDouble() * 10);
				break;

			case 3:
			    double base = rand.nextDouble() * 10 + 1;
			    double height = rand.nextDouble() * 10 + 1;
			    double sideA = rand.nextDouble() * 10 + 1;
			    double sideB = rand.nextDouble() * 10 + 1;
			    double sideC = rand.nextDouble() * 10 + 1;
			    shapes[i] = new Triangle(base, height, sideA, sideB, sideC);
			    break;

			}
		}

		for (Shape shape : shapes) {
			System.out.println("\n" + shape.toString());
			shape.draw();
			System.out.printf("Area: %.2f\n", shape.calculateArea());
			System.out.printf("Circumference: %.2f\n", shape.calculateCircumference());
			shape.erase();
		}
	}

}
