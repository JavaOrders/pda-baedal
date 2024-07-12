package menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MenuDAO {
    Map<Integer, Menu> map = new HashMap<Integer, Menu>();

    public List<Menu> getNewMenus() {
        return new ArrayList<Menu>();
    }
}
