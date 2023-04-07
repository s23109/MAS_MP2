package Zwykla;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    String name;
    int age;

    public static List<Driver> extent = new ArrayList<>();
    public List<Car> cars = new ArrayList<>();

    private void addExtent(Driver d) {
        extent.add(d);
    }

    private void removeExtent(Driver d){
        extent.remove(d);
    }

    public void showExtent(){
        for (Driver d: extent) {
            System.out.println(d);
        }
    }
    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
        addExtent(this);
    }

    public void addCar (Car c){
        if (!cars.contains(c)){
            cars.add(c);
            c.addDriver(this);
        }
    }

    public void removeCar(Car c){
        if (cars.contains(c)){
            cars.remove(c);
            c.removeDriver(this);
        }
    }

    public void showCars(){
        System.out.println("Driver " + this);
        for (Car c: cars) {
            System.out.println(c);
        }
    }
    @Override
    public String toString() {
        return "Name: " + name + " age: " + age;
    }
}
