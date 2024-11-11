public class OrderProcessor implements Runnable {
    private static int totalOrdersProcessed = 0;
    private static final Object lock = new Object();
    private Order order;

    // Constructor initializes OrderProcessor with an Order
    public OrderProcessor(Order order) {
        this.order = order;
    }

    @Override
    public void run() {
        try {
            processOrder();
        } catch (IllegalArgumentException e) {
            System.out.println("Order " + order.getOrderId() + " failed: " + e.getMessage());
        }
    }

    // Process the order and increment total orders processed
    private void processOrder() {
        double orderTotal = order.getTotalPrice();
        System.out.println("Processing " + order + " by " + Thread.currentThread().getName());
        
        // Synchronized block to increment the total orders processed
        synchronized (lock) {
            totalOrdersProcessed++;
        }
        
        System.out.println("Order processed successfully. Total Orders Processed: " + getTotalOrdersProcessed());
    }

    // Static method to get the total count of orders processed
    public static int getTotalOrdersProcessed() {
        synchronized (lock) {
            return totalOrdersProcessed;
        }
    }
}
