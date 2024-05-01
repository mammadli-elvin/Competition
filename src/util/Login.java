package util;

import Service.menu.inter.MenuService;
import bean.Config;

import java.util.Scanner;

public final class Login {

    public static void loginProcess() {
        for (int i = 0; true; i++) {
            System.out.println("Please enter username:");
            Scanner sc = new Scanner(System.in);
            String username = sc.nextLine();

            System.out.println("Please enter password:");
            Scanner sc2 = new Scanner(System.in);
            String password = sc2.nextLine();
            if (username.equalsIgnoreCase("admin") && password.equals("12345")) {
                System.out.println("====================");
                System.out.println("Succesfully login");
                System.out.println("====================");
                Config.setLoggedIn(true);
                break;
            } else if(i < 2) {
                System.out.println("Wrong username or password\n");
            } else {
                throw new IllegalArgumentException("You banned");
            }
        }
    }
}
