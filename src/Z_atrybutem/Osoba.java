package Z_atrybutem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Osoba {
    String imie ;
    int semestr;
    public List<Osoba> extent = new ArrayList<>();
    public List<Wyniki> wynikiKursów = new ArrayList<>();

    private void addExtent(Osoba d) {
        extent.add(d);
    }

    private void removeExtent(Osoba d){
        extent.remove(d);
    }

    public void showExtent(){
        for (Osoba d: extent) {
            System.out.println(d);
        }
    }

    public Osoba(String imie, int semestr) {
        this.imie = imie;
        this.semestr = semestr;
        addExtent(this);
    }

    public void addKurs (String ocena, LocalDate data_wystawienia,Kurs kurs){
        Wyniki wyniki = new Wyniki(this,kurs,ocena,data_wystawienia);
        this.wynikiKursów.add(wyniki);
        kurs.wynikiOsob.add(wyniki);
    }

    public void showWyniki(){
        System.out.println("STUDENT:");
        System.out.println(this);
        for (Wyniki wyniki: wynikiKursów) {
            System.out.println(wyniki.kurs);
            System.out.println(wyniki);
        }
    }
    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", semestr=" + semestr +
                '}';
    }
}
