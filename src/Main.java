import main.MainController;
import main.MainView;
import restaurant.RestaurantController;

public class Main {
    public static void main(String[] args) {
        RestaurantController restaurantController = new RestaurantController();
        InitRestaurantMenu initRestaurantMenu = new InitRestaurantMenu(restaurantController);
        initRestaurantMenu.start();
        MainController mainController = new MainController();
        MainView mainView = new MainView(mainController, restaurantController);
        mainView.show();
    }
}