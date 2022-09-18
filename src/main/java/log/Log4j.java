package log;

import org.apache.log4j.Logger;

public class Log4j {

    private static Logger Log = Logger.getLogger(Log4j.class.getName());

    public static void startLog(String testClassName) {
        Log.info("Test is starting...");
    }


    public static void endLog(String testClassName) {
        Log.info("Test is ending...");
    }

    public static void info(String message) {
        Log.info(message);
    }


}