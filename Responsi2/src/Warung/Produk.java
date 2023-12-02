package Warung;

public class Produk {
    private String jenis;
    private String nama;
    private double harga;
    private int stok;

    public Produk(String jenis, String nama, double harga, int stok) {
        this.jenis = jenis;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void tampilkanInformasi(){
        System.out.println("Jenis: "+this.getJenis()+",");
        System.out.println("Nama: "+this.getNama()+",");
        System.out.println("Harga: "+this.getHarga()+",");
        System.out.println("Stok: "+this.getStok());
    }


    public double hitungDiskon(){
        double jumlahDiskon;
        if(this.jenis.contains("Elektronik")){
            jumlahDiskon = this.getHarga()*0.5;
            return jumlahDiskon;
        } else if(this.jenis.contains("Pakaian")){
            jumlahDiskon = this.getHarga()*0.2;
            return jumlahDiskon;
        }
        return 0;
    }
}
