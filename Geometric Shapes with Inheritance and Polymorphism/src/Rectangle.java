
public class Rectangle extends Shape{
	
	private double longSide;
	private double shortSide;
	
	public Rectangle(double longSide, double shortSide) {
		this.longSide = longSide;
		this.shortSide = shortSide;
	}
	
	@Override
	public void draw() {
		super.draw();
		System.out.println("Drawing a Rectangle.");
	}
	
	@Override
	public void erase() {
		super.erase();
		System.out.println("Erase a Rectangle.");
	}
	
	@Override
	public double calculateArea() {
		return longSide * shortSide;
	}
	
	@Override
	public double calculateCircumference() {
		return (2 * longSide) + (2 * shortSide);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Rectangle))
			return false;
		Rectangle r = (Rectangle) obj;
		return r.longSide == this.longSide && this.shortSide == r.shortSide;
	}
	
	@Override
	public int hashCode() {
		return Double.hashCode(longSide) + Double.hashCode(shortSide);
	}
	
	@Override
	public String toString() {
		return "Rectangle [ longSide = " + longSide + ", shortSide = " + shortSide + " ]";
	}
}
