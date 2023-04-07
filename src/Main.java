import Kompozycja.Building;
import Kwalifikowana.Book;
import Kwalifikowana.Page;
import Z_atrybutem.Course;
import Z_atrybutem.Person;
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
        Person person = new Person("Adam",3);
        Course course = new Course("JAVA-Podstawy", BigDecimal.valueOf(200.00));
        person.addCourse("2", LocalDate.now(), course);
        person.showResults();
        course.showPersons();

        System.out.println("+++++++++++++++++++++++");
        System.out.println("Asocjacja kwalifikowana");
        Book book = new Book("JAVA");
        Page page = new Page("JDBC",1,"bla bla bla ");
        book.addPage(page);
        try {
            System.out.println(book.findPage(1));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        book.showPages();

        System.out.println("+++++++++++++++++++++++");
        System.out.println("Kompozycja");
        Building building = new Building("123 street");
        try {
            building.addRoom(1,1);
            building.addRoom(2,1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            building.addRoom(2,1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        


    }
}