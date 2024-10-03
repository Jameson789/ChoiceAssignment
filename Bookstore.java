public class Bookstore {
    // Arrays to store book information
    String[] titles = {"Java Programming", "Python Basics", "Data Structures"};
    String[] authors = {"John Doe", "Jane Smith", "Jameson Farmer"};
    int[] quantities = {5, 3, 7};
    double[] prices = {29.99, 24.99, 35.50};
    
    // Method to display the inventory
    public void displayInventory() {
        System.out.println("Bookstore Inventory:");
        for (int i = 0; i < titles.length; i++) {
            System.out.println("Title: " + titles[i] + ", Author: " + authors[i] + 
                                ", Quantity: " + quantities[i] + ", Price: $" + prices[i]);
        }
    }

    // Method to process an order
    public void processOrder(String bookTitle, int orderQuantity) {
        boolean bookFound = false;
        
        for (int i = 0; i < titles.length; i++) {
            if (titles[i].equalsIgnoreCase(bookTitle)) {
                bookFound = true;
                if (quantities[i] >= orderQuantity) {
                    double totalPrice = orderQuantity * prices[i];
                    quantities[i] -= orderQuantity;
                    System.out.println("Order successful! Total cost: $" + totalPrice);
                } else {
                    System.out.println("Insufficient stock for " + bookTitle + ". Available quantity: " + quantities[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Bookstore bookstore = new Bookstore();
        
        // Display the initial inventory
        bookstore.displayInventory();
        
        // Process an order for Python Basics
        System.out.println("\nProcessing order for 2 copies of 'Python Basics':");
        bookstore.processOrder("Python Basics", 2);
        
        // Display inventory after the order
        System.out.println("\nInventory after order:");
        bookstore.displayInventory();
    }
}
