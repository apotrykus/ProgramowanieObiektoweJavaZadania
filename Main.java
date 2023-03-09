import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        zadanie1();
    }
    public static void zadanie1() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Podaj bok a prostokąta: ");
        double bok_a = scanner.nextDouble();
        System.out.println("Podaj bok b prostokąta: ");
        double bok_b = scanner.nextDouble();
        System.out.println("Pole prostokąta wynosi: " + bok_a * bok_b);
    }
    public static void zadanie2() {
        NumberFormat formatter = new DecimalFormat("#0.00");
        System.out.println(formatter.format(Math.sqrt(Math.PI)));
    }
    public static void zadanie3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dwa słowa: ");
        String napis1 = scanner.next();
        String napis2 = scanner.next();
        System.out.println("%" + napis2 + " " + napis1 + "%");
    }
    public static void zadanie4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj trzy boki trójkąta, aby sprawdzić czy może on zostać utworzony: ");
        int bok_a = scanner.nextInt();
        int bok_b = scanner.nextInt();
        int bok_c = scanner.nextInt();
        if (bok_a <= 0 || bok_b <= 0 || bok_c<= 0) {
            System.out.println("BŁĄD");
            return;
        }
        if (bok_a + bok_b > bok_c && bok_a + bok_c > bok_b && bok_b + bok_c > bok_a)
            System.out.println("TAK");
        else
            System.out.println("NIE");
    }
    public static void zadanie5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj numer miesiąca, którego ilość dni chcesz sprawdzić: ");
        int opcja = scanner.nextInt();
        switch (opcja) {
            case 1:
                System.out.println("Styczeń: 31 dni.");
                break;
            case 2:
                System.out.println("Luty: 28 dni.");
                break;
            case 3:
                System.out.println("Marzec: 31 dni.");
                break;
            case 4:
                System.out.println("Kwiecień: 30 dni.");
                break;
            case 5:
                System.out.println("Maj: 31 dni.");
                break;
            case 6:
                System.out.println("Czerwiec: 30 dni.");
                break;
            case 7:
                System.out.println("Lipiec: 31 dni.");
                break;
            case 8:
                System.out.println("Sierpień: 31 dni.");
                break;
            case 9:
                System.out.println("Wrzesień: 30 dni.");
                break;
            case 10:
                System.out.println("Październik: 31 dni.");
                break;
            case 11:
                System.out.println("Listopad: 30 dni.");
                break;
            case 12:
                System.out.println("Grudzień: 31 dni.");
                break;
            default:
                System.out.println("BŁĄD");
                break;
        }
    }
    public static void zadanie6() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        double a = scanner.nextDouble();
        System.out.print("Podaj drugą liczbę: ");
        double b = scanner.nextDouble();
        System.out.print("Podaj trzecią liczbę: ");
        double c = scanner.nextDouble();
        double najmniejsza, srodkowa, najwieksza;
        if (a <= b && a <= c) {
            najmniejsza = a;
            if (b <= c) {
                srodkowa = b;
                najwieksza = c;
            } else {
                srodkowa = c;
                najwieksza = b;
            }
        } else if (b <= a && b <= c) {
            najmniejsza = b;
            if (a <= c) {
                srodkowa = a;
                najwieksza = c;
            } else {
                srodkowa = c;
                najwieksza = a;
            }
        } else {
            najmniejsza = c;
            if (a <= b) {
                srodkowa = a;
                najwieksza = b;
            } else {
                srodkowa = b;
                najwieksza = a;
            }
        }
        System.out.println(najmniejsza + ", " + srodkowa + ", " + najwieksza);
        System.out.println(najwieksza + ", " + srodkowa + ", " + najmniejsza);
        }
    public static void zadanie7() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj n i m: ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if (n <= 0 || m <= 0) {
            System.out.println("BŁĄD");
            return;
        }
        int[] A = new int[n];
        int[] B = new int[m];
        System.out.print("Podaj n liczb dla tablicy A: ");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.print("Podaj m liczb dla tablicy B: ");
        for (int i = 0; i < m; i++) {
            B[i] = scanner.nextInt();
        }
        if (n != m) {
            System.out.println("BŁĄD");
            return;
        }
        int iloczyn_skalarny = 0;
        for (int i = 0; i < n; i++) {
            iloczyn_skalarny += A[i] * B[i];
        }
        System.out.println("Iloczyn skalarny: " + iloczyn_skalarny);
    }
    public static void zadanie8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę naturalną: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static boolean czy_palindrom(String slowo) {
        char[] slowo_char = slowo.toCharArray();
        String slowo_odwrocone = slowo;
        char[] slowo_odwrocone_char = slowo_odwrocone.toCharArray();

        for(int i = 0, j = slowo_odwrocone_char.length - 1; i < slowo_char.length && j >= 0; i++, j--) {
            slowo_odwrocone_char[j] = slowo_char[i];
        }
        slowo_odwrocone = new String(slowo_odwrocone_char);
        return slowo_odwrocone.equals(slowo);
    }
    public static void zadanie9() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj słowo: ");
        String slowo = scanner.next();

        if(czy_palindrom(slowo))
            System.out.println("Tak");
        else
            System.out.println("Nie");
    }
    public static void zadanie10() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj dwie liczby, które będą oznaczały ilość wierszy i kolumn w tablicy: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a <= 0 || b <= 0) {
            System.out.println("BŁĄD");
            return;
        }
        int[][] AB = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                AB[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(AB[j][i] + " ");
            }
            System.out.println();
        }
    }
    public static void zadanie11() {
        char[] alfabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                          'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                          's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        boolean[] litera_uzyta = new boolean[alfabet.length];
        for(int i = 0; i < litera_uzyta.length; i++) {
            litera_uzyta[i] = false;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj zdanie, które przypuszczasz, że jest pangramem: ");
        String zdanie = scanner.nextLine();
        for(int i = 0; i < zdanie.length(); i++) {
            if(Character.isLetter(zdanie.charAt(i))) {
                for(int j = 0; j < alfabet.length; j++) {
                    if(zdanie.charAt(i) == alfabet[j]) {
                        litera_uzyta[j] = true;
                    }
                }
            }
        }
        for(int i = 0; i < litera_uzyta.length; i++) {
            if(litera_uzyta[i] == false) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
    public static void zadanie12() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilosc sekund zycia: ");
        double liczba_sekund_zycia = scanner.nextInt();
        System.out.println("Na jakiej planecie żyjesz?");
        String planeta = scanner.next();
        double liczba_lat_ziemskich = liczba_sekund_zycia/31557600;
        NumberFormat formatter = new DecimalFormat("#0.00");
        switch(planeta) {
            case "Ziemia":
                System.out.println(formatter.format(liczba_lat_ziemskich));
                break;
            case "Merkury":
                System.out.println(formatter.format(liczba_lat_ziemskich / 0.2408467));
                break;
            case "Wenus":
                System.out.println(formatter.format(liczba_lat_ziemskich / 0.61519726));
                break;
            case "Mars":
                System.out.println(formatter.format(liczba_lat_ziemskich / 1.8808158));
                break;
            case "Jowisz":
                System.out.println(formatter.format(liczba_lat_ziemskich / 11.862615));
                break;
            case "Saturn":
                System.out.println(formatter.format(liczba_lat_ziemskich / 29.447498));
                break;
            case "Uran":
                System.out.println(formatter.format(liczba_lat_ziemskich / 84.016846));
                break;
            case "Neptun":
                System.out.println(formatter.format(liczba_lat_ziemskich / 164.79132));
                break;
            case "Pluton":
                System.out.println("Pluton nie jest planetą! :)");
                break;
            default:
                System.out.println("Nieprawidlowa planeta!");
                break;
        }
    }
    public static int znajdz_max_element(int[] liczby, int rozmiar, int indeks, int max){
        if(rozmiar == 1)
            return liczby[0];
        if(rozmiar == 2) {
            if(liczby[0] > liczby[1])
                return liczby[0];
            else
                return liczby[1];
        }
        if(indeks >= rozmiar - 1)
            return max;
        if (liczby[indeks+1] > liczby[indeks] && liczby[indeks+1] > max) {
            max = liczby[indeks+1];
        }
        return znajdz_max_element(liczby, rozmiar, indeks+1, max);
    }
    public static void zadanie13() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy: ");
        int rozmiar = scanner.nextInt();
        System.out.println("Podaj " + rozmiar + " elementów tablicy: ");
        int [] elementy = new int[rozmiar];
        for (int i = 0; i < rozmiar; i++) {
            elementy[i] = scanner.nextInt();
        }
        System.out.println("Największy element tablicy: " + znajdz_max_element(elementy, rozmiar, 0, elementy[0]));
    }
}