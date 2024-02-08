package services;

import domain.Car;

public interface CarService {
    void takeCarByMark(String mark);

    void putCar(Car car);

    boolean hasCar(String mark);

    void printCars();


}
