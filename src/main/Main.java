package main;

import util.Login;
import util.MenuUtil;

public class Main {
    public static void main(String[] args) {
        Login.loginProcess();
        MenuUtil.showMenu();
    }
}