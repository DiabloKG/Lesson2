package Figure;

public class Circle extends Figure {
    private Integer radius;

    public Circle(String name, Integer radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public Integer calculatePerimeter() {
        return (int) (2 * Math.PI * radius);
    }

    @Override
    public void draw() {
        System.out.println("⦿");
    }
}
