import java.util.ArrayList;
import java.util.List;

public class OrderSummary {
    private List<String> summaries;

    // Constructor initializes OrderSummary
    public OrderSummary() {
        summaries = new ArrayList<>();
    }

    // Adds a summary for an order
    public void addOrderSummary(Order order) {
        StringBuilder summary = new StringBuilder();
        summary.append("Order ID: ").append(order.getOrderId()).append("\nItems:\n");

        for (Order.Item item : order.getItems()) {
            summary.append(item.getName())
                   .append(" - Quantity: ").append(item.getQuantity())
                   .append(", Price per item: ").append(item.getPrice())
                   .append(", Total: ").append(item.getItemTotal())
                   .append("\n");
        }

        summary.append("Order Total: ").append(order.getTotalPrice()).append("\n");
        summaries.add(summary.toString());
    }

    // Display all order summaries
    public void displaySummaries() {
        System.out.println("Order Summaries:");
        for (String summary : summaries) {
            System.out.println(summary);
        }
    }
}
