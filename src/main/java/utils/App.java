package utils;

public enum App {

    HEPSIBURADA("com.pozitron.hepsiburada","com.hepsiburada.ui.startup.SplashActivity"),

    ;

    public String appPackage;
    public String appActivity;

    App(String appPackage, String appActivity) {
        this.appPackage = appPackage;
        this.appActivity = appActivity;
    }
}
