package klase;

import static klase.Korisnik.korisnickoIme;
import static klase.Korisnik.osvojeniBodovi;
import static klase.Natjecanje.listaNatjecanja;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Rezultat {

    //FUNKCIJE
    public String GetKorisnickoIme() {
        return korisnickoIme;
    }

    public int GetOsvojeneBodove() {
        return osvojeniBodovi;
    }

    public static void ispisiRezultate() {

        System.out.println("Korisnik: " + korisnickoIme);
        System.out.println("Osvojeni bodovi: " + osvojeniBodovi);

         String filename = "C:\\Users\\valen\\OneDrive\\Documents\\NetBeansProjects\\Sustav_serijalizacija\\SVE\\Rezultati.txt";
        
        try {
            FileOutputStream rezultatiFile = new FileOutputStream(filename, true);
            ObjectOutputStream out = new ObjectOutputStream(rezultatiFile);

            out.writeObject("Korisnik: " + korisnickoIme);
            out.writeObject("Osvojeni bodovi: " + osvojeniBodovi);

            out.writeObject("\n_________________________\n");

            out.close();
            rezultatiFile.close();

            
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        }

    }
}

