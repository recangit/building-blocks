package se.recan.coupling;

import se.recan.utils.IOutil;

public class Family extends People {

    private final String birth;
    private final String telHome;

    public Family(String category, String first, String last, String birth, String telHome) {
        super(category, first, last);
        this.birth = birth;
        this.telHome = telHome;
    }

    @Override
    public void print() throws Exception {
        super.print();
        IOutil.print("Född:\t" + birth + "\nHemnr:\t" + telHome + "\n");
    }
}
