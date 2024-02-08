package services;

import domain.Car;
import domain.Client;
import lombok.RequiredArgsConstructor;

import java.util.Scanner;

@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {
    private final Client client;
    private final Scanner scanner;
    private final CarService carService;

    @Override
    public void buyCar() {
        System.out.println( "Введите марку автомобиля." );
        String mark = scanner.next();
        if (carService.hasCar( mark )) {
            System.out.println( "Покупаем автомобиль ..." );
            carService.takeCarByMark( mark );
            System.out.println( "Купили автомобиль " + mark );
        } else {
            System.out.println( "Такого автомобиля нет." );
        }

    }

    @Override
    public void putCar() {
        System.out.println( "Введите марку автомобиля" );
        String mark = scanner.next();
        System.out.println( "Введите цвет автомобиля" );
        String color = scanner.next();

        Car car = new Car( mark, color );
        carService.putCar( car );
    }

    @Override
    public void printCar() {
        System.out.println( "Уважаемый " + client.getName() );
        System.out.println( "Автомобили в наличие:" );
        carService.printCars();
    }
}
