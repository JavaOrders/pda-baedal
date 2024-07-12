package menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MenuService {
    MenuDAO menuDao = new MenuDAO();

    public List<Menu> getNewMenus(String restaurantName, List<HashMap<String, Integer>> menuInfos) {

        List<Menu> menus = new ArrayList<>();
        for (HashMap<String, Integer> menuInfo : menuInfos) {
            for (Map.Entry<String, Integer> entry : menuInfo.entrySet()) {
                String menuName = entry.getKey();
                int menuPrice = entry.getValue();
                Menu menu = new Menu(restaurantName, menuName, menuPrice);
                menus.add(menu);
            }
        }
        return menuDao.create(menus);
    }

}
