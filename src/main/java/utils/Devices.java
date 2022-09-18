package utils;

public enum Devices {

    HUAWEI("L2N4C19923015627","11","MyPhone","Android","true"),

    ;

    public String udid;
    public String version;
    public String deviceName;
    public String platformName;
    public String noReset;

    Devices(String udid, String version, String deviceName, String platformName,String noReset) {
        this.udid = udid;
        this.version = version;
        this.deviceName = deviceName;
        this.platformName = platformName;
        this.noReset = noReset;
    }
}
