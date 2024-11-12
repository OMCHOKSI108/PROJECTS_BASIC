public class Vehicle {
    private String type;
    private boolean isAvailable;

    public Vehicle(String type) {
        this.type = type;
        this.isAvailable = true;
    }

    public String getType() {
        return type;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void rent() {
        if (!isAvailable) {
            throw new IllegalStateException("Vehicle already rented.");
        }
        isAvailable = false;
    }

    public void returnVehicle() {
        isAvailable = true;
    }

    @Override
    public String toString() {
        return type + " - " + (isAvailable ? "Available" : "Rented");
    }
}
