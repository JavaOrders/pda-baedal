package menu;

public class Menu {
    private Restaurant restaurant;
    private String name;
    private int price;
    private int amount;

    Menu(String name, int price, int amount, Restaurant restaurant) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.restaurant = restaurant;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
