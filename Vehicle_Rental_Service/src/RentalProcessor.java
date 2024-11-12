public class RentalProcessor implements Runnable {
    private static int totalRentalsProcessed = 0;
    private static final Object lock = new Object();
    private Rental rental;

    public RentalProcessor(Rental rental) {
        this.rental = rental;
    }

    @Override
    public void run() {
        try {
            rental.rentVehicle();
            incrementTotalRentals();
        } catch (IllegalStateException e) {
            System.out.println("Rental " + rental.getRentalId() + " failed: " + e.getMessage());
        }
    }

    private void incrementTotalRentals() {
        synchronized (lock) {
            totalRentalsProcessed++;
            System.out.println("Total Rentals Processed: " + totalRentalsProcessed);
        }
    }

    public static int getTotalRentalsProcessed() {
        synchronized (lock) {
            return totalRentalsProcessed;
        }
    }
}
