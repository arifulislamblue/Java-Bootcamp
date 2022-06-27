package Shopping;

public class Item {
    private String name;
    private  double price;

    public Item(String name, double price) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.price = price;
    }
    public Item(Item source) {
        this.name = source.name;
        this.price = source.price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }
    public String toString() {
        return  name + ": $" + price + " ";
    }
}
