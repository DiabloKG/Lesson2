package Figure;

public class Triangle extends Figure {
    private Integer sideA, sideB, sideC;

    public Triangle(String name, Integer sideA, Integer sideB, Integer sideC) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    @Override
    public Integer calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public void draw() {
        System.out.println("▲");
    }
}

