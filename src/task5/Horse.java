package task5;

public class Horse extends Animal {
    private double weight;

    public Horse(String food, String location, double weight) {
        super(food, location);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void makeNoise(){
        System.out.println("Вес лошади: " + weight);
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест " + getFood());
    }
}
