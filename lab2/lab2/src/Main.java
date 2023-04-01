// Zaimplementuj klasę Card reprezentującą pojedynczą kartę do gry z talii kart.
// Klasa powinna przechowywać wartość i kolor: kier, karo, pik, trefl.
// W zadaniu użyj typu wyliczeniowego.
// Napisz program testujący, który stworzy trzy różne obiekty klasy Card.
// Wykonawca: Adrianna Potrykus

class Card {
    public enum Color {
        KIER, KARO, PIK, TREFL
    }
    public enum Value {
        DWÓJKA, TRÓJKA, CZWÓRKA, PIĄTKA, SZÓSTKA, SIÓDEMKA, ÓSEMKA, DZIEWIĄTKA, DZIESIĄTKA, JOPEK, DAMA, KRÓL, AS
    }
    Color color;
    Value value;
}

public class Main {
    public static void main(String[] args) {
        Card dwojkaPik = new Card();
        dwojkaPik.color = Card.Color.PIK;
        dwojkaPik.value = Card.Value.DWÓJKA;

        Card asSerce = new Card();
        asSerce.color = Card.Color.KIER;
        asSerce.value = Card.Value.AS;

        Card siedemKaro = new Card();
        siedemKaro.color = Card.Color.KARO;
        siedemKaro.value = Card.Value.SIÓDEMKA;
    }
}