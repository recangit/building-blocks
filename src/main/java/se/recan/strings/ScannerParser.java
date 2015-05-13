package se.recan.strings;

import java.util.Scanner;
import org.apache.log4j.Logger;
import se.recan.utils.IOutil;

public class ScannerParser {

    private static final Logger LOGGER = Logger.getLogger("Logger");
    
    protected ScannerParser() {
        LOGGER.debug(IOutil.info(this));

        useDelimiter();
        findNumb();
    }

    private void useDelimiter() {
        String input = "1 fish 2 fish red fish blue fish";
        Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
        LOGGER.debug(s.nextInt());
        LOGGER.debug(s.nextInt());
        LOGGER.debug(s.next());
        LOGGER.debug(s.next());
        s.close();
    }

    private void findNumb() {
        String input = "Visar 5 till 10 av totalt 25 resultat";
        Scanner sc = new Scanner(input).useDelimiter("[^0-9]+");
        LOGGER.debug(sc.nextInt());
        LOGGER.debug(sc.nextInt());
        LOGGER.debug(sc.nextInt());
    }
}
