package ro.siit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VehicleTest {

    @Test
    public void testStart() {
        Vehicle vehicle = new Logan(50, "123456");
        vehicle.start();
        Assertions.assertTrue(vehicle.isRunning());
    }

    @Test
    public void testStop() {
        Vehicle vehicle = new Logan(50, "123456");
        vehicle.start();
        vehicle.stop();
        Assertions.assertFalse(vehicle.isRunning());
    }

    @Test
    public void testDrive() {
        Vehicle vehicle = new Logan(50, "123456");
        vehicle.start();
        vehicle.drive(10);
        Assertions.assertEquals(10, vehicle.getTotalFuelConsumed());
    }

    @Test
    public void testGetAverageFuelConsumption() {
        Vehicle vehicle = new Logan(50, "123456");
        Assertions.assertEquals(5.5f, vehicle.getAverageFuelConsumption());
    }

    @Test
    public void testShiftGear() {
        Car car = new Logan(50, "123456");
        car.start();
        car.shiftGear(2);
        Assertions.assertEquals(2, car.getCurrentGear());
    }
}

