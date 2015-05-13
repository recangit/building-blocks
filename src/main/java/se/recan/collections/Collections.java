package se.recan.collections;

import java.io.UnsupportedEncodingException;
import org.apache.log4j.Logger;
import se.recan.utils.IOutil;

/**
 *
 * Created: 2012-04-17 Last Modified: 2012-04-17
 *
 * @author Anders Recksén (anders[at]recksen[dot]se)
 */
public class Collections {
    
    private static final Logger LOGGER = Logger.getLogger("Logger");

    public Collections() {

        try {
            IOutil io = IOutil.getInstance(",", "#");
            io.addRow("Interfaces,Implementations,#,#,#,#");
            io.addRow("#,Hash Table,Resizable Array,Balanced Tree,Linked List,Hash Table + Linked List");
            io.addRow("Set,HashSet,#,TreeSet,#,LinkedHashSet");
            io.addRow("List,#,ArrayList,#,LinkedList,#");
            io.addRow("Map,HashMap,#,TreeMap,#,LinkedHashMap");
            LOGGER.debug(io.printRow());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            new Collections();
            new Sets();
            new Lists();
            new Maps();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
