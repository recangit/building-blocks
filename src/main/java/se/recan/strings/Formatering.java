package se.recan.strings;

import java.lang.StringBuffer;
import java.util.Formatter;
import org.apache.log4j.Logger;
import se.recan.utils.IOutil;

/**
 * Väldigt slarvigt men något att utgå ifrån. Created: 2012-03-30 Last Modified:
 * 2012-03-30
 *
 * @author Anders Recksén (anders[at]recksen[dot]se)
 */
public class Formatering {

    private static final Logger LOGGER = Logger.getLogger("Logger");
    
    protected Formatering() {
        LOGGER.debug(IOutil.info(this));
        
        print("Applikations mall", "Kalle");
        print("Mall", "Kalle");
        print();
    }

    private void print() {
        StringBuffer buffer = new StringBuffer();
        Formatter formatter = new Formatter(buffer);

        formatter.format("%9.9s %1.70s\n", "A", "B", "C", "D");
        LOGGER.debug(buffer);

        formatter.format("%-10s %-10s %-10s %-10s", "A", "B", "C", "D");
        LOGGER.debug(buffer.toString());
    }

    private void print(String arg1, String arg2) {
        System.out.printf("%1$15s:  %2$3s%n", arg1, arg2);
        System.out.printf("MARGIN %s = %s\n", arg1, arg2);
    }
}
