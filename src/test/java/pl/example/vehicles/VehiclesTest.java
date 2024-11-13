// Plik: VehiclesTest.java
package pl.example.vehicles;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehiclesTest {

    @Test
    public void testCarMaxSpeed() {
        pl.example.vehicles.Car car = new pl.example.vehicles.Car("Sedan", 4);
        assertEquals(200, car.getMaxSpeed());
    }

    @Test
    public void testBikeMaxSpeed() {
        pl.example.vehicles.Bike bike = new pl.example.vehicles.Bike("Mountain Bike");
        assertEquals(50, bike.getMaxSpeed());
    }

    @Test
    public void testCarDoors() {
        pl.example.vehicles.Car car = new pl.example.vehicles.Car("Hatchback", 5);
        assertEquals(5, car.getDoors());
    }

    @Test
    public void testVehicleName() {
        pl.example.vehicles.Car car = new Car("Convertible", 2);
        assertEquals("Convertible", Car.getName());
    }
}
