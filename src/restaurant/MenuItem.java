package restaurant;
// MenuItem class
public class MenuItem {
    private String name;
    private double priceInDollars; //Updated the name of the attribute - Jesse Hett

    public MenuItem(String name, double price) {
        this.name = name;
        priceInDollars = price; //no longer need 'this.' to distinguish here, as the parameter has a different name than the attribute - Jesse Hett
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return priceInDollars; //getter returns updated attribute name - Jesse Hett
    }
}
