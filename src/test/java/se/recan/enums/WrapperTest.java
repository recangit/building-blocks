package se.recan.enums;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.junit.Assert;
import org.apache.log4j.Logger;

/**
 * 2015-mar-17
 *
 * @author Anders Recksén (recan, Prolore)
 */
public class WrapperTest {

    private static final Logger LOGGER = Logger.getLogger("Logger");

    /**
     * Klassen TestData innehåller endast Strängar.
     */
    @Test
    public void testTestData() {
        List<TestData> list = new ArrayList<TestData>();
        list.add(new TestData("Ogift", "Anders"));
        list.add(new TestData("Gift", "Brorsan"));

        for (TestData t : list) {
            LOGGER.debug(t.toString());
        }
    }

    /**
     * Klassen TestDataWrapper överrider TestData för att kunna konvertera
     * Strängar till Enums.
     */
    @Test
    public void testTestDataWrapper() {
        List<TestDataWrapper> list = new ArrayList<TestDataWrapper>();
        list.add(new TestDataWrapper("Ogift", "Anders"));
        list.add(new TestDataWrapper("Gift", "Brorsan"));

        for (TestDataWrapper t : list) {
            LOGGER.debug(t.toString());
        }
    }
}
