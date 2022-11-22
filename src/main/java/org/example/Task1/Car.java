package org.example.Task1;
/*
1. Створити клас "Автомобіль". У класі має зберігатися така інформація:
    назва автомобіля;
    рік випуску;
    вартість;
    колір;
    об'єм двигуна.
Потрібно створити набір автомобілів та виконати такі завдання:
    відобразити всі автомобілі;
    відобразити автомобілі вказаного кольору
    відобразити автомобілі дорожче зазначеної ціни;
    відобразити автомобілі, чий рік випуску знаходиться у заданому діапазоні;
    сортувати автомобілі в порядку зменшення вартості.
Завдання вирішити за допомогою прикладного інтерфейсу Stream API.
 */

import java.util.Objects;

public class Car {
    private String name;
    private int year;
    private int price;
    private String color;
    private double engine;

    public Car(String name, int year, int price, String color, double engine) {
        this.name = name;
        this.year = year;
        this.price = price;
        this.color = color;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getYear() == car.getYear() && getPrice() == car.getPrice() && Double.compare(car.getEngine(), getEngine()) == 0 && Objects.equals(getName(), car.getName()) && Objects.equals(getColor(), car.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getYear(), getPrice(), getColor(), getEngine());
    }
}
