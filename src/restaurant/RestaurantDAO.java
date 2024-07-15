package restaurant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RestaurantDAO {

    //레스토랑 리스트를 해쉬맵으로 선언
    static final HashMap<Integer, Restaurant> restaurantDB = new HashMap<>();

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

    public Restaurant findByName(String name) {
        return restaurantDB.values().stream().filter(restaurant -> restaurant.getName().equals(name)).findFirst()
                .orElse(null);
    }
}
