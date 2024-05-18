/*package klase;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BP  {
    String filename = "C:\\Users\\valen\\OneDrive\\Documents\\NetBeansProjects\\Sustav_serijalizacija\\SVE\\Objavljena_natjecanja.txt";

    private ArrayList<Korisnik> korisnici;
    private ArrayList<Admin> admini;

    public ArrayList<Korisnik> getKorisnici() {
        return korisnici;
    }

    public BP() {
        korisnici = new ArrayList<>();

        korisnici.add(new Korisnik("a", "1"));

        this.admini = new ArrayList<>();

        admini.add(new Admin("b", "1"));
    }

    public void prijavaKorisnik() {
        Scanner scanner = new Scanner(System.in);

            System.out.print("Unesite korisnicko ime: ");
            String korisnickoIme = scanner.nextLine();

            System.out.print("Unesite lozinku: ");
            String lozinka = scanner.nextLine();

            boolean prijavaUspjesna = false;
            for (Korisnik korisnik : korisnici) {
                if (korisnik.getKorisnickoIme().equals(korisnickoIme) && korisnik.getlozinka().equals(lozinka)) {
                    prijavaUspjesna = true;
                    break;
                }
            }

            if (prijavaUspjesna) {
                System.out.println("Prijavljeni ste kao " + korisnickoIme + "!");
                Izbornik izbornik = new Izbornik();
                izbornik.pokreniIzbornik();
            } else {
                System.out.println("Pogresno korisnicko ime ili lozinka.");
                prijavaKorisnik(); // Ponovno tražimo unos korisničkih podataka
            }
    }

    public void prijavaAdminObjava() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite ime admina: ");
        String ImeAdmina = scanner.nextLine();

        System.out.print("Unesite lozinku admina: ");
        String LozinkaAdmina = scanner.nextLine();

        boolean prijavaUspjesna = false;
        for (Admin admin : admini) {
            if (admin.getImeAdmina().equals(ImeAdmina) && admin.lozinkaAdmina.equals(LozinkaAdmina)) {
                System.out.println("Uspjesno ste prijavljeni kao " + ImeAdmina + "!");
                objaviNatjecanjeAdmin();
                break;
            } else {
                System.out.println("Pogresno ime ili lozinka administratora.");
                prijavaAdminObjava();
            }
        }
    }

    public void prijavaAdminBrisanje() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite ime admina: ");
        String ImeAdmina = scanner.nextLine();

        System.out.print("Unesite lozinku admina: ");
        String LozinkaAdmina = scanner.nextLine();

        boolean prijavaUspjesna = false;
        for (Admin admin : admini) {
            if (admin.getImeAdmina().equals(ImeAdmina) && admin.lozinkaAdmina.equals(LozinkaAdmina)) {
                System.out.println("Uspjesno ste prijavljeni kao " + ImeAdmina + "!");
                izbrisiNatjecanjeAdmin();
                break;
            } else {
                System.out.println("Pogresno ime ili lozinka administratora.");
                prijavaAdminBrisanje();
            }
        }
    }
    
    public void objaviNatjecanjeAdmin() {
        //Natjecanje.Serijalizacija(Natjecanje.listaNatjecanja);
    }

    public void izbrisiNatjecanjeAdmin() {
        Natjecanje.obrisiNatjecanje();
    }

}*/
