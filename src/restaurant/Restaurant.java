package restaurant;

import java.util.List;
import menu.Menu;

public class Restaurant {
    private String name;
    private List<Menu> menus;

    Restaurant(String name, List<Menu> menus) {
        this.name = name;
        this.menus = menus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

}
