
public class Triangle extends Shape{

	private double base;
    private double height;
    private double sideA, sideB, sideC;
    
    public Triangle(double base, double height, double sideA, double sideB, double sideC) {
    	this.base = base;
    	this.height = height;
    	this.sideA = sideA;
    	this.sideB = sideB;
    	this.sideC = sideC;
    }
    
    @Override
    public void draw() {
    	super.draw();
    	System.out.println("Drawing a Triangle");
    }
    
    @Override
    public void erase() {
    	super.erase();
    	System.out.println("Erase a Triangle");
    }
    
    @Override
    public double calculateArea() {
    	return (base * height) / 2;
    }
    
    @Override
    public double calculateCircumference() {
    	return sideA + sideB + sideC;
    }
    
    @Override
    public boolean equals(Object obj) {
    	if(!(obj instanceof Triangle))
    		return false;
    	Triangle t = (Triangle) obj;
    	return this.base == t.base && t.height == this.height &&
    			this.sideA == t.sideA && t.sideB == this.sideB && this.sideC == t.sideC;
    }
    
    @Override
    public int hashCode() {
    	return Double.hashCode(base) + Double.hashCode(height) +
    			Double.hashCode(sideA) + Double.hashCode(sideB) + Double.hashCode(sideC);
    }
    
    @Override
    public String toString() {
    	return "Triangle [ base = " + base + ", height = " + height + "\n" +
    			"           sideA = " + sideA + ", sideB = " + sideB + ", sideC = " + sideC + " ]";
    }
}
