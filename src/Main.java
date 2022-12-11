import Animal.Animal;
import Figure.Circle;
import Figure.Figure;
import Figure.Triangle;
import Figure.Square;
import Figure.Rectangle;
import Animal.Dog;
import Animal.Cat;
import custom_interface.Drawable;
import custom_interface.SoundProducable;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Кружок", 15);
        Triangle triangle = new Triangle("Треоугольник", 12, 20, 12);
        Rectangle rectangle = new Rectangle("Прямоугольник", 5, 2);
        Square square = new Square("Квадрат", 2);
        Dog dog = new Dog ("Шарик", 2);
        Cat cat = new Cat("Маруся", 3);
        Drawable[] drawables = {triangle,circle,square,rectangle,dog,cat};
        calculatedPerimeter(drawables);
        dog.callSound();
        }

    private static void calculatedPerimeter(Drawable[] figures) {
        for (Drawable drawable: figures) {
            if (drawable instanceof Figure){
                System.out.println(((Figure) drawable).getName() + " " + ((Figure) drawable).calculatePerimeter());
            }
            if (drawable instanceof Animal){
                System.out.println(((Animal) drawable).getName() + " " + ((Animal) drawable).getAge());
            }
            drawable.draw();
        }
    }
}

