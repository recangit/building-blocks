package se.recan.strings;

import java.text.MessageFormat;
import org.apache.log4j.Logger;
import se.recan.utils.IOutil;

public class SubStringing {

    private static final Logger LOGGER = Logger.getLogger("Logger");

    private static final int LENGTH = 42;

    SubStringing() {
        LOGGER.debug(IOutil.info(this));
        
        substringMellanOrd1();
        substringMellanOrd2();
        
        String s = upperCase("meningar skall börja med stor bokstav.");
        LOGGER.debug(s);
        
        splitString();
        
        messageFormat();
    }

    private void substringMellanOrd1() {
        String[] txt = {"Arbetsförmedlingen i Falun erbjuder gratis buss till European Job Day vid Af i Örebro den 21 september - kontakta Arbetsförmedlingen för mer information och bokning av plats.",
            "Våra grannar rekryterar till sommaren! Våra Eures-rådgivare och kontaktperson hjälper dig att hitta rätt på sommarjobben i Norge och på Åland. De visar även vad du behöver veta innan du börjar jobba utomlands. Öppet hus, ingen föranmälan. Aktiviteten pågår ett par timmar, kom när det passar dig.",
            "Din ansökan är ditt vikigaste redskap för att söka jobb. Hur skriver man ett personligt brev? Vad är ett CV? Vad innehåller en meritförteckning? Vi informerar och svarar på dina frågor kring ansökningshandlingar. Syftet med aktiviteten är att med tips, inspiration och idéer öka dina chanser att komma till anställningsintervju. Begränsat antal platser. Kontakta nedanstående personer för anmälan. Aktiviteten pågår mellan kl 13:00-15:00.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut sagittis orci ut mi pharetra eleifend. Ut gravida arcu eget tellus eleifend eu adipiscing lacus iaculis. Aliquam",
            "Varje tisdag kl 13:00-15:00 finns personal från kommunens Arbetsmarknadsenhet i Direktservice för att berätta om projekt Lyftet, svara på frågor, ge tips om praktikplatser mm."};

        for (String s : txt) {
            s = s.trim();
            if (s.length() > LENGTH) {
                String tmp = s.substring(LENGTH);
                int delimeter = tmp.indexOf(" ");
                if (delimeter != -1) {
                    LOGGER.debug(s.substring(0, LENGTH + delimeter) + "...");
                }
            }
        }
    }

    // En substring med fast värde kan ge oanade resultat.
    // Ex: Den Nepalesiska soldaten bär stolt sin kukri runt midjan.
    // Det blir med en slarvig substring: Den Nepalesiska soldaten bär stolt sin kuk...
    private void substringMellanOrd2() {
        String txt = "Den Nepalesiska soldaten bär stolt sin kukri runt midjan.";
        
        txt = txt.trim();
        
        if (txt.length() > LENGTH) {
            String tmp = txt.substring(LENGTH);
            int x = tmp.indexOf(" ");
            txt = txt.substring(0, LENGTH + x) + "...";

            LOGGER.debug(txt);
        }
    }

    /**
     * Make the first letter in a word uppercase.
     *
     * @param String, ex gorilla
     * @return String Gorilla
     */
    private String upperCase(String arg) {
        return arg.substring(0, 1).toUpperCase() + arg.substring(1, arg.length());
    }
    
    // When split is done with a dot as delimeter, the dot must have two backslashes.
    private void splitString() {
        String[] split = "se.af.ext.selenium.ledigajobb.PlatsBanken".split("\\.");
        LOGGER.debug(split.length);
    }
    
    private void messageFormat() {
        String first = "My name is {0}, Im a {1}!";
        String message = MessageFormat.format(first, "Anders", "Bastard");

        LOGGER.debug(message);
    }
}
