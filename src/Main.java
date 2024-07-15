import main.MainView;
import restaurant.RestaurantController;

public class Main {
    public static void main(String[] args) {
        RestaurantController restaurantController = new RestaurantController();
        InitRestaurantMenu initRestaurantMenu = new InitRestaurantMenu(restaurantController);
        initRestaurantMenu.start();

        MainView mainView = new MainView(restaurantController);
        mainView.show();
    }
}