package Z_atrybutem;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Kurs {
    String nazwa;
    BigDecimal cena ;

    public List<Kurs> extent = new ArrayList<>();
    public List<Wyniki> wynikiOsob = new ArrayList<>();

    private void addExtent(Kurs d) {
        extent.add(d);
    }

    private void removeExtent(Kurs d){
        extent.remove(d);
    }

    public void showExtent(){
        for (Kurs d: extent) {
            System.out.println(d);
        }
    }

    public Kurs(String nazwa, BigDecimal cena) {
        this.nazwa = nazwa;
        this.cena = cena;
        addExtent(this);
    }

    public void showOsoby (){
        System.out.println("KURS:");
        System.out.println(this);
        for (Wyniki w :wynikiOsob) {
            System.out.println(w.osoba);
            System.out.println(w);
        }
    }

    public void addOsoba(String ocena, LocalDate data_wystawienia, Osoba osoba){
        Wyniki wyniki = new Wyniki(osoba,this,ocena,data_wystawienia);
        this.wynikiOsob.add(wyniki);
        osoba.wynikiKursów.add(wyniki);
    }
    @Override
    public String toString() {
        return "Kurs{" +
                "nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                '}';
    }
}
