package se.recan.enums;

/**
 * 2015-mar-17
 * @author Anders Recksén (recan, Prolore)
 */
public class TestData {

    private final String civilstand;
    private final String name;

    public TestData(String civilstand, String name) {
        this.civilstand = civilstand;
        this.name = name;
    }

    public String getCivilstand() {
        return civilstand;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return name + ", " + civilstand;
    }
}
