
public class Main {
    public static void main(String[] args) {
        Vehicle car1 = new Vehicle("Car");
        Vehicle car2 = new Vehicle("Car");

        Rental rental1 = new Rental(1, car1);
        Rental rental2 = new Rental(2, car2);

        RentalSummary rentalSummary = new RentalSummary();

        Thread thread1 = new Thread(new RentalProcessor(rental1), "Thread-1");
        Thread thread2 = new Thread(new RentalProcessor(rental2), "Thread-2");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        rentalSummary.addRentalSummary(rental1);
        rentalSummary.addRentalSummary(rental2);

        rentalSummary.displaySummaries();
    }
}
