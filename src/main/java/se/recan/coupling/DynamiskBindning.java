package se.recan.coupling;

import java.util.ListIterator;
import java.util.ArrayList;
import java.util.HashMap;
import se.recan.utils.IOutil;

/**
 * Created: 2012-04-10 Last Modified: 2012-04-10
 *
 * @author Anders Recksén (anders[at]recksen[dot]se)
 */
public class DynamiskBindning {

    private static ArrayList<People> list;

    private static void printList(String arg) {
        try {
            boolean found = false;

            for (ListIterator i = list.listIterator(); i.hasNext();) {
                People p = (People) i.next();
                if (arg.equals("all")) {
                    p.print();
                    found = true;
                } else if (p.getCat().equals(arg)) {
                    p.print();
                    found = true;
                } else if (p.getFirst().equals(arg)) {
                    p.print();
                    found = true;
                } else if (p.getLast().equals(arg)) {
                    p.print();
                    found = true;
                }
            }
            if (found == false) {
                HashMap<String, String> map = new HashMap<String, String>();
                for (ListIterator i = list.listIterator(); i.hasNext();) {
                    People p = (People) i.next();
                    map.put(p.getCat(), p.getCat());
                }
                IOutil.print("\nInga poster passade in på sökningen\nSökning kan ske på förnamn, efternamn eller tillgängliga kategorier:\n" + map.keySet() + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        IOutil.info("DynamiskBindning");

        list = new ArrayList<People>();
        list.add(new Family("Familj", "Kajsa", "Recksén", "040413", "6584151"));
        list.add(new Family("Familj", "Sofia", "Recksén", "730401", "6584151"));
        list.add(new Friends("Kompisar", "Janne", "Skansén", "157119", "157119", "0708-157119"));
        list.add(new Work("Work", "Niklas", "Fondberg", "i3micro", "50638851", "0708-472025", "www.i3micro.com"));
        list.add(new Family("Familj", "Anders", "Recksén", "621002", "6584151"));
        list.add(new Work("Work", "Curt", "Lundberg", "Cul media", "227023", "0708-840940", ""));
        list.add(new Friends("Kompisar", "Mikela", "Jonasson", "337223", "", "0704-912223"));
        list.add(new Family("Familj", "Mårten", "Recksén", "660820", "7782669"));

        if (args.length > 0) {
            printList(args[0]);
        } else {
            printList("all");
        }

        System.exit(0);
    }
}
