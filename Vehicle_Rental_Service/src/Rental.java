public class Rental {
    private int rentalId;
    private Vehicle vehicle;

    public Rental(int rentalId, Vehicle vehicle) {
        this.rentalId = rentalId;
        this.vehicle = vehicle;
    }

    public int getRentalId() {
        return rentalId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void rentVehicle() {
        if (vehicle.isAvailable()) {
            vehicle.rent();
            System.out.println(vehicle.getType() + " rented successfully. Rental ID: " + rentalId);
        } else {
            System.out.println(vehicle.getType() + " is currently unavailable.");
        }
    }

    public void returnVehicle() {
        vehicle.returnVehicle();
        System.out.println(vehicle.getType() + " returned successfully. Rental ID: " + rentalId);
    }
}
