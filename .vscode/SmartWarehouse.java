import java.util.*;

interface Taxable {
    double calculateTax();
}

abstract class Item implements Taxable {
    protected String itemID;
    protected String name;
    protected double basePrice;

    public Item(String itemID, String name, double basePrice) {
        this.itemID = itemID;
        this.name = name;
        this.basePrice = basePrice;
    }

    public String getItemID() {
        return itemID;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getPriceWithTax() {
        return basePrice + calculateTax();
    }

    public abstract void display();
}

class PerishableItem extends Item {
    private String expiryDate;

    public PerishableItem(String itemID, String name, double basePrice, String expiryDate) {
        super(itemID, name, basePrice);
        this.expiryDate = expiryDate;
    }

    @Override
    public double calculateTax() {
        return basePrice * 1.05;
    }

    @Override
    public void display() {
        System.out.println("Perishable Item | ID: " + itemID +
                ", Name: " + name +
                ", Price: $" + basePrice +
                ", Expiry: " + expiryDate);
    }
}
class ElectronicItem extends Item {
    private int warrantyPeriod;

    public ElectronicItem(String itemID, String name, double basePrice, int warrantyPeriod) {
        super(itemID, name, basePrice);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public double calculateTax() {
        return basePrice * 0.15;
    }

    @Override
    public void display() {
        System.out.println("Electronic Item | ID: " + itemID +
                ", Name: " + name +
                ", Price: $" + basePrice +
                ", Warranty: " + warrantyPeriod + " months");
    }
}

public class SmartWarehouse {

    private static HashMap<String, Item> inventory = new HashMap<>();

    public static void main(String[] args) {

        inventory.put("P001", new PerishableItem("SP23R1", "Lays", 3.50, "2027/12/31"));
        inventory.put("E501", new ElectronicItem("Es34n1", "Mobile", 120.00, 36 ));

        System.out.println("Inventory List:");
        for (Item item : inventory.values()) {
            item.display();
        }

        System.out.println("\nSearching for ID E501:");
        Item found = inventory.get("E501");
        if (found != null) {
            found.display();
        }

        double total = 0;
        for (Item item : inventory.values()) {
            total += item.getPriceWithTax();
        }

        System.out.printf("\nTotal Inventory Value (Incl. Tax): $%.2f\n", total);
    }
}