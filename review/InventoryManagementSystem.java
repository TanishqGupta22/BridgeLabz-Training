import java.util.*;


interface AlertService {
    void sendLowStockAlert(Product product);
}

class Product {
    private int productId;
    private String name;
    private int stock;
    private int minStockLevel;

    public Product(int productId, String name, int stock, int minStockLevel) {
        this.productId = productId;
        this.name = name;
        this.stock = stock;
        this.minStockLevel = minStockLevel;
    }

    public int getProductId() {
        return productId;
    }

    public int getStock() {
        return stock;
    }

    public int getMinStockLevel() {
        return minStockLevel;
    }

    public void updateStock(int quantity) {
        if (quantity < 0 && stock + quantity <= 0) {
            stock = 0;
            System.out.println("⚠ Product is OUT OF STOCK → " + name);
            return;
        }
        stock += quantity;
    }

    @Override
    public String toString() {
        return "ProductID: " + productId +
               ", Name: " + name +
               ", Stock: " + stock;
    }
}

class Inventory implements AlertService {

    private Map<Integer, Product> productMap = new HashMap<>();

    private PriorityQueue<Product> lowStockQueue =
            new PriorityQueue<>(Comparator.comparingInt(Product::getStock));

    public void addProduct(Product product) {
        productMap.put(product.getProductId(), product);
        checkLowStock(product);
    }

    public void updateProductStock(int productId, int quantity) {
        Product product = productMap.get(productId);

        if (product == null) {
            System.out.println("Product not found!");
            return;
        }

        product.updateStock(quantity);
        checkLowStock(product);
    }

    public void displayInventory() {
        System.out.println("\n--- Inventory Status ---");
        for (Product product : productMap.values()) {
            System.out.println(product);
        }
    }

    private void checkLowStock(Product product) {
        if (product.getStock() <= product.getMinStockLevel()) {
            lowStockQueue.offer(product);
            sendLowStockAlert(product);
        }
    }

    @Override
    public void sendLowStockAlert(Product product) {
        System.out.println("⚠ LOW STOCK ALERT → " + product);
    }

    public void showLowStockPriority() {
        System.out.println("\n--- Low Stock Priority ---");
        PriorityQueue<Product> temp = new PriorityQueue<>(lowStockQueue);
        while (!temp.isEmpty()) {
            System.out.println(temp.poll());
        }
    }
}

public class InventoryManagementSystem {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        inventory.addProduct(new Product(101, "Laptop", 10, 5));
        inventory.addProduct(new Product(102, "Mouse", 3, 5));
        inventory.addProduct(new Product(103, "Keyboard", 7, 4));

        inventory.displayInventory();

        inventory.updateProductStock(101, -6);  // low stock
        inventory.updateProductStock(102, -5);  // out of stock (no exception)

        inventory.displayInventory();

        inventory.showLowStockPriority();
    }
}

