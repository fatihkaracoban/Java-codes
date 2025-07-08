
public class Circle extends Shape {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		super.draw();
		System.out.println("Drawing a Circle");
	}

	@Override
	public void erase() {
		super.erase();
		System.out.println("Erasing a Circle");
	}

	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public double calculateCircumference() {
		return 2 * Math.PI * radius;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Circle))
			return false;
		Circle c = (Circle) obj;
		return this.radius == c.radius;
	}

	@Override
	public int hashCode() {
		return Double.hashCode(radius);
	}

	@Override
	public String toString() {
		return "Circle with radius " + radius;
	}

}
