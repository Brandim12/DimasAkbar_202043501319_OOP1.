package Application;

public class Manusia {
    String rambut, mata, mulut,
            telinga, tangan, kaki;

    //SETTER
    public void setRambut(String rambut) {
        this.rambut = rambut;
    }

    public void setMata(String mata) {
        this.mata = mata;
    }

    public void setMulut(String mulut) {
        this.mulut = mulut;
    }

    public void setTelinga(String telinga) {
        this.telinga = telinga;
    }

    public void setTangan(String tangan) {
        this.tangan = tangan;
    }

    public void setKaki(String kaki) {
        this.kaki = kaki;
    }

    //GETTER
    public String getRambut() {
        return rambut;
    }

    public String getMata() {
        return mata;
    }

    public String getMulut() {
        return mulut;
    }

    public String getTelinga() {
        return telinga;
    }

    public String getTangan() {
        return tangan;
    }

    public String getKaki() {
        return kaki;
    }


    //METHOD
    String bermain(String b){
        return b;
    }

    String makan(String mkn){
        return mkn;
    }

    Boolean tidur(String tdr){
        if ("malam" == tdr){
            return true;
        }
        return false;
    }

    String bekerja(String krj){
        return krj;
    }

    String memasak(String msk){
        return msk;
    }

    String mencuci(String cuci){
        return cuci;
    }
}

