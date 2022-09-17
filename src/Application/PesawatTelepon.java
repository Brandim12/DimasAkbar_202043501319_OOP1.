package Application;

public class PesawatTelepon {
    String bentuk, kabel, gagang_telepon;

    //SETTER
    public void setBentuk(String bentuk) {
        this.bentuk = bentuk;
    }

    public void setKabel(String kabel) {
        this.kabel = kabel;
    }

    public void setGagang_telepon(String gagang_telepon) {
        this.gagang_telepon = gagang_telepon;
    }

    //GETTER
    public String getBentuk() {
        return bentuk;
    }

    public String getKabel() {
        return kabel;
    }

    public String getGagang_telepon() {
        return gagang_telepon;
    }

    //METHOD
    String terima_panggilan(String terimaPanggilan){
        return terimaPanggilan;
    }

    String melakukan_panggilan(String melakukanPanggilan){
        return melakukanPanggilan;
    }

}
