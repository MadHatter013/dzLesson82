package task5;

public class Cat extends Animal {
    private String name;

    public Cat(String food, String location, String name) {
        super(food, location);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println("Имя кота: " + name);
    }

    @Override
    public void eat() {
        System.out.println("Кот ест " + getFood());
    }
}
