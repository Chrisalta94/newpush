//Jackinston jean/Christopher Altamirano. CSC210, clothing store, version 2.0, 5/15/24
public class ClothingStore {
    // Arrays to store username, password, item names, and prices
    private String[][] userPass = {{"Baskin", "100 Chambers"}};
    private String[] itemNames = {"Shirt", "Pants", "Dress", "Jacket"};
    private double[] itemPrices = {20.0, 30.0, 125.0, 40.0};
    
    // Tax rate
    private final double TAX_RATE = 0.08;

    // Method to return username
    public String getUsername() {
        return userPass[0][0];
    }

    // Method to return password
    public String getPassword() {
        return userPass[0][1];
    }

    // Method to return price given an item name
    public double getPrice(String itemName) {
        for (int i = 0; i < itemNames.length; i++) {
            if (itemNames[i].equalsIgnoreCase(itemName)) {
                return itemPrices[i];
            }
        }
        return 0.0; // Return 0 if item not found
    }

    // Method to return the names of the items
    public String[] getItemNames() {
        return itemNames;
    }

    // Method to calculate the cost
    public double calculateCost(int quantity, String itemName) {
        double price = getPrice(itemName);
        return price * quantity;
    }

    // Method to calculate the taxes
    public double calculateTax(double price) {
        return (price * TAX_RATE);
    }

    // Method to calculate the total cost
    public double calculateTotalCost(int quantity, String itemName) {
        double cost = calculateCost(quantity, itemName);
        double tax = calculateTax(cost);
        return cost + tax ;
    }
}
