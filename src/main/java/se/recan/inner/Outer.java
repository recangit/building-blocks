package se.recan.inner;

public class Outer {

    private final int a = 7;

    class Inner {

        public void displayValue() {
            System.out.println("Value of a is " + a);
        }
    }
}
