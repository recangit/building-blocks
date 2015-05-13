package se.recan.coupling;

import se.recan.utils.IOutil;

public class People {

    private final String category;
    private final String first;
    private final String last;

    public People(String category, String first, String last) {
        this.category = category;
        this.first = first;
        this.last = last;
    }

    public String getCat() {
        return category;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public void printCat() throws Exception {
        IOutil.print("\t" + category);
    }

    public void print() throws Exception {
        IOutil.print("\nNamn:\t" + first + " " + last);
    }
}
