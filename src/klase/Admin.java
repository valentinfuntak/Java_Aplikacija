package klase;

public class Admin {

    private String imeAdmina;
    String lozinkaAdmina;

    //KONSTRUKTOR
    public Admin(String imeAdmina, String lozinkaAdmina) {
        this.imeAdmina = imeAdmina;
        this.lozinkaAdmina = lozinkaAdmina;
    }

    //GETERI
    public String getImeAdmina() {
        return imeAdmina;
    }

    public String getLozinkaAdmina() {
        return lozinkaAdmina;
    }

    //SETERI
    public void setIme(String ime) {
        this.imeAdmina = ime;
    }

    public void setLozinka(String lozinka) {
        this.lozinkaAdmina = lozinka;
    }

}
