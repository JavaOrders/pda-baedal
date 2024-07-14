package restaurant;

import java.util.ArrayList;
import java.util.List;
import menu.Menu;

public class Restaurant {
    private String name;
    private List<Menu> menus;

    public Restaurant(String name) {
        this.name = name;
        this.menus = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void addMenu(Menu menu) {
        menus.add(menu);
    }

    public void addMenu(List<Menu> menus) {
        this.menus.addAll(menus);
    }

    @Override
    public String toString() {
        return "Restaurant{name='" + name + "', menus=" + menus + "}";
    }

    public Menu getMenuByName(String name) {
        for (Menu menu : menus) {
            if (menu.getName().equalsIgnoreCase(name)) {
                return menu;
            }
        }
        return null;
    }

}

