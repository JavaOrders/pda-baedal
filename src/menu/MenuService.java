package menu;

import java.util.HashMap;
import java.util.List;

public class MenuService {
    MenuDAO menuDao = new MenuDAO();

    public List<Menu> getNewMenus(String restaurantName, List<HashMap<String, Integer>> menu) {
        return menuDao.create(restaurantName, menu);
    }

}
