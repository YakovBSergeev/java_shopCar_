package services;

import domain.Car;
import lombok.Data;

import java.util.List;

@Data
public class CarServiceImpl implements CarService {
    private final List<Car> carFromStore;

    @Override
    public void takeCarByMark(String mark) {
        Car takeCar = null;
        for (Car car : carFromStore) {
            if (car.getMark().equals( mark )) {
                takeCar = car;
            }
        }
        if (takeCar != null) {
            carFromStore.remove( takeCar );
        }
    }

    @Override
    public void putCar(Car car) {
        carFromStore.add( car );

    }


    @Override
    public boolean hasCar(String mark) {
        for (Car car : carFromStore
        ) {
            if (car.getMark().equals( mark )) {
                return true;
            }

        }
        return false;
    }

    @Override
    public void printCars() {
        for (Car car : carFromStore
        ) {
            System.out.println( car.getMark() + " " + car.getColor() );
        }


    }


}
