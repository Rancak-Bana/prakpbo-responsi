import java.time.Year;

public class Fans {
    private String nama;
    private String alamat;
    private int tahunLahir;
    private int umur;

    public Fans(String nama, String alamat, int tahunLahir) {
        this.nama = nama;
        this.alamat = alamat;
        this.tahunLahir = tahunLahir;
        this.umur = hitungUmur();
    }

    private int hitungUmur() {
        Year tahunSekarang = Year.now();
        int tahun = tahunSekarang.getValue();
        return tahun - tahunLahir;
    }

    public void bernyanyi() {
        System.out.println("Bernyanyi anthem");
    }

    public void cetakIdentitas() {
        System.out.println("Nama            : " + nama);
        System.out.println("Alamat          : " + alamat);
        System.out.println("Umur            : " + umur);
    }

    public int getUmur() {
        return umur;
    }
}