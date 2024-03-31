package ro.siit;

// Abstract class for Vehicle
abstract class Vehicle {
    private String chassisNumber;
    private float availableFuel;
    private float totalFuelConsumed;
    private float currentConsumption;
    private boolean isRunning;

    // Constructor
    public Vehicle(float availableFuel, String chassisNumber) {
        this.availableFuel = availableFuel;
        this.chassisNumber = chassisNumber;
    }

    // Method to start the vehicle
    public void start() {
        //TODO Implement start behavior
    }

    // Method to stop the vehicle
    public void stop() {
        //TODO Implement stop behavior
    }

    // Method to drive the vehicle for a certain distance
    public void drive(float distance) {
        //TODO Implement drive behavior
    }

    // Abstract method to get the average fuel consumption per 100 Km
    public abstract float getAverageFuelConsumption();

    // Abstract method to shift gear
    public abstract void shiftGear(int gear);

    // Getters and setters
    public float getAvailableFuel() {
        return availableFuel - totalFuelConsumed;
    }

    public String getChassisNumber() {
        return chassisNumber;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public float getCurrentConsumption() {
        return currentConsumption;
    }

    public float getTotalFuelConsumed() {
        return totalFuelConsumed;
    }
}
