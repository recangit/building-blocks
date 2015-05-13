package se.recan.strings;

import java.lang.StringBuffer;
import java.util.Formatter;
import java.util.ArrayList;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.apache.log4j.Logger;
import se.recan.utils.IOutil;

/**
 * Created: 2013-02-01 Last Modified: 2013-02-01
 *
 * @author Anders Recksén (anders[at]recksen[dot]se)
 */
public class ParseFormat {

    private static final Logger LOGGER = Logger.getLogger("Logger");
    private static final File DEBUG_FILE = new File("src/main/resources/debug.log");

    protected ParseFormat() {
        LOGGER.debug(IOutil.info(this));

        try {
            System.out.println(DEBUG_FILE.exists());
            String application = "";

            ArrayList<String> list = IOutil.readFile(DEBUG_FILE);
            boolean firstLine = true;
            for (String s : list) {
                StringBuffer buffer = new StringBuffer();

                if (firstLine) {
                    String[] split = s.split(":");
                    buffer.append("Miljö:");
                    buffer.append(split[0]);
                    buffer.append(" Browser:");
                    buffer.append(split[1]);
                    buffer.append(" Datum:");
                    buffer.append(dateToString(Long.parseLong(split[2]), "yyyy-MM-dd HH:m"));
                    IOutil.print(buffer.toString());
                    firstLine = false;
                    continue;
                }

                String[] split = s.split(" ");

                if (!application.isEmpty() && !application.equals(split[0]) && split[0].trim().startsWith("TFA")) {
                    System.out.println();
                }

                Formatter formatter = new Formatter(buffer);
                if (split.length > 2 && split[0].trim().startsWith("TFA")) {

                    StringBuffer note = new StringBuffer();
                    for (int i = 2; i < split.length; i++) {
                        note.append(split[i]);
                        note.append(" ");
                    }

                    formatter.format("%-27s %-17s %-10s", split[0], split[1], note.toString());
                    IOutil.print(buffer.toString());
                } else {
                    IOutil.print("\t" + s);
                }

                if (split[0].trim().startsWith("TFA")) {
                    application = split[0];
                }
            }

// 		    IOutil io = IOutil.getInstance(",", "");
//             io.newRow("App,Klass,Metod");
//             for(String s: list) {
//             	String[] split = s.split(" ");
// 				if(split.length > 2 && !split[0].trim().startsWith("@")) {
// 					StringBuffer buffer = new StringBuffer();
// 					buffer.append(split[0]);
// 					buffer.append(",");
// 					buffer.append(split[1]);
// 					buffer.append(",");
// 					buffer.append(split[2]);
// 			
// 					io.newRow(buffer.toString());
// 				}
// 			}
//             io.printRow();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

// 	private void print() {
// 		StringBuffer buffer = new StringBuffer();
// 		Formatter formatter = new Formatter(buffer);
// 	
// 		formatter.format("%9.9s %1.70s\n", "A", "B", "C", "D");
// 		System.out.println(buffer);
//     }
// 	
// 	private void print(String arg1, String arg2){
//         System.out.printf("%1$15s:  %2$3s%n", arg1, arg2);
//         System.out.printf("MARGIN %s = %s\n", arg1, arg2);
//     }
    public static String dateToString(long milliseconds, String pattern) {
        // Otherwise 0 will be formatted into givenpattern, like 01:00.
        if (milliseconds == 0) {
            return "";
        }

        SimpleDateFormat formatter = new SimpleDateFormat(pattern, new Locale("sv", "SE"));
        return formatter.format(milliseconds);
    }
}
