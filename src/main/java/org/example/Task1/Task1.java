package org.example.Task1;

public class Task1 {
    public static void main(String[] args) {

        BaseCar baseCar = new BaseCar("Dnipro");
        baseCar.printAllCar();
        baseCar.printCarColor("blue");
        System.out.println("----------");
        baseCar.printCarOverPrice(20000);
        System.out.println("----------");
        baseCar.printCarByYearInTheRange(2016,2018);
        System.out.println("----------");
        baseCar.sortPrice();
        System.out.println("----------");
        baseCar.printAllCar();

    }
}
