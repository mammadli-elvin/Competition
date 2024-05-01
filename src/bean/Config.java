package bean;

public class Config {
    private Config() {

    }
    private static Config config;
    private static boolean loggedIn;
    private static Competitor[] competitors;

    public static Config instance() {
        if(config == null) {
            config = new Config();
        }
        return config;
    }

    public static boolean isLoggedIn() {
        return loggedIn;
    }

    public static void setLoggedIn(boolean loggedIn) {
        Config.loggedIn = loggedIn;
    }

    public static Competitor[] getCompetitors() {
        return competitors;
    }

    public static void setCompetitors(Competitor[] competitors) {
        Config.competitors = competitors;
    }

}
