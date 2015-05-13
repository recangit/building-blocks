package se.recan.override;

import se.recan.utils.IOutil;

/**
 * Överskugga, Override, Polymorfism, Dynamisk bindning. I detta fall finns en
 * gemensam superklass men det kan också vara ett interface.
 *
 * Subklassen ärver inte konstruktorn. Subklassens konstruktor anropar först
 * superklassens konstruktor. Created: 2012-04-11 Last Modified: 2012-04-11
 *
 * @author Anders Recksén (anders[at]recksen[dot]se)
 */
public class Override {

    public Override() {
        IOutil.info(this);

        Paterfamilias pater = new Paterfamilias();
        Paterfamilias anders = new Anders();
        Paterfamilias kajsa = new Kajsa();

        System.out.println("Override NO:1 " + pater);
        System.out.println("Override NO:2 " + anders);
        System.out.println("Override NO:3 " + kajsa);
    }

    public static void main(String args[]) {
        new Override();
        System.exit(0);
    }
}
