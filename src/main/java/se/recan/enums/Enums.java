package se.recan.enums;

import java.util.List;
import java.util.ArrayList;
import se.recan.utils.IOutil;

public class Enums {

    private final List<MARGIN> margins = new ArrayList<MARGIN>();

// 	public enum Planet {
// 
//     MERCURY (3.303e+23, 2.4397e6),
//     VENUS   (4.869e+24, 6.0518e6),
//     EARTH   (5.976e+24, 6.37814e6),
//     MARS    (6.421e+23, 3.3972e6),
//     JUPITER (1.9e+27,   7.1492e7),
//     SATURN  (5.688e+26, 6.0268e7),
//     URANUS  (8.686e+25, 2.5559e7),
//     NEPTUNE (1.024e+26, 2.4746e7)
//     }
    public static enum MARGIN {

        TOP, RIGHT, BOTTOM, LEFT
    }

    public Enums() {
        IOutil.info(this);

        int count = 1;
        for (MARGIN m : MARGIN.values()) {
            System.out.printf("MARGIN %s = %s\n", count++, m);
            System.out.println(m.toString());
        }

        System.out.println(getMarginValue(MARGIN.TOP));

        MARGIN margin = MARGIN.BOTTOM;
        printMargin(margin);

        addMargin(MARGIN.LEFT);
        addMargin(MARGIN.RIGHT);
        ArrayList<MARGIN> mList = (ArrayList<MARGIN>) getMargins();
        for (MARGIN m : mList) {
            System.out.println(m.name());
        }
    }

    public static String getMarginValue(MARGIN margin) {
        switch (margin) {
            case TOP:
                return "1em";
            case RIGHT:
                return "12px";
            case BOTTOM:
                return "1.5em";
            case LEFT:
                return "6px";
            default:
                return null;
        }
    }

    public static void printMargin(MARGIN margin) {
        if (margin == MARGIN.BOTTOM) {
            System.out.println("Bottom");
        } else {
            System.out.println("Something else");
        }
    }

    private void addMargin(MARGIN m) {
        margins.add(m);
    }

    private List<MARGIN> getMargins() {
        return margins;
    }
    
    public enum ActivityType {
        SOKT_JOBB("soktTjanst"),
        LAMNAT_INTRASSEANMALAN("intresseanmalan"),
        INTERVJU("intervju"),
        REKRYTERINGSTRAFF("rekryteringstraff"),
        ANNAN("annanAktivitet");

        private String value;
        ActivityType(String value) {
            this.value = value;
        }
    }

    public static void main(String args[]) {
        new Enums();
        System.exit(0);
    }
}
