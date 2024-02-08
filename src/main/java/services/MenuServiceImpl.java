package services;

import lombok.RequiredArgsConstructor;

import java.util.Scanner;

@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService {
    private final ClientService clientService;
    private final Scanner scanner;


    @Override
    public void menu() {
        while (true) {
            printMenu();
            System.out.println( "Введите номер меню: " );
            int numMenu = scanner.nextInt();
            if (numMenu == 1) {
                System.out.println( "Вы выбрали купить автомобиль." );
                clientService.buyCar();
            } else if (numMenu == 2) {
                System.out.println( "Вы выбрали вернуть автомобиль." );
                clientService.putCar();
            } else if (numMenu == 3) {
                System.out.println( "Печатаем название автомобилей..." );
                clientService.printCar();
            } else {
                System.out.println( "До встречи!" );
                break;
            }

        }

    }

    @Override
    public void printMenu() {
        System.out.println( "1 - Купить; 2 - Вернуть; 3 - Список автомобилей; Все остальное выход" );

    }
}
