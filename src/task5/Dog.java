package task5;

public class Dog extends Animal {
    private int age;

    public Dog(String food, String location, int age) {
        super(food, location);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void makeNoise(){
        System.out.println("Возраст собаки: " + age);
    }

    @Override
    public void eat() {
        System.out.println("Собака ест " + getFood());
    }

}
