package ro.siit;

// Abstract class for Car
abstract class Car extends Vehicle {
    protected int fuelTankSize;
    protected FuelType fuelType;
    protected int gears;
    protected float consumptionPer100Km;
    protected int tireSize;
    private int currentGear;

    public Car(float availableFuel, String chassisNumber) {
        super(availableFuel, chassisNumber);
    }

    // Method to calculate current consumption based on gear and tire size
    protected void calculateConsumption(int gear) {
        // TODO Implement consumption calculation based on gear and tire size
    }

    public int getCurrentGear() {
        return currentGear;
    }
}
