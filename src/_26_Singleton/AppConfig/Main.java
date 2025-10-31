package _26_Singleton.AppConfig;

public class Main {
    public static void main(String[] args) {
        AppConfig config = AppConfig.getInstance();

        config.setApiKey("TEST_KEY_123");
        config.setApiKey("DEBUG");

        AppConfig anotherConfig = AppConfig.getInstance();

        System.out.println(anotherConfig.getApiKey());
        System.out.println(anotherConfig.getAppMode());
    }
}
