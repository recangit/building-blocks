package se.recan.systeminfo;

import java.util.Properties;
import java.util.Enumeration;
import java.util.Map;
import org.apache.log4j.Logger;
import se.recan.utils.IOutil;

public class SystemInfo {

    private static final Logger LOGGER = Logger.getLogger("Logger");
    
    public static void main(String[] args) {
        
        LOGGER.debug(IOutil.info("SystemInfo"));
        
        LOGGER.debug("");
        LOGGER.debug(IOutil.printAsterix("RUNTIME"));
        Runtime r = Runtime.getRuntime();
        LOGGER.debug("Maximum amount of memory that the Java virtual machine will attempt to use => " + r.maxMemory() / 1024);
        LOGGER.debug("Free memory in the Java Virtual Machine => " + r.freeMemory() / 1024);
        LOGGER.debug("Total amount of memory in the Java virtual machine =>" + r.totalMemory() / 1024);

        LOGGER.debug("");
        LOGGER.debug(IOutil.printAsterix("SYSTEM ENVIRONMENT"));

        Map<String, String> map = System.getenv();

        for (String key : map.keySet()) {
            LOGGER.debug(key + " => " + map.get(key));
        }

        LOGGER.debug("");
        LOGGER.debug(IOutil.printAsterix("SYSTEM PROPERTIES"));
        Properties p = System.getProperties();
        Enumeration e = p.propertyNames();
        while (e.hasMoreElements()) {
            String tmp = (String) e.nextElement();
            LOGGER.debug(tmp + " => " + System.getProperty(tmp));
        }
    }
}
