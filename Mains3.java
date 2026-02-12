import java.util.ArrayList;
import java.util.List;

// 1. Product Class
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return "Product: " + name + " | Price: $" + price;
    }
}

// 2. ShoppingCart Class
class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Added: " + product.getName());
    }

    public void removeProduct(String productName) {
        boolean removed = products.removeIf(p -> p.getName().equalsIgnoreCase(productName));
        if (removed) {
            System.out.println("Removed: " + productName);
        } else {
            System.out.println("Product '" + productName + "' not found in cart.");
        }
    }

    public double calculateTotalCost() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    public void displayCart() {
        System.out.println("\n--- Your Shopping Cart ---");
        if (products.isEmpty()) {
            System.out.println("The cart is empty.");
        } else {
            for (Product p : products) {
                System.out.println(p);
            }
            System.out.printf("Total Cost: $%.2f\n", calculateTotalCost());
        }
        System.out.println("--------------------------");
    }
}

// 3. Main Class (Named Mains3 to match your filename)
public class Mains3 {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(new Product("Laptop", 1200.00));
        cart.addProduct(new Product("Smartphone", 800.00));
        cart.addProduct(new Product("Headphones", 150.00));
        cart.displayCart();
        cart.removeProduct("Smartphone");
        cart.displayCart();
    }
}