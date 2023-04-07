import Z_atrybutem.Kurs;
import Z_atrybutem.Osoba;
import Zwykla.Car;
import Zwykla.Driver;

import java.math.BigDecimal;
import java.time.LocalDate;

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

        Osoba osoba = new Osoba("Adam",3);
        Kurs kurs = new Kurs("JAVA-Podstawy", BigDecimal.valueOf(200.00));
        osoba.addKurs("2", LocalDate.now(),kurs);
        osoba.showWyniki();

        kurs.showOsoby();
    }
}