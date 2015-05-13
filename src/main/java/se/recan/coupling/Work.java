package se.recan.coupling;

import se.recan.utils.IOutil;

public class Work extends People {

    private final String work;
    private final String telWork;
    private final String telCell;
    private final String site;

    public Work(String category, String first, String last,
            String work, String telWork, String telCell, String site) {
        super(category, first, last);
        this.work = work;
        this.telWork = telWork;
        this.telCell = telCell;
        this.site = site;
    }

    @Override
    public void print() throws Exception {
        super.print();
        IOutil.print("Work:\t" + work + "\nJobbnr:\t" + telWork + "\nCellnr:\t" + telCell + "\nSite:\t" + site + "\n");
    }
}
