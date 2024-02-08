package services;

import domain.Car;
import domain.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoreServiceImpl implements StoreService {
    @Override
    public void start() {
        Scanner scanner = new Scanner( System.in );
        System.out.println( "Введите Ваше ФИО :" );
        String clientName = scanner.next();

        Client client = new Client( clientName, new ArrayList<>() );

        List<Car> carList = new ArrayList<>();
        carList.add( new Car( "жигули", "желтый" ) );
        carList.add( new Car( "форд", "черный" ) );
        carList.add( new Car( "тойота", "белый" ) );

        CarService carService = new CarServiceImpl( carList );

        ClientService clientService = new ClientServiceImpl( client, scanner, carService );

        MenuService menuService = new MenuServiceImpl( clientService, scanner );
        menuService.menu();

    }
}
