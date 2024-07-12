package menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MenuDAO {
    Map<Integer, Menu> menuDB = new HashMap<Integer, Menu>();

    public List<Menu> create(List<Menu> menus) {
        return save(menus);
    }

    private List<Menu> save(List<Menu> menus) {
        int pk = menuDB.size();
        for (Menu menu : menus) {
            menuDB.put(pk++, menu);
        }
        return menus;
    }
}
