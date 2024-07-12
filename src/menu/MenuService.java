package menu;

import java.util.List;

public class MenuService {
    MenuDAO menuDao = new MenuDAO();

    public List<Menu> getNewMenus() {
        return menuDao.getNewMenus();
    }

}
