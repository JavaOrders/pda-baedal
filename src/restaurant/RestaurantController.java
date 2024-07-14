package restaurant;

import java.util.HashMap;
import java.util.List;
import menu.Menu;

public class RestaurantController {

    RestaurantService restaurantService = new RestaurantService();

    public Restaurant openRestaurant(String name, List<HashMap<String, Integer>> menus) {
        return restaurantService.openRestaurant(name, menus);
    }

    //    레스토랑 리스트 조회
    public List<Restaurant> showRestaurants() {
        return restaurantService.showRestaurants();
    }

    //    하나의 레스토랑 조회
    public Restaurant showRestaurant(int id) {
        return restaurantService.showRestaurant(id);
    }

    //    하나의 레스토랑에 해당하는 메뉴들 조회
    public List<Menu> showMenusByRestaurantName(String restaurantName) {
        return restaurantService.showMenusByRestaurantName(restaurantName);
    }

//    주문받기

}
