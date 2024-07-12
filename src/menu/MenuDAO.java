package menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MenuDAO {
    Map<Integer, Menu> menuDB = new HashMap<Integer, Menu>();

    public List<Menu> create(String restaurantName, List<HashMap<String, Integer>> menus) {
        List<Menu> menuList = new ArrayList<>();
        for (HashMap<String, Integer> menuMap : menus) {
            for (Map.Entry<String, Integer> entry : menuMap.entrySet()) {
                String menuName = entry.getKey();
                int menuPrice = entry.getValue();
                Menu menu = new Menu(restaurantName, menuName, menuPrice);
                menuList.add(menu);
            }
        }
        save(menuList);
        return menuList;
    }

    private void save(List<Menu> menus) {
        int pk = menuDB.size();
        for (Menu menu : menus) {
            menuDB.put(pk++, menu);
        }
    }
}
