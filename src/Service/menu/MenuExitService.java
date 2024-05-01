package Service.menu;

import Service.menu.inter.MenuExitServiceInter;

public class MenuExitService implements MenuExitServiceInter {
    @Override
    public void process() {
        System.exit(0);
    }
}
