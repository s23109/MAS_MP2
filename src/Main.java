import Kompozycja.Building;
import Kompozycja.Room;
import Z_atrybutem.Course;
import Z_atrybutem.Person;
import Z_atrybutem.Results;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//
//        System.out.println("Asocjacja zwykła:");
//        Car car = new Car("Toyota", 333333);
//        Car car1 = new Car("Mitsubishi" , 123123);
//        Driver driver = new Driver("AAA" , 99);
//        driver.addCar(car1);
//        driver.addCar(car);
//        driver.showCars();
//        car1.showDrivers();

        System.out.println("+++++++++++++++++++++++");
        System.out.println("Asocjacja z atrybutem");
        Person person = new Person("Adam",3);
        Course course = new Course("JAVA-Podstawy", BigDecimal.valueOf(200.00));
        //person.addCourse("2", LocalDate.now(), course);
        new Results(person,course,"2",LocalDate.now());

        person.showResults();
        course.showPersons();
        System.out.println("res:\n"+ person.getResultFor(course));

//        System.out.println("+++++++++++++++++++++++");
//        System.out.println("Asocjacja kwalifikowana");
//        Book book = new Book("JAVA");
//        Page page = new Page("JDBC",1,"bla bla bla ");
//        book.addPage(page);
//        try {
//            System.out.println(book.findPage(1));
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        book.showPages();

        System.out.println("+++++++++++++++++++++++");
        System.out.println("Kompozycja");
        Building building = new Building("123 street");
        try {
            building.createRoom(1,1);
            building.createRoom(2,1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
       // building.showRooms();
        try {
            building.createRoom(2,1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Room room1 = null;
        try {
            room1 = Room.createRoom(1,2,building);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Room1");
        System.out.println(room1);
        System.out.println("=========\nRooms in building");
       building.showRooms();
    }
}