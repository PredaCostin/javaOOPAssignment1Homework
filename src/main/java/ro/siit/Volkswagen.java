package ro.siit;

// Volkswagen brand
abstract class Volkswagen extends Car {
    public Volkswagen(int availableFuel, String chassisNumber) {
        super(availableFuel, chassisNumber);
        fuelTankSize = 60; // liters
        fuelType = FuelType.DIESEL;
        gears = 6;
        consumptionPer100Km = 5.0f; // default consumption
        tireSize = 16; // inches
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

// VWGolf model of Volkswagen
class VWGolf extends Volkswagen {
    public VWGolf(int availableFuel, String chassisNumber) {
        super(availableFuel, chassisNumber);
        consumptionPer100Km = 4.5f; // Override consumption for VWGolf
    }
}

// VWPassat model of Volkswagen
class VWPassat extends Volkswagen {
    public VWPassat(int availableFuel, String chassisNumber) {
        super(availableFuel, chassisNumber);
        consumptionPer100Km = 4.8f; // Override consumption for VWPassat
    }
}
