import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class MainTask3 {
    public static void main(String[] args) {
        Driver Shumaher = new Driver("Шумахер", 5);
        Engine Gaz51 = new Engine(120, "Газ");
        Car Car1 = new Car("Газ 51", "Легковой автомобиль", 5, Shumaher, Gaz51);

//        Car1.printInfo();

        Lorry lorry = new Lorry("Газ 51", "Грузовик", 128, Shumaher, Gaz51, 55);
//        lorry.printInfo();

        SportCar sportCar = new SportCar("Газ 51", "Грузовик", 128, Shumaher, Gaz51, 550);
        sportCar.printInfo();
    }
}
