/*package klase;

import static klase.Natjecanje.listaNatjecanja;
import java.util.ArrayList;
import java.util.Scanner;

public class Korisnik {

    private String ime;
    private String prezime;
    static String korisnickoIme;
    String lozinka;
    private static ArrayList<String> prijavljenaNatjecanja;
    public static int osvojeniBodovi = 0;

    //KONSTRUKTOR
    public Korisnik(String korisnickoIme, String lozinka) {
        this.ime = ime;
        this.prezime = prezime;
        this.korisnickoIme = korisnickoIme;
        this.lozinka = lozinka;
        this.prijavljenaNatjecanja = new ArrayList<>();
        this.osvojeniBodovi = osvojeniBodovi;
    }

    //SETERI
    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    public void setbrojBodova(int brojBodova) {
        this.osvojeniBodovi = osvojeniBodovi;
    }

    //GETERI
    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public String getlozinka() {
        return lozinka;
    }

    public ArrayList<String> getPrijavljenaNatjecanja() {
        return prijavljenaNatjecanja;
    }

    public int getosvojeniBodovi() {
        return osvojeniBodovi;
    }

    //FUNKCIJE
    public static void pridruziNatjecanje(String natjecanje) {
        prijavljenaNatjecanja.add(natjecanje);
    }

    public static void ispisiPrijavljenaNatjecanja() {
        int rednibroj = 1;
        if (!prijavljenaNatjecanja.isEmpty()) {
            for (String natjecanje : prijavljenaNatjecanja) {
                System.out.println("(" + rednibroj + ")" + natjecanje);
            }
        } else {
            System.out.println("Niste prijavljeni ni u jedno natjecanje!");
        }

    }

    public static void provjeraPrijavljenihNatjecanja() {
        Scanner scanner = new Scanner(System.in);
        if (prijavljenaNatjecanja.isEmpty()) {
            System.out.println("Korisnik nije prijavljen ni na jedno natjecanje!");
            return;
        } else {     
            System.out.println("\nPrijavljena natjecanja korisnika " + korisnickoIme + ":");
            Korisnik.ispisiPrijavljenaNatjecanja();
            System.out.print("Odaberi redni broj natjecanja za rjesavanje: ");
            int odabir = scanner.nextInt();

            if (odabir >= 1 && odabir <= listaNatjecanja.size()) {
                Natjecanje odabranoNatjecanje = listaNatjecanja.get(odabir - 1);

                odabranoNatjecanje.unesiOdgovore();
            } else {
                System.out.println("Neispravan odabir natjecanja.");
            }
        }
    }

    public static void ispisiPrethodnaNatjecanja() {
        if (!listaNatjecanja.isEmpty()) {
            for (String natjecanje : prijavljenaNatjecanja) {
                System.out.println("\nPrethodna natjecanja korisnika " + korisnickoIme + ":");
                System.out.println(natjecanje);
            }
        } else {
            System.out.println("Prethodno niste sudjelovali na ni jednom natjecanju!");
        }

    }

    public static void dodajbodove() {
        osvojeniBodovi++;
    }

    public static boolean jePrijavljenNaNatjecanje(String natjecanje) {
        return prijavljenaNatjecanja.contains(natjecanje);
    }

    public boolean provjeriLozinku(String unesenaLozinka) {
        return lozinka.equals(unesenaLozinka);
    }

}*/
