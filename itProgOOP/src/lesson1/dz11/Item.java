package lesson1.dz11;

public class Item {
    private int price;
    private String description;
    private double weight;

    public Item(int price, String description, double weight) {
        this.price = price;
        this.description = description;
        this.weight = weight;
        System.out.println("Test");
    }
    public Item() {
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Item{" +
                "price=" + price +
                ", description='" + description + '\'' +
                ", weight=" + weight +
                '}';
    }
}
// В качестве свойств товара можете использовать значение цены,
//описание, вес товара.