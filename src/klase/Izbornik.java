/*package klase;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Izbornik implements java.io.Serializable {
    String filename = "C:\\Users\\valen\\OneDrive\\Documents\\NetBeansProjects\\Sustav_serijalizacija\\SVE\\Objavljena_natjecanja.txt";
    Scanner unos = new Scanner(System.in);

    void pregledNatjecanja() {

        System.out.println("\n\n************ PREGLED NATJECANJA ***********");

        //Natjecanje.ispisiNatjecanja();
        Natjecanje.DeserijalizacijaNatjecanja();
    }

    void sudjelovanaNatjecanja() {
        Korisnik.ispisiPrijavljenaNatjecanja();
    }

    void ispitNatjecanja() {
        System.out.println("\n********* RJESAVANJE ISPITA NATJECANJA ********");
        Natjecanje.rjesavanjeNatjecanja();
    }

    void prethodnaNatjecanja() {
        System.out.println("\n********* TVOJA PRETHODNA NATJECANJA ********");
        Korisnik.ispisiPrethodnaNatjecanja();
    }

    void rezultati() {
        System.out.println("\n*************** REZULTATI *****************");
        Rezultat.ispisiRezultate();
    }

    void objaviNatjecanje() {
        BP bp = new BP();
        bp.prijavaAdminObjava();
    }

    void odjava() {
        System.out.println("Odjava...");
        BP bp = new BP();
        bp.prijavaKorisnik();
    }

    void pokreniIzbornik() {
        int izbor;
        do {
            System.out.println("\n");
            System.out.println("*******************IZBORNIK ******************");
            System.out.println("| (1) Pregled  natjecanja                     |");
            System.out.println("| (2) Pregled  natjecanja u kojima sudjelujete|");
            System.out.println("| (3) Rjesavanje ispita natjecanja            |");
            System.out.println("| (4) Tvoja prethodna natjecanja              |");
            System.out.println("| (5) Rezultati                               |");
            System.out.println("| (6) Objavi natjecanje                       |");
            System.out.println("| (7) Odjava                                  |");
            System.out.println("**********************************************");
            System.out.print("Odaberi opciju (1-7): ");

            izbor = unos.nextInt();
            unos.nextLine();

            switch (izbor) {
                case 1:
                    pregledNatjecanja();
                    break;
                case 2:
                    sudjelovanaNatjecanja();
                    break;
                case 3:
                    ispitNatjecanja();
                    break;
                case 4:
                    prethodnaNatjecanja();
                    break;
                case 5:
                    rezultati();
                    break;
                case 6:
                    objaviNatjecanje();
                    break;
                case 7:
                    odjava();
                    System.out.println("Izlaz iz izbornika. Doviđenja!");
                    break;
                default:
                    System.out.println("Pogrešan unos. Pokušajte ponovno.");
            }
        } while (izbor != 0 && izbor != 7);
    }
}*/
