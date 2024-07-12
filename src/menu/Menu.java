package menu;

public class Menu {
    private String restaurantName;
    private String name;
    private int price;
    private int amount;

    Menu(String restaurantName, String name, int price) {
        this.restaurantName = restaurantName;
        this.name = name;
        this.price = price;
    }

    Menu(String name, int price, int amount, String restaurantName) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.restaurantName = restaurantName;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
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

    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append("name: ").append(name).append(" price: ").append(price).append(" \n").toString();
    }
}
