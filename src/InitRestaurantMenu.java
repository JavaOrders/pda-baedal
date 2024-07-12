import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import restaurant.Restaurant;
import restaurant.RestaurantController;

public class InitRestaurantMenu {
    RestaurantController restaurantController;

    InitRestaurantMenu() {
        restaurantController = new RestaurantController();
    }

    public void start() {
        List<HashMap<String, Integer>> menus = new ArrayList<>();
        HashMap<String, Integer> menu = new HashMap<>();
        menu.put("짜장면", 5000);
        menu.put("짬뽕", 4000);
        menu.put("칼국수", 3000);
        menus.add(menu);
        Restaurant chaeyoonRestaurant = restaurantController.openRestaurant("chaeyoon", menus);

        System.out.println(chaeyoonRestaurant.getName());
        System.out.println(chaeyoonRestaurant.getMenus());

        menus.clear();
        menu.clear();
        menu.put("팟타이", 8000);
        menu.put("쌀국수", 6000);
        menu.put("똠양꿍", 7000);
        menus.add(menu);
        Restaurant sooyeonRestaurant = restaurantController.openRestaurant("sooyeon", menus);
        System.out.println(sooyeonRestaurant.getName());
        System.out.println(sooyeonRestaurant.getMenus());
    }

}
