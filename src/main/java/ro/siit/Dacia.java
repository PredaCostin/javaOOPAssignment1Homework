package ro.siit;

// Dacia brand
abstract class Dacia extends Car {
    public Dacia(int availableFuel, String chassisNumber) {
        super(availableFuel, chassisNumber);
        fuelTankSize = 50; // liters
        fuelType = FuelType.PETROL;
        gears = 5;
        consumptionPer100Km = 6.0f; // default consumption
        tireSize = 15; // inches
    }

    @Override
    public float getAverageFuelConsumption() {
        // Implement method to get average fuel consumption
        return 0;
    }

    @Override
    public void shiftGear(int gear) {
        // Implement method to shift gear
    }
}

// Logan model of Dacia
class Logan extends Dacia {
    public Logan(int availableFuel, String chassisNumber) {
        super(availableFuel, chassisNumber);
        consumptionPer100Km = 5.5f; // Override consumption for Logan
    }
}

