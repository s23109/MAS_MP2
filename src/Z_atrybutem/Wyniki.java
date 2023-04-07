package Z_atrybutem;

import java.time.LocalDate;


public class Wyniki {

    public Osoba osoba;
    public Kurs kurs;

    public String ocena;
    public LocalDate data_wystawienia;

    public Wyniki(Osoba osoba, Kurs kurs, String ocena, LocalDate data_wystawienia) {
        this.osoba = osoba;
        this.kurs = kurs;
        this.ocena = ocena;
        this.data_wystawienia = data_wystawienia;
    }

    @Override
    public String toString() {
        return "Wyniki{" +
                "ocena='" + ocena + '\'' +
                ", data_wystawienia=" + data_wystawienia +
                '}';
    }
}
