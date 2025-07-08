
public class Square extends Shape{
	
	private double side;
	
	public Square(double side) {
		this.side = side;
	}
	
	@Override
	public void draw() {
		super.draw();
		System.out.println("Drawing a Square.");
	}
	
	@Override
	public void erase() {
		super.erase();
		System.out.println("Erase a Square.");
	}
	
	@Override
	public double calculateArea() {
		return side * side;
	}
	
	@Override
	public double calculateCircumference() {
		return side * 4;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Square))
			return false;
		Square s = (Square) obj;
		return s.side == this.side;
	}
	
	@Override
	public int hashCode() {
		return Double.hashCode(side);
	}
	
	@Override
	public String toString() {
		return "Square [ side = " + side + " ]";
	}
}
