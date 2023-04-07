package Zwykla;

import java.util.ArrayList;
import java.util.List;

public class Car {

    String brand;
    float mileage;

    public static List<Car> extent = new ArrayList<>();
    public List<Driver> drivers = new ArrayList<>();

    private void addExtent(Car d) {
        extent.add(d);
    }

    private void removeExtent(Car d){
        extent.remove(d);
    }

    public void showExtent(){
        for (Car d: extent) {
            System.out.println(d);
        }
    }

    public void addDriver(Driver d){
        if (!drivers.contains(d)){
            drivers.add(d);
            d.addCar(this);
        }
    }

    public void removeDriver(Driver d){
        if (drivers.contains(d)){
            drivers.remove(d);
            d.removeCar(this);
        }
    }

    public Car(String brand, float mileage) {
        this.brand = brand;
        this.mileage = mileage;
    }

    public void showDrivers(){
        System.out.println("Car " + this);
        for (Driver d: drivers) {
            System.out.println(d);
        }
    }
    @Override
    public String toString() {
        return "Brand: " + brand + " mileage: " + mileage;
    }

}
