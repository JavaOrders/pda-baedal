package restaurant;

import java.util.HashMap;
import java.util.List;

public class RestaurantController {

    RestaurantService restaurantService = new RestaurantService();

    public Restaurant openRestaurant(String name, List<HashMap<String, Integer>> menus) {
        return restaurantService.openRestaurant(name, menus);
    }

//    레스토랑 리스트 조회

//    하나의 레스토랑 조회

//    하나의 레스토랑에 해당하는 메뉴들 조회

//    주문받기

}
