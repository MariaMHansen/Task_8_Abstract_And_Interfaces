public abstract class MenuItem {
    double price;

    public MenuItem() {
        this.price = 0.0;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MenuItem: " +
                "price: " + price;
    }
}