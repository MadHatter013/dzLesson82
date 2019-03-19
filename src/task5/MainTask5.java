package task5;

public class MainTask5 {
    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian();
        Animal[] animal = new Animal[3];

        animal[0] = new Dog("Мясо", "Будка", 4);
        animal[1] = new Cat("Рыба","Квартира","Мурчик");
        animal[2] = new Horse("Поле","Бабай",200);

        for (int i = 0; i< animal.length; i++){
            veterinarian.treatAnimal(animal[i]);
            animal[i].makeNoise();
            animal[i].eat();
            System.out.println();
        }
    }
}
