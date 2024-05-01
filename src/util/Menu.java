package util;

import Service.menu.MenuExitService;
import Service.menu.MenuLogoutService;
import Service.menu.MenuRegisterService;
import Service.menu.MenuStartGameService;
import Service.menu.inter.MenuService;

public enum Menu {
    LOGIN,
    REGISTER(1, "Register", new MenuRegisterService()),
    START(2, "Start competition", new MenuStartGameService()),
    LOGOUT(3, "Logout", new MenuLogoutService()),
    EXIT(4, "Exit", new MenuExitService()),
    UNKNOWN(5, "Unknown operation", null);

    private int number;
    private String label;
    private MenuService service;

    Menu() {

    }

    Menu(int number, String label, MenuService menuService) {
        this.number = number;
        this.label = label;
        this.service = menuService;
    }

    public int getNumber() {
        return number;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return number + ". " + getLabel();
    }

    public void process() {
        service.process();
        MenuUtil.showMenu();
    }

    public static void showAllMenu() {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if(menus[i] != LOGIN && menus[i] != UNKNOWN) {
                System.out.println(menus[i]);
            }
        }
    }

    public static Menu findMenu(int selectedOption) {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if(menus[i].getNumber() == selectedOption) {
                return menus[i];
            }
        }
        return UNKNOWN;
    }

}
