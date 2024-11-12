import java.util.ArrayList;
import java.util.List;

public class RentalSummary {
    private List<String> summaries = new ArrayList<>();

    public void addRentalSummary(Rental rental) {
        StringBuilder summary = new StringBuilder();
        summary.append("Rental ID: ").append(rental.getRentalId()).append("\n")
               .append("Vehicle Type: ").append(rental.getVehicle().getType()).append("\n")
               .append("Status: ").append(rental.getVehicle().isAvailable() ? "Returned" : "Rented").append("\n");
        summaries.add(summary.toString());
    }

    public void displaySummaries() {
        System.out.println("Rental Summaries:");
        for (String summary : summaries) {
            System.out.println(summary);
        }
    }
}
