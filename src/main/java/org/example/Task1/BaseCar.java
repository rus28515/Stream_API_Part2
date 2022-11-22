package org.example.Task1;

import java.util.ArrayList;
import java.util.List;

public class BaseCar {
    private String name;
    List<Car> cars;

    public BaseCar(String name) {
        this.name = name;
        cars = new ArrayList<>();
        Car car1 = new Car("BMW", 2018, 25000, "red", 2.8);
        Car car2 = new Car("Volvo", 2015, 22000, "blue", 2.0);
        Car car3 = new Car("AUDI", 2019, 23000, "bleak", 2.6);
        Car car4 = new Car("Mercedes", 2018, 45000, "yellow", 3.0);
        Car car5 = new Car("Reno", 2016, 15000, "pink", 1.4);
        Car car6 = new Car("Fiat", 2011, 16000, "white", 1.6);
        Car car7 = new Car("Honda", 2013, 28000, "bleak", 2.5);
        Car car8 = new Car("Peugeot", 2015, 13000, "blue", 1.6);
        Car car9 = new Car("Opel", 2014, 18000, "red", 2.1);
        Car car10 = new Car("Volkswagen ", 2019, 23000, "white", 2.5);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        cars.add(car10);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printAllCar() {
        cars.stream().forEach(System.out::println);
    }

    public void printCarColor(String color) {
        cars.stream().filter(e -> e.getColor().equals(color)).forEach(System.out::println);
    }

    public void printCarOverPrice(int price) {
        cars.stream().filter(e -> e.getPrice()>price).forEach(System.out::println);
    }

    public void printCarByYearInTheRange (int yearStart, int yearFinish){
        cars.stream().filter(e -> e.getYear()>=yearStart && e.getYear()<=yearFinish)
                .forEach(System.out::println);
    }

    public void sortPrice (){
        cars.sort((car1, car2)-> car2.getPrice()-car1.getPrice());
    }
}
