package se.recan.coupling;

import se.recan.utils.IOutil;

public class Friends extends People {

    private final String telHome;
    private final String telWork;
    private final String telCell;

    public Friends(String category, String first, String last, String telHome, String telWork, String telCell) {
        super(category, first, last);
        this.telHome = telHome;
        this.telWork = telWork;
        this.telCell = telCell;
    }

    @Override
    public void print() throws Exception {
        super.print();
        IOutil.print("Hemnr:\t" + telHome + "\nJobbnr:\t" + telWork + "\nCellnr:\t" + telCell + "\n");
    }
}
