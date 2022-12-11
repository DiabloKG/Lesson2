package Animal;

import custom_interface.SoundProducable;

public class Dog extends Animal implements SoundProducable {
    @Override
    public void draw() {
        System.out.println("\uD83D\uDC36");
    }

    public Dog(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void callSound() {
        System.out.println("ГАВ ГАВ");
    }
}
