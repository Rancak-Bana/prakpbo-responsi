package Warung;

public class Order {
    private Produk produk;
    private int jumlah;

    public Order(Produk produk, int jumlah) {
        this.produk = produk;
        this.jumlah = jumlah;
    }

    public Produk getProduk() {
        return produk;
    }

    public void setProduk(Produk produk) {
        this.produk = produk;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public void hitungTotalHarga(){
        Produk produkPilihan = this.getProduk();
        int jumlahProduk = this.getJumlah();
        double hargaTotal;
        hargaTotal = jumlahProduk * (produkPilihan.getHarga() -
                produkPilihan.hitungDiskon());
        produkPilihan.tampilkanInformasi();
        System.out.println("Total Harga: "+hargaTotal);
        System.out.println("==============");
    }
}