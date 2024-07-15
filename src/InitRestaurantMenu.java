import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import menu.Menu;
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

        if (chaeyoonRestaurant == null) {
            System.out.println("이미 존재하는 가게이름");
        } else {
            System.out.println(chaeyoonRestaurant.getName());
            System.out.println(chaeyoonRestaurant.getMenus());
        }

        menus.clear();
        menu.clear();
        menu.put("짜장면", 5000);
        menu.put("짬뽕", 4000);
        menu.put("칼국수", 3000);
        menus.add(menu);
        chaeyoonRestaurant = restaurantController.openRestaurant("chaeyoon", menus);

        if (chaeyoonRestaurant == null) {
            System.out.println("이미 존재하는 가게이름");
        } else {
            System.out.println(chaeyoonRestaurant.getName());
            System.out.println(chaeyoonRestaurant.getMenus());
        }

        menus.clear();
        menu.clear();
        menu.put("팟타이", 8000);
        menu.put("쌀국수", 6000);
        menu.put("똠양꿍", 7000);
        menus.add(menu);
        Restaurant sooyeonRestaurant = restaurantController.openRestaurant("sooyeon", menus);
        System.out.println(sooyeonRestaurant.getName());
        System.out.println(sooyeonRestaurant.getMenus());

        List<Restaurant> restaurants = restaurantController.showRestaurants();
        for (int i = 0; i < restaurants.size(); ++i) {
            System.out.println((i + 1) + "번: " + restaurants.get(i).getName() + "가게");
        }

        int restaurantId = 0; // 채윤가게
        Restaurant restaurant = restaurantController.showRestaurant(restaurantId);
        if (restaurant != null) {
            System.out.println(restaurantId + "번: " + restaurant.getName() + "가게");
            List<Menu> restaurantMenus = restaurantController.showMenusByRestaurantName(restaurant.getName());
            for (Menu m : restaurantMenus) {
                System.out.println(m.getName() + ": " + m.getPrice() + "원");
            }
        } else {
            System.out.println(restaurantId + "번 가게 없음");
        }
    }


}
