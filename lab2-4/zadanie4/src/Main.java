// Zaimplementuj klasę Clock. Klasa zawierać będzie pola: hours, minutes, seconds. Zmienna hours przyjmuje
// wartości z zakresu 0-23, minutes z zakresu 0-59, seconds 0-59. Dodaj trzy konstruktor: - domyślny -
// inicjalizuje godzinę 12:00:00; - konstruktor zawierający trzy parametry: hours, minutes, seconds,
// - konstruktor z jednym parametrem - czas w sekundach licząc od północy jest konwertowany do
// pól: hours, minutes, seconds. Dodaj metody: - getHours(), getMinutes(), getSeconds(),
// bez parametrów, które zwracają odpowiednie wartości; - setHours(), setMinutes(), setSeconds(),
// z jednym parametrem, który ustawia odpowiednie wartości; - tick(), bez parametrów, która inkrementuje
// wartość second o jeden. Przykład: wartość 00:00:01 zamieni się na 00:00:02; wartość 00:59:59 zmieni
// się na 01:00:00; - tickDown(), zmniejsza wartość sekund o jedno; analogiczna do tick(); - toString(),
// bez parametrów, zwraca reprezentację obiektu w postaci "[hh-mm-ss]", uzupełnioną o nieznaczące zera,
// na przykład: "[03:12:56]". Przetestuj zaimplementowany program.
// Wykonawca: Adrianna Potrykus

class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    public Clock(int hours, int minutes, int seconds) {
        if(hours < 0 || hours > 23) {
            System.out.println("Hours must be between 0 and 23!");
            return;
        }
        if(minutes < 0 || minutes > 59) {
            System.out.println("Minutes must be between 0 and 59!");
            return;
        }
        if(seconds < 0 || seconds > 59) {
            System.out.println("Seconds must be between 0 and 59!");
            return;
        }
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Clock(int secondsFromMidnight) {
        this.hours = secondsFromMidnight / 3600;
        this.minutes = secondsFromMidnight / 60;
        this.seconds = secondsFromMidnight % 3600;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if(hours < 0 || hours > 23) {
            System.out.println("Hours must be between 0 and 23!");
            return;
        }
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if(minutes < 0 || minutes > 59) {
            System.out.println("Minutes must be between 0 and 59!");
            return;
        }
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if(seconds < 0 || seconds > 59) {
            System.out.println("Seconds must be between 0 and 59!");
            return;
        }
        this.seconds = seconds;
    }

    public void tick() {
        seconds++;
        if(seconds > 59) {
            minutes++;
            seconds = 0;
        }
        if(minutes > 59) {
            hours++;
            minutes = 0;
        }
        if(hours > 23) {
            hours = 0;
        }
    }

    public void tickDown() {
        seconds--;
        if(seconds < 0) {
            minutes--;
            seconds = 59;
        }
        if(minutes < 0) {
            hours--;
            minutes = 59;
        }
        if(hours < 0) {
            hours = 23;
        }
    }

    public String toString() {
        String hoursZeros = "";
        String minutesZeros = "";
        String secondsZeros = "";
        if(hours < 10)
            hoursZeros = "0";
        if(minutes < 10)
            minutesZeros = "0";
        if(seconds < 10)
            secondsZeros = "0";
        return "[" + hoursZeros + hours + "-" + minutesZeros + minutes + "-" + secondsZeros + seconds + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Clock1: ");
        Clock clock1 = new Clock(23, 59, 59);
        System.out.println(clock1);
        clock1.tick();
        System.out.println(clock1);
        clock1.tick();
        System.out.println(clock1);
        clock1.tickDown();
        System.out.println(clock1);
        clock1.tickDown();
        System.out.println(clock1);

        System.out.println("Clock2: ");
        Clock clock2 = new Clock(12, 0, 59);
        System.out.println(clock2);
        clock2.tick();
        System.out.println(clock2);
    }
}