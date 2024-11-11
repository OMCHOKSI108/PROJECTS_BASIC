# Multithreaded Order Processor

## Overview
This project simulates an order processing system where multiple orders are processed simultaneously using Java multithreading. Each order contains a list of items with prices and quantities, and the system calculates the total price of each order.

## Key Features
- **Multithreading**: Each order is processed in a separate thread to demonstrate concurrent processing.
- **Synchronization**: Ensures safe updates to the total count of processed orders.
- **Order Summaries**: Order details and totals are saved and displayed using `StringBuilder` for efficient string manipulation.

## Files
- **Order.java**: Defines the Order class and its items.
- **OrderProcessor.java**: Implements order processing with multithreading and synchronization.
- **OrderSummary.java**: Stores summaries of all orders.
- **Main.java**: Entry point; initializes and processes orders.

## How to Run
1. Compile all files.
2. Run `Main.java`.
3. View the output for order processing results and order summaries.

## Sample Output
