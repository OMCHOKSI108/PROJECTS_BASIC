import java.util.List;

public class Order {
    private int orderId;
    private List<Item> items;
    private double totalPrice;

    // Constructor to initialize Order with items and orderId
    public Order(int orderId, List<Item> items) {
        this.orderId = orderId;
        this.items = items;
        this.totalPrice = calculateTotalPrice();
    }

    // Inner class Item represents each item in the order
    public static class Item {
        private String name;
        private double price;
        private int quantity;

        public Item(String name, double price, int quantity) {
            if (price < 0) throw new IllegalArgumentException("Price cannot be negative.");
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public double getItemTotal() {
            return price * quantity;
        }

        // Getter methods for private fields
        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }
    }

    // Calculate the total price of all items in the order
    private double calculateTotalPrice() {
        double total = 0;
        for (Item item : items) {
            total += item.getItemTotal();
        }
        return total;
    }

    public int getOrderId() {
        return orderId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public List<Item> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId + ", Total Price: " + totalPrice;
    }
}
