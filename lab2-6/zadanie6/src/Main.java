// Zaimplementuj klasę Invoice reprezentującą fakturę dla sklepu. Klasa przechowuje następujące informacje:
// product_number (typ String), prodcut_description (typ String), quantity(typ int) ipricePerItem(typ double).
// Klasa powinna mieć konstruktor, który umożliwi podanie wszystkich 4 parametrów. Zaimplementuj metody set
// i get dla każdej zmiennej. Dodaj metodę: -Amount, które zwraca iloczyn quantity i pricePerItem.
// Jeżeli pricePerItem nie jest dodatnia,Amountpowinien zwrócić 0. Jeżeli quantity nie jest dodatnie,Amount`
// powinna zwrócić 0. Przetestuj zaimplementowany program.
// Wykonawca: Adrianna Potrykus

class Invoice {
    private String product_number;
    private String product_description;
    private int quantity;
    private double pricePerItem;

    public Invoice(String product_number, String product_description, int quantity, double pricePerItem) {
        this.product_number = product_number;
        this.product_description = product_description;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getProduct_number() {
        return product_number;
    }

    public void setProduct_number(String product_number) {
        this.product_number = product_number;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public double Amount() {
        if(pricePerItem <= 0)
            return 0;
        return quantity * pricePerItem;
    }
}

public class Main {
    public static void main(String[] args) {
        Invoice krzeslo = new Invoice("123", "Krzeslo czarne welur", 10, 150);
        Invoice biurko = new Invoice("456", "Biurko sosna jasna", 0, 750);

        System.out.println("Krzeslo product_number: " + krzeslo.getProduct_number());
        System.out.println("Krzeslo product_description: " + krzeslo.getProduct_description());
        System.out.println("Krzeslo quantity: " + krzeslo.getQuantity());
        System.out.println("Krzeslo pricePerItem: " + krzeslo.getPricePerItem());
        System.out.println("Ilość krzeseł: " + krzeslo.Amount());

        System.out.println();

        System.out.println("Biurko product_number: " + biurko.getProduct_number());
        System.out.println("Biurko product_description: " + biurko.getProduct_description());
        System.out.println("Biurko quantity: " + biurko.getQuantity());
        System.out.println("Biurko pricePerItem: " + biurko.getPricePerItem());
        System.out.println("Ilość biurek: " + biurko.Amount());
    }
}