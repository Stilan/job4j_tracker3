package ru.job4j.tracker.zd;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];
        Car car = new Car();
        Bike bike = new Bike();
        vehicles[0] = car;
        vehicles[1] = bike;
        for (Vehicle v : vehicles) {
            v.start();
            v.stop();
        }
        Vehicle vehicleCar = car;
        System.out.println(vehicleCar);
        // Пример безопасного понижающего приведения для Car
        if (vehicleCar instanceof Car) {
            car = (Car) vehicleCar;
            System.out.println("Приведение к Car прошло успешно: " + car);
        }

        // Демонстрация для Bike
        vehicleCar = bike;
        System.out.println("vehicleCar: " + vehicleCar);
        if (vehicleCar instanceof Bike) {
            bike = (Bike) vehicleCar;
            System.out.println("Приведение к Bike прошло успешно: " + bike);
        }

    }
}
