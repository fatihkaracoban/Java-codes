public abstract class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }

    public void erase() {
        System.out.println("Erasing a shape");
    }

    public abstract double calculateArea();

    public abstract double calculateCircumference();

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); // Gerekirse alt sınıflarda detaylandırılır
    }

    @Override
    public int hashCode() {
        return super.hashCode(); // Alt sınıflarda override edilecek
    }

    @Override
    public String toString() {
        return "This is a shape.";
    }
}
