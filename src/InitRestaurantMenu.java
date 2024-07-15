import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import restaurant.Restaurant;
import restaurant.RestaurantController;

public class InitRestaurantMenu {
    private RestaurantController restaurantController;

    public RestaurantController getRestaurantController() {
        return restaurantController;
    }

    public InitRestaurantMenu(RestaurantController restaurantController) {
        this.restaurantController = restaurantController;
    }

    public void start() {
        List<HashMap<String, Integer>> menus = new ArrayList<>();
        HashMap<String, Integer> menu = new HashMap<>();

        menu.put("짜장면", 5000);
        menu.put("짬뽕", 4000);
        menu.put("칼국수", 3000);

        menus.add(menu);

        Restaurant chaeyoonRestaurant = restaurantController.openRestaurant("chaeyoon", menus);

        menus.clear();
        menu.clear();

        menu.put("팟타이", 8000);
        menu.put("쌀국수", 6000);
        menu.put("똠양꿍", 7000);

        menus.add(menu);
        Restaurant sooyeonRestaurant = restaurantController.openRestaurant("sooyeon", menus);

        menus.clear();
        menu.clear();

        menu.put("고구마피자", 10000);
        menu.put("콤비네이션피자", 15000);
        menu.put("포테이토피자", 20000);

        menus.add(menu);
        Restaurant hoRestaurant = restaurantController.openRestaurant("ho", menus);

        menus.clear();
        menu.clear();

        menu.put("빙그레우유", 3000);
        menu.put("바나나우유", 3000);
        menu.put("딸기우유", 3000);

        menus.add(menu);
        Restaurant nahyeonRestaurant = restaurantController.openRestaurant("nahyeon", menus);

        menus.clear();
        menu.clear();
        menu.put("에스프레소", 4500);
        menu.put("카페라떼", 5000);
        menu.put("카페모카", 5500);

        menus.add(menu);
        Restaurant jaeinRestaurant = restaurantController.openRestaurant("jaein", menus);

        menus.clear();
        menu.clear();
        menu.put("불고기버거", 4500);
        menu.put("치킨버거", 4000);
        menu.put("햄버거", 3000);

        menus.add(menu);
        Restaurant jaeukRestaurant = restaurantController.openRestaurant("jaeuk", menus);

        List<Restaurant> restaurants = restaurantController.showRestaurants();

    }


}
