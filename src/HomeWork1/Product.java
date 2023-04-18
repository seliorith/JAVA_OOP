package HomeWork1;

public abstract class Product {
    private String name;
    private Integer cost;

    public Product(String name, Integer cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public Integer getCost() {
        return cost;
    }

    public String toString() {
        return String.format("Drink name: %s price: %d ", name, cost);
    }
}
