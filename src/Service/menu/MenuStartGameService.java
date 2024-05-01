package Service.menu;

import Service.menu.inter.MenuStartGameServiceInter;
import bean.Config;

import java.util.Random;
import java.util.Scanner;

public class MenuStartGameService implements MenuStartGameServiceInter {
    @Override
    public void process() {
        if(Config.getCompetitors() == null) {
            System.out.println("No competitors available");
            System.out.println("Please register competitor");
        } else {
            int lastCompetitor = Config.getCompetitors().length;
            System.out.println("Guess the number of the player who will win: " + "(Between 1-" + lastCompetitor + ")");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int winner = chooseWinner((lastCompetitor + 1));
            if (num == winner) {
                System.out.println("Congratulations! You won!");
            } else {
                System.out.println("You failed!");
                System.out.println("Winner: " + winner);
            }
        }
    }

    public int chooseWinner(int lastCompetitor) {
        Random r = new Random();
        return r.nextInt(lastCompetitor - 1) + 1;
    }
}
