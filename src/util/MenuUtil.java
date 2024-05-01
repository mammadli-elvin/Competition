package util;

import bean.Config;

import java.util.Scanner;

public class MenuUtil {
    public static void showMenu() {
        if(Config.isLoggedIn()) {
            System.out.println("--------------------");
            System.out.println("Please select one of the following options: ");
            Menu.showAllMenu();
            System.out.println("--------------------");
            Scanner sc = new Scanner(System.in);

            int selectedOption = sc.nextInt();
            Menu selectedMenu = Menu.findMenu(selectedOption);
            selectedMenu.process();
        } else {
            System.out.println("You are not logged in");
            Login.loginProcess();
            showMenu();
        }
    }


}
