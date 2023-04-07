import Zwykla.Car;
import Zwykla.Driver;

public class Main {
    public static void main(String[] args) {

        System.out.println("Asocjacja zwykła:");
        Car car = new Car("Toyota", 333333);
        Car car1 = new Car("Mitsubishi" , 123123);
        Driver driver = new Driver("AAA" , 99);

        driver.addCar(car1);
        driver.addCar(car);

        driver.showCars();
        car1.showDrivers();

        System.out.println("+++++++++++++++++++++++");
        System.out.println("Asocjacja z atrybutem");

        

    }
}