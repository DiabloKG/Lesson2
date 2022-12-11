package Animal;

import custom_interface.Drawable;

public abstract class Animal implements Drawable {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Animal(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public void draw(){
    }
}
