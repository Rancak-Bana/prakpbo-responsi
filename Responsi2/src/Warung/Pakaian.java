package Warung;

public class Pakaian extends Produk {
    private String ukuran;
    private String bahan;

    public Pakaian(String jenis, String nama, double harga, int stok, String ukuran, String bahan) {
        super(jenis, nama, harga, stok);
        this.ukuran = ukuran;
        this.bahan = bahan;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    @Override
    public void tampilkanInformasi(){
        System.out.println("Jenis: "+this.getJenis()+",");
        System.out.println("Nama: "+this.getNama()+",");
        System.out.println("Ukuran: "+this.getUkuran()+",");
        System.out.println("Bahan: "+this.getBahan()+",");
        System.out.println("Harga: "+this.getHarga()+",");
        System.out.println("Stok: "+this.getStok());
    }
}
