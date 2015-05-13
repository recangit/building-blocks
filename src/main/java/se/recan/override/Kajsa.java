package se.recan.override;

class Kajsa extends Anders {

    public Kajsa() { System.out.println("Kajsa"); }
    
    private final String firstName = "Kajsa";

    protected String getLastName() { return super.getLastName(); }

    // Denna metod har i Paterfamilias paketåtkomst, i Anders protected, slutligen
    // här public. Det går inte att vända på detta.
    public String getFirstName() { return firstName; }
    
    public String toString() { return getFirstName() + " " + getLastName() + " " + Anders.DESCRIPTION; }
}