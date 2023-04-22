import java.util.ArrayList;
import java.util.List;

abstract class Maszyna {
    protected enum Silnik {
        PAROWY, BENZYNOWY, OLEJOWY
    }
    protected String silnikToString() {
        if (rodzajSilnika == Silnik.PAROWY) {
            return "parowy";
        } else if(rodzajSilnika == Silnik.OLEJOWY) {
            return "olejowy";
        } else if(rodzajSilnika == Silnik.BENZYNOWY) {
            return "benzynowy";
        } else if(rodzajSilnika == null) {
            return null;
        }
        else {
            return "nieprawidlowy typ silnika!";
        }
    }
    protected String marka;
    protected String nazwa;
    protected String pojemnoscSilnika;

    protected Silnik rodzajSilnika;
    public Maszyna(String marka, String nazwa, String pojemnoscSilnika, 
Silnik silnik) {
        this.marka = marka;
        this.nazwa = nazwa;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.rodzajSilnika = silnik;
    }

    public Maszyna() {}

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setPojemnoscSilnika(String pojemnoscSilnika) {
        this.pojemnoscSilnika = pojemnoscSilnika;
    }

    public void setRodzajSilnika(Silnik rodzajSilnika) {
        this.rodzajSilnika = rodzajSilnika;
    }
    abstract void wyswietl();
}

class Lokomotywa extends Maszyna {
    private final int iloscWagonow;
    private final int iloscKominow;

    public Lokomotywa(String marka, String nazwa, String pojemnoscSilnika, 
Silnik silnik,
                      int wagony, int iloscKominow) {
        super(marka, nazwa, pojemnoscSilnika, silnik);
        this.iloscWagonow = wagony;
        this.iloscKominow = iloscKominow;
    }
    void wyswietl() {
        System.out.println("marka: " + marka);
        System.out.println("nazwa: " + nazwa);
        System.out.println("pojemnosc silnika: " + pojemnoscSilnika);
        System.out.println("rodzaj silnika: " + silnikToString());
        System.out.println("ilosc wagonow: " + iloscWagonow);
        System.out.println("ilosc kominow: " + iloscKominow);
    }
}

class Kosiarka extends Maszyna {
    private boolean czyMelekser;
    private boolean czyNaped;
    private int liczbaOstrzy;

    public Kosiarka(String marka, String nazwa, String pojemnoscSilnika, 
Silnik silnik,
                    boolean czyMelekser, boolean czyNaped, int 
liczbaOstrzy) {
        super(marka, nazwa, pojemnoscSilnika, silnik);
        this.czyMelekser = czyMelekser;
        this.czyNaped = czyNaped;
        this.liczbaOstrzy = liczbaOstrzy;
    }
    public void setCzyMelekser(boolean czyMelekser) {
        this.czyMelekser = czyMelekser;
    }
    public void setCzyNaped(boolean czyNaped) {
        this.czyNaped = czyNaped;
    }
    public void setLiczbaOstrzy(int liczbaOstrzy) {
        this.liczbaOstrzy = liczbaOstrzy;
    }
    void wyswietl() {
        System.out.println("marka: " + marka);
        System.out.println("nazwa: " + nazwa);
        System.out.println("pojemnosc silnika: " + pojemnoscSilnika);
        System.out.println("rodzaj silnika: " + silnikToString());
        System.out.println("czy melekser: " + czyMelekser);
        System.out.println("czy napęd: " + czyNaped);
        System.out.println("liczba ostrzy: " + liczbaOstrzy);
    }
}

class Pojazd extends Maszyna {
    protected double moc;
    protected double momentObrotowy;
    protected int nrPojazdu;
    protected static int maxLiczbaPojazdow = 0;

    public Pojazd(String marka, String nazwa, String pojemnoscSilnika, 
Silnik silnik, double moc,
                  double momentObrotowy) {
        super(marka, nazwa, pojemnoscSilnika, silnik);
        this.moc = moc;
        this.momentObrotowy = momentObrotowy;
        this.nrPojazdu = maxLiczbaPojazdow++;
    }

    public Pojazd() {}

    public void setMoc(double moc) {
        this.moc = moc;
    }

    public void setMomentObrotowy(double momentObrotowy) {
        this.momentObrotowy = momentObrotowy;
    }

    private void setNrPojazdu(int nrPojazdu) {
        this.nrPojazdu = nrPojazdu;
    }

    public static void setMaxLiczbaPojazdow(int maxLiczbaPojazdow) {
        Pojazd.maxLiczbaPojazdow = maxLiczbaPojazdow;
    }

    void wyswietl() {
        System.out.println("marka: " + marka);
        System.out.println("nazwa: " + nazwa);
        System.out.println("pojemnosc silnika: " + pojemnoscSilnika);
        System.out.println("rodzaj silnika: " + silnikToString());
        System.out.println("moc: " + moc);
        System.out.println("moment obrotowy: " + momentObrotowy);
    }
}

class Samochod extends Pojazd {
    protected enum Segment {
        A, B, C
    }
    protected String segmentToString() {
        if(segment == Segment.A) {
            return "A";
        } else if (segment == Segment.B) {
            return "B";
        }
        else if (segment == Segment.C) {
            return "C";
        } else if(segment == null) {
            return null;
        }
        else {
            return "nieprawidlowy typ segmentu!";
        }
    }
    protected Segment segment;
    protected int vin;

    public Samochod(String marka, String nazwa, String pojemnoscSilnika, 
Silnik silnik, double moc,
                    double momentObrotowy, Segment segment, int vin) {
        super(marka, nazwa, pojemnoscSilnika, silnik, moc, 
momentObrotowy);
        this.segment = segment;
        this.vin = vin;
    }
    void wyswietl() {
        System.out.println("marka: " + marka);
        System.out.println("nazwa: " + nazwa);
        System.out.println("pojemnosc silnika: " + pojemnoscSilnika);
        System.out.println("rodzaj silnika: " + silnikToString());
        System.out.println("moc: " + moc);
        System.out.println("moment obrotowy: " + momentObrotowy);
        System.out.println("segment: " + segmentToString());
        System.out.println("vin: " + vin);
    }
}

class Jednoslad extends Pojazd {
    protected enum Typ {
        MotocyklSportowy, Rower, Hulajnoga
    }
    protected Typ typ;
    protected String typToString() {
        if(typ == Typ.MotocyklSportowy) {
            return "Motocykl sportowy";
        } else if (typ == Typ.Rower) {
            return "Rower";
        }
        else if (typ == Typ.Hulajnoga) {
            return "Hulajnoga";
        } else if (typ == null) {
            return null;
        }
        else {
            return "nieprawidlowy typ jednośladu!";
        }
    }

    public Jednoslad(String marka, String nazwa, String pojemnoscSilnika, 
Silnik silnik, double moc,
                     double momentObrotowy, Typ typ) {
        super(marka, nazwa, pojemnoscSilnika, silnik, moc, 
momentObrotowy);
        this.typ = typ;
    }

    public Jednoslad() {}

    public void setTyp(Typ typ) {
        this.typ = typ;
    }

    void wyswietl() {
        if(marka != null)
            System.out.println("marka: " + marka);
        if(nazwa != null)
            System.out.println("nazwa: " + nazwa);
        if(pojemnoscSilnika != null)
            System.out.println("pojemnosc silnika: " + pojemnoscSilnika);
        if(silnikToString() != null)
            System.out.println("rodzaj silnika: " + silnikToString());
        if(moc != 0)
            System.out.println("moc: " + moc);
        if(momentObrotowy != 0)
            System.out.println("moment obrotowy: " + momentObrotowy);
        if(typToString() != null)
            System.out.println("segment: " + typToString());
    }
}

class ParkMaszynowy {
    public List<Maszyna> maszyny;

    public ParkMaszynowy() {
        maszyny = new ArrayList<>();
        Lokomotywa adulina = new Lokomotywa("pondolino", "adulina", 
"1000",
                Maszyna.Silnik.PAROWY, 7, 7);
        maszyny.add(adulina);

        Kosiarka adeksiara = new Kosiarka("kosiarex", "adeksiara", "50",
                Maszyna.Silnik.BENZYNOWY, true, true, 2);
        maszyny.add(adeksiara);

        Pojazd mocnyPojazd = new Pojazd("Mocnex", "adumoc", "5000",
                Maszyna.Silnik.BENZYNOWY, 486.0, 750);
        maszyny.add(mocnyPojazd);

        Samochod superSamochod = new Samochod("BMW", "Seria3", "2000",
                Maszyna.Silnik.BENZYNOWY, 256.0, 700, Samochod.Segment.C, 
123456789);
        maszyny.add(superSamochod);

        Jednoslad motocykl = new Jednoslad("Honda", "Bruum", "150",
                Maszyna.Silnik.BENZYNOWY, 130, 500, 
Jednoslad.Typ.MotocyklSportowy);
        maszyny.add(motocykl);

        Jednoslad rower = new Jednoslad();
        rower.setTyp(Jednoslad.Typ.Rower);
        rower.setMarka("Adurowers");
        maszyny.add(rower);
        for(Maszyna m : maszyny) {
            m.wyswietl();
            System.out.println("- - - - -");
        }

        adeksiara.setLiczbaOstrzy(1);
        adeksiara.setCzyMelekser(false);
        adeksiara.setCzyNaped(false);
        adeksiara.wyswietl();
    }
}

public class Main {
    public static void main(String[] args) {
        ParkMaszynowy parkMaszynowy = new ParkMaszynowy();
    }
}
