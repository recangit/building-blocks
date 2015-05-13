package se.recan.override;

class Anders extends Paterfamilias {

    public Anders() { System.out.println("Anders"); }
    
    private final String firstName = "Anders";

    protected String getLastName() { return super.getLastName(); }

    protected String getFirstName() { return firstName; }
    
    public String toString() { return getFirstName() + " " + getLastName(); }
}