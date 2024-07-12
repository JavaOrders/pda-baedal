package restaurant;

import java.util.HashMap;
import java.util.List;
import menu.Menu;

public class RestaurantDAO {

    //레스토랑 리스트를 해쉬맵으로 선언
    HashMap<Integer, Restaurant> restaurants = new HashMap<>();

    //가게 이름을 저장할 함수
    public Restaurant save(String name, List<Menu> menus) {
        Restaurant restaurant = new Restaurant(name, menus);
        int pk = restaurants.size();
        restaurants.put(pk, restaurant);
        return restaurant;
    }


}
