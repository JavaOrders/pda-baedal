import main.MainView;
import restaurant.RestaurantView;

public class Main {
    public static void main(String[] args) {
        InitRestaurantMenu initRestaurantMenu = new InitRestaurantMenu();
        initRestaurantMenu.start();

        RestaurantView restaurantView = new RestaurantView(initRestaurantMenu.getRestaurantController());
        MainView mainView = new MainView(restaurantView);
        mainView.show();

    }
}