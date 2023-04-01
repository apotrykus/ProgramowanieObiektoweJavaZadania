// Zaimplementuj klasę MyDate, która przechowuje informację: month (typu int), day(typu int) i year (type int).
// Klasa powinna zawierać konstruktor, który inicjalizuje zmienne, sprawdzając poprawność zakresów
// (day 0-31, month 0-12, year 1990-2050). Zaimplementuj methody set i get dla wszystkich pól.
// Dodaj metodę displayDate, która wyświetli pola z uwzględnieniem zer nieznaczących oddzielone
// znakiem "/", np 21/03/2051. Przetestuj zaimplementowaną klasę.
// Wykonawca: Adrianna Potrykus

class MyDate {
    private int month;
    private int day;
    private int year;
    public MyDate(int month, int day, int year) {
        if(month < 1 || month > 12) {
            System.out.println("Month must be between 1 and 12!");
            return;
        }
        if(day < 1 || day > 31) {
            System.out.println("Day must be between 1 and 31!");
            return;
        }
        if(year < 1990 || year > 2050) {
            System.out.println("Year must be between 1990 and 2050!");
            return;
        }
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        if(month < 1 || month > 12) {
            System.out.println("Month must be between 1 and 12!");
            return;
        }
        this.month = month;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        if(day < 1 || day > 31) {
            System.out.println("Day must be between 1 and 31!");
            return;
        }
        this.day = day;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        if(year < 1990 || year > 2050) {
            System.out.println("Year must be between 1990 and 2050!");
            return;
        }
        this.year = year;
    }
    public void displayDate() {
        String zeroForDay = "";
        String zeroForMonth = "";
        if(this.day < 10)
            zeroForDay = "0";
        if(this.month < 10)
            zeroForMonth = "0";
        System.out.println(zeroForDay + this.day + "/" + zeroForMonth + this.month + "/" + this.year);
    }
}

public class Main {
    public static void main(String[] args) {
        MyDate data1 = new MyDate(1, 1, 1990);
        data1.displayDate();

        MyDate data2 = new MyDate(12, 31, 2050);
        data2.displayDate();

        MyDate data3 = new MyDate(10, 10, 2007);
        data3.displayDate();
    }
}