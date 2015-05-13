package se.recan.enums;

/**
 * 2015-mar-17
 * @author Anders Recksén (recan, Prolore)
 */
public class TestDataWrapper extends TestData {

    private enum CivilstandTyp {

        OGIFT, ANKA_ANKLING, SKILD, GIFT, REGISTRERAD_PARTNER, SKILD_PARTNER, EFTERLEVANDE_PARTNER, SAKNAS
    };
    
    public TestDataWrapper(String civilstand, String name) {
        super(civilstand, name);
    }

    @Override
    public String toString() {
        String civilstand = super.getCivilstand().toUpperCase();
        return super.getName() + ", " + CivilstandTyp.valueOf(civilstand);
    }
}
