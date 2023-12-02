package Warung;

public class Elektronik extends Produk {
    private String merek;
    private int tahunProduksi;

    public Elektronik(String jenis, String nama, double harga, int stok, String merek, int tahunProduksi) {
        super(jenis, nama, harga, stok);
        this.merek = merek;
        this.tahunProduksi = tahunProduksi;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }

    @Override
    public void tampilkanInformasi(){
        System.out.println("Jenis: "+this.getJenis()+",");
        System.out.println("Nama: "+this.getNama()+",");
        System.out.println("Merek: "+this.getMerek()+",");
        System.out.println("Tahun Produksi: "+this.getTahunProduksi()+",");
        System.out.println("Harga: "+this.getHarga()+",");
        System.out.println("Stok: "+this.getStok());
    }
}
