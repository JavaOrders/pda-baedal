package restaurant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RestaurantDAO {

    //레스토랑 리스트를 해쉬맵으로 선언
    HashMap<Integer, Restaurant> restaurantDB = new HashMap<>();

    //가게를 저장할 함수
    public Restaurant save(Restaurant restaurant) {
        int pk = restaurantDB.size();
        restaurantDB.put(pk, restaurant);
        return restaurant;
    }

    public List<Restaurant> findAll() {
        return new ArrayList<>(restaurantDB.values());
    }

    public Restaurant findById(int id) {
        return restaurantDB.get(id);
    }

}
