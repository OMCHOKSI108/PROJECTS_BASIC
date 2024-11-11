import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Sample orders
        Order order1 = new Order(1, Arrays.asList(
            new Order.Item("Item1", 200, 2),
            new Order.Item("Item2", 150, 1)
        ));
        
        Order order2 = new Order(2, Arrays.asList(
            new Order.Item("Item1", 100, 3),
            new Order.Item("Item2", 250, 2)
        ));
        
        OrderSummary orderSummary = new OrderSummary();
        
        // Start order processing in separate threads
        Thread thread1 = new Thread(new OrderProcessor(order1), "Thread-1");
        Thread thread2 = new Thread(new OrderProcessor(order2), "Thread-2");

        thread1.start();
        thread2.start();

        // Wait for threads to complete
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Add processed orders to summary
        orderSummary.addOrderSummary(order1);
        orderSummary.addOrderSummary(order2);

        // Display summaries
        orderSummary.displaySummaries();
    }
}
