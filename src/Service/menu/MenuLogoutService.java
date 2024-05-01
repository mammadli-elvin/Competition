package Service.menu;

import Service.menu.inter.MenuLogoutServiceInter;
import bean.Config;

public class MenuLogoutService implements MenuLogoutServiceInter {
    @Override
    public void process() {
        Config.setLoggedIn(false);
    }
}
