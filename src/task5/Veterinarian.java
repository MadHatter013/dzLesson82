package task5;

public class Veterinarian {
    public void treatAnimal(Animal animal) {
        System.out.println("Животное находится: " + animal.getLocation());
        System.out.println("Животное ест: " + animal.getFood());
    }
}
