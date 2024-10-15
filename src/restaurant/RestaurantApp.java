package restaurant;
// Main class to demonstrate collaboration
public class RestaurantApp {
    public static void main(String[] args) {
        // Creating customer
        Customer customer = new Customer("Bob"); // Update customer name to Bob - Jake Yatco
        
        // Creating menu items
        // Change price of ordered menu item by adding 1 dollar - Jake Yatco
        MenuItem pizza = new MenuItem("Pizza", 9.99); 
        MenuItem burger = new MenuItem("Burger", 6.49); 
        MenuItem soda = new MenuItem("Soda", 2.99);
        
        // Customer adds items to their order
        // Update the method name to addToOrder - Jake Yatco
        customer.addToOrder(pizza);  // Collaborating with MenuItem and Order
        customer.addToOrder(burger);
        customer.addToOrder(soda);
        
        // Customer places the order
        customer.placeOrder();  // Collaborating with Order to show order summary
    }
}
