package se.recan.arrayer;

import java.awt.Point;
import java.awt.Color;
import java.lang.NullPointerException;
import se.recan.utils.IOutil;

/**
 * Created: 2012-07-21 Last Modified: 2012-07-21
 *
 * @author Anders Recksén (anders[at]recksen[dot]se)
 */
/*
 public void nextBuffer() {
 if (1+bufferUpto == buffers.length) {
 int[][] newBuffers = new int[(int) (buffers.length*1.5)][];
 System.arraycopy(buffers, 0, newBuffers, 0, buffers.length);
 buffers = newBuffers;
 }
    
    
    
 private Object[][] data = {
 {"Mary", new Color(153, 0, 153),
 "Snowboarding", new Integer(5), new Boolean(false)},
 {"Alison", new Color(51, 51, 153),
 "Rowing", new Integer(3), new Boolean(true)},
 {"Kathy", new Color(51, 102, 51),
 "Knitting", new Integer(2), new Boolean(false)},
 {"Sharon", Color.red,
 "Speed reading", new Integer(20), new Boolean(true)},
 {"Philip", Color.pink,
 "Pool", new Integer(10), new Boolean(false)}
 };
 */
public class Arrayer {

    private static final short CAPACITY = 5;

    private Arrayer() {
        IOutil.info(this);

        // Declare an array and allocate memory for five ints.
        int[] a = new int[CAPACITY];
        print("Array a", a);

        // Declare and initialize.
        int[] b = {1, 2, 3, 4, 5};

        // Declare and allocate memory for only one of to arrays.
        int[][] c = new int[CAPACITY][];
	// This is not allowed
        // int[][] c = new int[][];
        // int[][] c = new int[][CAPACITY];
        // int[][] c = new int[CAPACITY]{1, 2, 3, 4, 5};

        try {
            print("Array c", c);
        } catch (NullPointerException e) {
            System.out.println("This will throw NullPointerException\n");
        }

        int[][] d = new int[CAPACITY][CAPACITY];
        print("Array d", d);

        int[][] e = {
            {1, 2, 3, 4, 5},
            {3, 2, 9},
            {0, 2, 4, 6, 8}
        };

        print("Array e", e);

        int[][] matris = {
            {3, 0, 0, 7, 0},
            {0, 0, 0, 3, 0},
            {1, 0, 0, 0, 2},
            {0, 0, 0, 0, 0},
            {8, 0, 0, 2, 5}
        };

        print("matris", matris);

        try {
            int[][][] multi = populateThird(matris);
            print("multi", multi);
        } catch (ArrayIndexOutOfBoundsException ee) {
            System.out.println(ee.toString());
        } catch (NullPointerException ee) {
            System.out.println(ee.toString());
        }
    }

    protected static int[][][] populateThird(int[][] matris) throws ArrayIndexOutOfBoundsException {
        int[][][] multi = new int[CAPACITY][CAPACITY][CAPACITY];

        for (int y = 0; y < CAPACITY; y++) {
            for (int x = 0; x < CAPACITY; x++) {
                for (int i = 3; i < CAPACITY; i++) {
                    multi[y][x][i] = i;
                }
            }
        }

        return multi;
    }

    protected static void print(final String message, final int[] array) throws NullPointerException {
        System.out.println(message);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (array.length == i + 1 ? "" : ", "));
        }
        System.out.println("\n");
    }

    protected static void print(final String message, final int[][] array) throws NullPointerException {
        System.out.println(message);

        for (int y = 0; y < array.length; y++) {

            for (int x = 0; x < array[y].length; x++) {
                System.out.print("[" + y + "][" + x + "]=" + array[y][x] + (array[y].length == x + 1 ? "" : ", "));
            }

            System.out.println();
        }

        System.out.println();
    }

    protected static void print(final String message, final int[][][] array) throws NullPointerException {
        System.out.println(message);

        for (int y = 0; y < array.length; y++) {

            for (int x = 0; x < array[y].length; x++) {

                for (int i = 0; i < array[y][x].length; i++) {
                    System.out.print("[" + y + "][" + x + "][" + i + "]=" + array[y][x][i] + (array[x].length == i + 1 ? "" : ", "));
                }

                System.out.println();
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Arrayer();
    }
}
