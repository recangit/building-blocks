package se.recan.synlighet;

import java.io.UnsupportedEncodingException;
import org.apache.log4j.Logger;
import se.recan.utils.IOutil;

    /**
     * Åtkomstmodifierare
     *
     * Created: 2010-11-10 Last Modified: 2010-11-10
     *
     * @author Anders Recksén (anders[at]recksen[dot]se)
     */
public class Synlighet {

    private static final Logger LOGGER = Logger.getLogger("Logger");

    public Synlighet() {
        
        
        LOGGER.debug(IOutil.info(this));

        try {
            IOutil io = IOutil.getInstance(",", "");
            io.addRow("Synlighet,private,package,protected,public");
            io.addRow("Klass i samma paket,Nej,Ja,Ja,Ja");
            io.addRow("Subklass i annat paket,Nej,Nej,Ja,Ja");
            io.addRow("Klass i annat paket,Nej,Nej,Nej,Ja");
            LOGGER.debug(io.printRow());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        new Synlighet();
        System.exit(0);
    }
}
