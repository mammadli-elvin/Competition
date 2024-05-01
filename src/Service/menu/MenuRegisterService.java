package Service.menu;

import Service.menu.inter.MenuRegisterServiceInter;
import bean.Competitor;
import bean.Config;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class MenuRegisterService implements MenuRegisterServiceInter {
    @Override
    public void process() {
        System.out.println("How many competitors do you want to register? ");
        Scanner sc = new Scanner(System.in);
        int numCompetitors  = sc.nextInt();
        Competitor[] competitors = new Competitor[numCompetitors];
        for (int i = 0; i < numCompetitors; i++) {
            System.out.println("Competitor #" + (i + 1));
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Enter Competitor Name: ");
            String competitorName = sc2.nextLine();
            System.out.println("Enter Competitor Surname: ");
            Scanner sc3 = new Scanner(System.in);
            String competitorSurname = sc3.nextLine();
            System.out.println("Enter Competitor age: ");
            Scanner sc4 = new Scanner(System.in);
            int competitorAge = sc4.nextInt();
            Competitor competitor = new Competitor(competitorName, competitorSurname, competitorAge);
            competitors[i] = competitor;
        }
        Config.setCompetitors(competitors);
    }
}
