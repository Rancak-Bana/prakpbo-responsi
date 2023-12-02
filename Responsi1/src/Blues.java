public class Blues extends Fans {
    private String pemainFavorit;
    private String tribun;

    public Blues(String nama, String alamat, int tahunLahir, String pemainFavorit) {
        super(nama, alamat, tahunLahir);
        this.pemainFavorit = pemainFavorit;
        setTribun();
    }

    public void setPemainFavorit(String pemainFavorit) {
        this.pemainFavorit = pemainFavorit;
    }

    public String getPemainFavorit() {
        return pemainFavorit;
    }

    public void setTribun() {
        if (getUmur() < 20 && getUmur() > 60) {
            tribun = "Barat dan Timur";
        } else {
            tribun = "Utara dan Selatan";
        }
    }

    @Override
    public void cetakIdentitas() {
        super.cetakIdentitas();
        System.out.println("Anthem          : Blue is The Colour");
        System.out.println("Pemain Favorit  : " + pemainFavorit);
        System.out.println("Tribun          : " + tribun);
    }
}