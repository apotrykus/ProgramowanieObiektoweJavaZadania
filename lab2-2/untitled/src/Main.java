// Zaimplementuj klasę Student, do przechowywania imienia, nazwiska, numer indeksu i obecność
// (wyrażonej w procentach) oceny z POJ (typu int). Jeżeli podczas tworzenia obiektu nie
// zostało przekazane imię i nazwisko, pola powinny być ustawione wartością "Unknown".
// Dodaj odpowiednie metody set i get do wszystkich pól klasy. Jeżeli obecnocność jest mniejsza niż 50%,
// student powinien otrzymać ocenę 2. Przetestuj program, tworząc trzy różne obiekty klasy Student.
// Wykonawca: Adrianna Potrykus

class Student {
    private String imie;
    private String nazwisko;
    private int indeks;
    private int obecnosc;
    private int ocena;

    public Student(String imie, String nazwisko, int indeks, int obecnosc, int ocena) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
        this.obecnosc = obecnosc;
        this.ocena = ocena;
    }
    public Student(String imie, String nazwisko, int indeks, int obecnosc) {
        this(imie, nazwisko, indeks, obecnosc, 1);
        if(obecnosc < 50)
            this.ocena = 2;
    }
    public Student(int indeks, int obecnosc, int ocena) {
        this("Unknown", "Unknown", indeks, obecnosc, ocena);
    }
    public Student(int indeks, int obecnosc) {
        this("Unknown", "Unknown", indeks, obecnosc);
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getIndeks() {
        return indeks;
    }

    public void setIndeks(int indeks) {
        this.indeks = indeks;
    }

    public int getObecnosc() {
        return obecnosc;
    }

    public void setObecnosc(int obecnosc) {
        this.obecnosc = obecnosc;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }
}



public class Main {
    static void printStudent(Student s) {
        System.out.println(s.getImie() + " " + s.getNazwisko() + " " + s.getIndeks() + " " + s.getObecnosc() + " " + s.getOcena());
    }

    public static void main(String[] args) {
        Student apotrykus = new Student("Adrianna", "Potrykus", 26018, 75, 5);
        Student jkowalski = new Student("Jan", "Kowalski", 12345, 40);
        Student nieznajomwy = new Student(11223, 60);
        Student nieznajomy2 = new Student(22334, 90, 4);

        printStudent(apotrykus);
        printStudent(jkowalski);
        printStudent(nieznajomwy);
        printStudent(nieznajomy2);
    }
}