import java.util.ArrayList;

record OrderItem(ProductForSale product, int quantity) {}

// pretend this is a Store class
public class AbstractClassChallenge {
    private static ArrayList<ProductForSale> products =
            new ArrayList<>();
    public static void main(String[] args) {
        products.add(new Milk("Milk", 3.49,
                "Dairy Milk by ABC"));
        products.add(new Milk("Light Milk", 2.49,
                "Light Dairy Milk by DEF"));
        products.add(new Egg("Caged Egg", 6.49,
                "Caged Eggs by ABC"));
        products.add(new Egg("Free Range Egg", 7.49,
                "Free Range Eggs by DEF"));

        listProducts();

        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItem(order1, 1, 2);
        addItem(order1, 0, 1);
        printOrder(order1);

        System.out.println("\nOrder 2");
        var order2 = new ArrayList<OrderItem>();
        addItem(order2, 3, 5);
        addItem(order2, 2, 3);
        addItem(order2, 1, 4);
        addItem(order2, 0, 7);
        printOrder(order2);
    }

    public static void listProducts() {
        for (var product : products) {
            System.out.println("-".repeat(30));
            product.showDetails();
        }
    }

    public static void addItem(ArrayList<OrderItem> order,
                               int orderIndex,
                               int qty) {
        order.add(new OrderItem(products.get(orderIndex), qty));
    }

    public static void printOrder(ArrayList<OrderItem> order) {
        double salesTotal = 0.0;
        System.out.println("=".repeat(30));
        for (var item : order) {
            item.product().printPricedLineItem(item.quantity());
            salesTotal += item.product().getSalesPrice(item.quantity());
        }
        System.out.println("-".repeat(30));
        System.out.printf("Sales total: $%6.2f %n", salesTotal);
        System.out.println("=".repeat(30));
    }
}

abstract class ProductForSale {
    protected String type;
    protected Double price;
    protected String description;

    public ProductForSale(String type, Double price,
                          String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int quantity) {
        return quantity*price;
    }

    public void printPricedLineItem(int quantity) {
        System.out.printf("%2d qty at $%8.2f each, " +
                        "%-15s %-35s %n",
                quantity, price, type, description);
    }

    public abstract void showDetails();
}



class Milk extends ProductForSale {
    public Milk(String type, Double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("This " + type + " is good");
        System.out.printf("The price is $%6.2f%n", price);
        System.out.println(description);
    }
}

class Egg extends ProductForSale {
    public Egg(String type, Double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("This " + type + " has a lot of protein");
        System.out.printf("The price is $%6.2f%n", price);
        System.out.println(description);
    }
}
