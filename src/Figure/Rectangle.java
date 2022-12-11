package Figure;

public class Rectangle extends Figure {
    private Integer sideA, sideB;

    @Override
    public Integer calculatePerimeter() {
        return (sideA + sideB) * 2;
    }

    public Rectangle(String name, Integer sideA, Integer sideB) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
    }
    @Override
    public void draw() {
        System.out.println("▮");
    }
}