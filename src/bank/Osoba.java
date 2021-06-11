package bank;

public abstract class Osoba {
    protected String firstName;
    private String lastName;
    private String adress;
    private String pesel;

    public Osoba(String firstName, String lastName, String adress, String pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
        this.pesel = pesel;
    }

    public Osoba(){}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Osoba{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", adress='").append(adress).append('\'');
        sb.append(", pesel='").append(pesel).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
