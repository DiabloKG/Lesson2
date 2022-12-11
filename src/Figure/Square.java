package Figure;

public class Square extends Figure {
    private Integer sideA, sideB, sideC, sideD;

    public Square(String name, Integer sideA) {
        super(name);
        this.sideA = sideA;
    }

    @Override
    public Integer calculatePerimeter() {
        return sideA * 4;
    }
    @Override
    public void draw() {
        System.out.println("⧈");
    }
}