package Warung;

public class Main {
    public static void main(String[] args) {
        Elektronik laptop = new Elektronik("Elektronik", "Laptop", 1000000, 10, "Dell", 2023);
        Pakaian kaos = new Pakaian("Pakaian", "Kaos", 50000, 20, "L", "Katun");
        Order orderLaptop = new Order(laptop, 1);
        orderLaptop.hitungTotalHarga();
        Order orderKaos = new Order(kaos, 1);
        orderKaos.hitungTotalHarga();
    }
}