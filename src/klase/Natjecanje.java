//Problem je bil u write parametru u serijalizaciji 
package klase;

//import static klase.Korisnik.osvojeniBodovi;
import java.io.*;
import java.util.ArrayList;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import static klase.Korisnik.osvojeniBodovi;


public class Natjecanje implements java.io.Serializable {

    private static final long serialVersionUID = 6474931121217821703L;
    private static String nazivNatjecanja;
    private static ArrayList<String> listaPitanja;
    private static String[] točniOdgovori;
    public static ArrayList<Natjecanje> listaNatjecanja = new ArrayList<>();

    String filename = "C:\\Users\\vfuntak\\Documents\\NetBeansProjects\\Java_Aplikacija\\SVE\\Objavljena_natjecanja.txt";

    //KONSTRUKTOR
    public Natjecanje(String nazivNatjecanja, ArrayList<String> listaPitanja, String[] točniOdgovori) {
        this.nazivNatjecanja = nazivNatjecanja;
        this.listaPitanja = listaPitanja;
        this.točniOdgovori = točniOdgovori;
    }

    public Natjecanje(String nazivNatjecanja, ArrayList<String> listaPitanja, List<String> točniOdgovori) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //GETERI
    public String getNazivNatjecanja() {
        return nazivNatjecanja;
    }

    public ArrayList<String> getListaPitanja() {
        return listaPitanja;
    }

    public ArrayList<Natjecanje> getListaNatjecanja() {
        return listaNatjecanja;
    }

    public String[] getTočniOdgovori() {
        return točniOdgovori;
    }

    @Override
    public String toString() {
        return "Naziv natjecanja: " + this.nazivNatjecanja ;
    }

    //FUNKCIJE
    public static void unosNatjecanja(String NazivNatjecanja, ArrayList<String> listaPitanja, String[] točniOdgovori) {
        try {
            Natjecanje natjecanje = new Natjecanje(NazivNatjecanja, listaPitanja, točniOdgovori);
            listaNatjecanja.add(natjecanje);

        } catch (Exception ex) {
            System.out.println("Došlo je do greške pri unosu natjecanja.");
            System.out.println("Detaljan uzrok iznimke: " + ex.toString());
        }
    }

    public static void spremiPodatkeUDatoteku() {
        File myFile = new File("C:\\Users\\vfuntak\\Documents\\NetBeansProjects\\Java_Aplikacija\\SVE\\Objavljena_natjecanja.txt");
        try {
            
            FileOutputStream natjecanjeFile = new FileOutputStream(myFile, true);
            ObjectOutputStream out = new ObjectOutputStream(natjecanjeFile);
            
            Natjecanje natjecanje = new Natjecanje(nazivNatjecanja, listaPitanja, točniOdgovori);
            listaNatjecanja.add(natjecanje);

            out.writeObject(listaNatjecanja);
            
            out.writeObject("\nNaziv natjecanja: " + nazivNatjecanja);

            /*int redniBrojPitanja = 1;
            int redniBrojTocnogOdgovora = 1;

            for (String pitanje : listaPitanja) {
                objectOut.writeObject("" + redniBrojPitanja++ + "." + " Pitanje:" + pitanje);
            }
            for (String odgovor : točniOdgovori) {
                objectOut.writeObject("\nTocan odgovor na " + redniBrojTocnogOdgovora++ + "." + " pitanje:" + " " + odgovor);
            }*/

            out.writeObject("\n>\n");
            
            out.close();
            natjecanjeFile.close();
            System.out.println("Podaci su uspjesno spremljeni u datoteku.");
        } catch (IOException ex) {
            System.err.println("Doslo je do greske pri spremanju podataka u datoteku.");
        }
    }

    public static ArrayList<Natjecanje> prikaziNatjecanja() {
        ArrayList<Natjecanje> natjecanja = new ArrayList<>();
        String fileName = "C:\\Users\\vfuntak\\Documents\\NetBeansProjects\\Java_Aplikacija\\SVE\\Objavljena_natjecanja.txt";
        
        try {
            FileInputStream filein = new FileInputStream("C:\\Users\\vfuntak\\Documents\\NetBeansProjects\\Java_Aplikacija\\SVE\\Objavljena_natjecanja.txt");
            ObjectInputStream in = new ObjectInputStream(filein);
            natjecanja = (ArrayList<Natjecanje>) in.readObject();
            
            System.out.println("\nDeserijalizirani podaci:");
            for (Natjecanje natjecanje : natjecanja) {
                System.out.println(natjecanje.toString());
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("\nDatoteka nije pronadena: " + fileName);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return natjecanja;
    }

    /*public static List<Natjecanje> DeserijalizacijaNatjecanja() {
        String filename = "C:\\Users\\vfuntak\\Documents\\NetBeansProjects\\Aplikacija_sustav_natjecanja 12.5\\SVE\\Objavljena_natjecanja.txt";
        ArrayList<Natjecanje> listaNatjecanja = new ArrayList<>();
        try {
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fileIn);

            listaNatjecanja = (ArrayList<Natjecanje>) in.readObject();
            System.out.println("\nImena natjecanja:");
            for (Natjecanje natjecanje : listaNatjecanja) {
                System.out.println(natjecanje.toString());
            }

            in.close();
            fileIn.close();

            System.out.println("Deserijalizacija uspješno izvršena.");

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Natjecanje.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Natjecanje.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Natjecanje.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listaNatjecanja;
    }*/

 /*public static List<Natjecanje> Deserijalizacija(String filename) {
        List<Natjecanje> listaNatjecanja = null;
        try {
            FileInputStream filein = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(filein);

            listaNatjecanja = (List<Natjecanje>) in.readObject();

        } catch (FileNotFoundException ex) { 
            Logger.getLogger(Natjecanje.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Natjecanje.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Natjecanje.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaNatjecanja;
    }*/

 /*public static void unosInformacija() {
        System.out.println("\n************ OBJAVI NATJECANJE ************");

        Scanner unos = new Scanner(System.in);
        System.out.print("Unesite naziv natjecanja: \n");
        String nazivNatjecanja = unos.nextLine();

        System.out.print("Unesite broj pitanja: \n");
        int brojPitanja = unos.nextInt();
        unos.nextLine();

       ArrayList<String> listaPitanja = new ArrayList<>();
        String[] točniOdgovori = new String[brojPitanja];

        for (int i = 0; i < brojPitanja; i++) {
            System.out.print("Unesite " + (i + 1) + ". pitanje: \n");
            String pitanje = unos.nextLine();
            listaPitanja.add(pitanje);

            System.out.print("Unesite tocan odgovor za pitanje " + (i + 1) + ": \n");
            String točanOdgovor = unos.nextLine();
            točniOdgovori[i] = točanOdgovor;
        }

        // Dodavanje novog natjecanja u listu i upis u datoteku
        Natjecanje natjecanje = new Natjecanje(nazivNatjecanja, listaPitanja, točniOdgovori);
        listaNatjecanja.add(natjecanje);

        int redniBrojNatjecanja = 1;
        int redniBrojPitanja = 1;
        int redniBrojTocnogOdgovora = 1;
    }*/
 public static void ispisiNatjecanja() {
        int redniBroj = 1;
        Scanner scanner = new Scanner(System.in);
        if (!listaNatjecanja.isEmpty()) {
            for (Natjecanje natjecanje : listaNatjecanja) {
                System.out.println("Naziv " + redniBroj + ". natjecanja: " + natjecanje.getNazivNatjecanja());
                redniBroj++;
            }
            System.out.println("\n|(1) Pridruzi se natjecanju                 |");
            System.out.println("|(2) Obrisi natjecanje                      |");
            System.out.println("|(3) Povratak                               |");
            System.out.println("Odaberite opciju:                                ");

            int opcija = scanner.nextInt();
            scanner.nextLine();

            switch (opcija) {
                case 1:
                    //Pozvati funkciju iz kalse korisnik u kojoj je implementirana logika za pridruzivanje na natjecanje prema indexu natjecanja
                    System.out.print("Odaberite natjecanje (unosite redni broj): ");
                    int odabraniIndeks = scanner.nextInt();

                    if (odabraniIndeks > 0 && odabraniIndeks <= listaNatjecanja.size()) {
                        Natjecanje odabranoNatjecanje = listaNatjecanja.get(odabraniIndeks - 1);
                        Korisnik.pridruziNatjecanje(odabranoNatjecanje.getNazivNatjecanja());
                        System.out.println("Uspjesno ste se prijavili na natjecanje: " + odabranoNatjecanje.getNazivNatjecanja());
                    } else {
                        System.out.println("Neispravan unos indeksa natjecanja.");
                    }
                    break;
                case 2:
                    BP bp = new BP();
                    bp.prijavaAdminBrisanje();
                    obrisiNatjecanje();
                    break;
                case 3:
                    Izbornik izbornik = new Izbornik();
                    izbornik.pokreniIzbornik();
                    break;
                default:
                    System.out.println("Nepostojeća opcija, pokušajte ponovno.");
            }

        } else {
            System.out.println("Trenutno nema dostupnih natjecanja!");
        }
    }

    public static void obrisiNatjecanje() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Odaberite redni broj natjecanja za brisanje: ");
        if (!listaNatjecanja.isEmpty()) {
            int redniBroj = scanner.nextInt();
            scanner.nextLine();

            if (redniBroj > 0 && redniBroj <= listaNatjecanja.size()) {
                listaNatjecanja.remove(redniBroj - 1);
                System.out.println("Natjecanje uspjesno obrisano.");
            } else {
                System.out.println("Neispravan redni broj, pokušajte ponovno.");
            }
        }
    }

    public static void rjesavanjeNatjecanja() {
        Scanner scanner = new Scanner(System.in);

        Korisnik.provjeraPrijavljenihNatjecanja();
    }

    public void unesiOdgovore() {
        Scanner scanner = new Scanner(System.in);
        int ukupniBodovi = 0;
        int redniBroj = 1;

        System.out.println("\nRjesavanje natjecanja: " + getNazivNatjecanja());

        for (String pitanje : getListaPitanja()) {
            System.out.print("\n" + redniBroj + ". pitanje: " + pitanje + "\nOdgovor: ");
            String odgovor = scanner.nextLine();

            if (odgovor.equalsIgnoreCase(getTočniOdgovori()[redniBroj - 1])) {
                System.out.println("Tocno! Osvojili ste 1 bod");
                osvojeniBodovi++;
            } else {
                System.out.println("Netočno. Ispravan odgovor je: " + getTočniOdgovori()[redniBroj - 1]);
            }

            redniBroj++;
        }

        System.out.println("\nUkupan broj osvojenih bodova: " + osvojeniBodovi);
    }
}
