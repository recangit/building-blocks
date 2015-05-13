package se.recan.override;

public class Paterfamilias {

    public Paterfamilias() {
        System.out.println("Paterfamilias");
    }

    protected static final String DESCRIPTION = "Owner of the family estate";
    private static String lastName = "Recksén";
    private String firstName = "Leif";

    protected void setLastName(String lastName) {
        Paterfamilias.lastName = lastName;
    }

    protected String getLastName() {
        return lastName;
    }

    protected void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    String getFirstName() {
        return firstName;
    }

    public String toString() {
        return firstName + " " + lastName;
    }
}
