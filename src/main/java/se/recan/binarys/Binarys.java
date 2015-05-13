package se.recan.binarys;

import se.recan.utils.IOutil;

/**
 * Created: 2010-11-10 Last Modified: 2010-11-10
 *
 * @author Anders Recksén (anders[at]recksen[dot]se) Java hanterar som minst en
 * byte som består av 8 bitar. Det går alltså inte att hantera på bit-nivå.
 */
public class Binarys {

    private Binarys() {
        IOutil.info(this);

        // int c = 270; c >> 33 ? (En int är 32 bitar, alltså: 33%32 = 1)
    }

    private void shiftOperator() {
        // Exempel
        // Talet 7 beskrivs med en byte                 [0][0][0][0] [0][1][1][1]
        // Shiftar vi den 2 steg åt vänster får vi      [0][0][0][1] [1][1][0][0]
        // Motsvarande steg åt höger ger                [0][0][0][0] [0][0][0][1]

        int shift = 2;
        int a = 7;
        int b = a << shift;
        IOutil.print("Värdet " + a + " flyttas " + shift + " steg och blir då " + b);
        print(b);
    }

    private void bitWise() {
        // Bitwise complement operatorn (~) inverterar  [0][1][0][1] [0][1][0][1]
        // till                                         [1][0][1][0] [1][0][1][0]
        int a = 85;
        int b = ~a;

        // Bitwise AND operatorn (&) sätter ihop de bitar där de är satta på båda operanderna
        //                                              [0][1][0][1] [0][1][0][1]
        //                                              [0][1][1][1] [1][0][1][0]
        //                                              [0][1][0][1] [0][0][0][0]
        int c = 122;
        int d = a & c;

        // Bitwise OR operatorn (|) sätter ihop de bitar där de är satta i någon av operanderna
        //                                              [0][1][0][1] [0][1][0][1]
        //                                              [0][1][1][1] [1][0][1][0]
        //                                              [0][1][1][1] [1][1][1][1]
        int e = a | c;

        // Bitwise XOR operatorn (^) sätter en bit om operanderna skiljer sig åt, annars sätts 0
        //                                              [0][1][0][1] [0][1][0][1]
        //                                              [0][1][0][0] [0][0][1][1]
        //                                              [0][0][0][1] [0][1][1][0]
        int f = 67;
        int g = a ^ f;
        print(g);
    }

    private boolean hasFlag(int pos, int value) {
        return (value & pos) == pos;
    }

    private String asNumb(boolean flag) {
        return flag ? "[1]" : "[0]";
    }

    private void print(int numb) {
        System.out.println("Talet " + numb + " motsvarar biten:");
        System.out.print(asNumb(hasFlag(128, numb)));
        System.out.print(asNumb(hasFlag(64, numb)));
        System.out.print(asNumb(hasFlag(32, numb)));
        System.out.print(asNumb(hasFlag(16, numb)));
        System.out.print(" ");
        System.out.print(asNumb(hasFlag(8, numb)));
        System.out.print(asNumb(hasFlag(4, numb)));
        System.out.print(asNumb(hasFlag(2, numb)));
        System.out.print(asNumb(hasFlag(1, numb)));
        System.out.println("");
    }

    public static void main(String[] args) {
        try {
            Binarys bin = new Binarys();
            bin.shiftOperator();
            bin.bitWise();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
}
