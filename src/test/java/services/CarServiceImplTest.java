package services;

import domain.Car;
import lombok.Data;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Data
class CarServiceImplTest {
    private final String DEFAULT_MARK = "вольво";
    private final String DEFAULT_COLOR = "белый";
    List<Car> carTest = new ArrayList<>();

    @Test
    void takeCarByMark() {
        Car car = new Car( DEFAULT_MARK, DEFAULT_COLOR );
        carTest.add( car );
        CarService carService = new CarServiceImpl( carTest );
        assertFalse( carTest.isEmpty() );
        carService.takeCarByMark( car.getMark() );
        assertEquals( DEFAULT_MARK, car.getMark() );
        assertTrue(carTest.isEmpty());
        carService.takeCarByMark( DEFAULT_MARK );
        assertEquals( DEFAULT_MARK, car.getMark() );
        assertTrue(carTest.isEmpty());
    }

    @Test
    void putCar() {
        Car car = new Car( DEFAULT_MARK, DEFAULT_COLOR );
        carTest.add( car );
        CarService carService = new CarServiceImpl( carTest );
        assertFalse( carTest.isEmpty() );
        carService.putCar( car );
        assertEquals( DEFAULT_MARK, car.getMark() );
        assertFalse(carTest.isEmpty());
        assertEquals( DEFAULT_MARK, carTest.get(1).getMark() );
        assertEquals( DEFAULT_MARK, carTest.get(0).getMark() );


    }

    @Test
    void hasCar() {
        Car car = new Car( DEFAULT_MARK, DEFAULT_COLOR );
        carTest.add( car );
        CarService carService = new CarServiceImpl( carTest );
        assertFalse( carTest.isEmpty() );
        assertTrue( carService.hasCar( car.getMark() ) );

    }

    @Test
    void printCars() {
        Car car = new Car( DEFAULT_MARK, DEFAULT_COLOR );
        carTest.add( car );
        CarService carService = new CarServiceImpl( carTest );
        assertFalse( carTest.isEmpty() );
        carService.printCars( );
        assertEquals( DEFAULT_MARK, car.getMark() );
        assertEquals( DEFAULT_COLOR, car.getColor() );


    }
}