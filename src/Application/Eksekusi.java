package Application;

public class Eksekusi {
    public static void main (String [] args) {

        System.out.println("CLASS HEWAN---------------------");
        Hewan h = new Hewan();
        h.setTelinga("panjang");
        System.out.println("Telinga jerapah itu " + h.getTelinga());
        System.out.println("dan ia sedang bermain " + h.bermain("bola"));

        System.out.println("----------------------------------");
        System.out.println("CLASS MANUSIA---------------------");
        Manusia m = new Manusia();
        m.setMata("sipit");
        System.out.println("Mata Akbar " + m.getMata());
        System.out.println("Jika sudah malam saya akan tidur: " + m.tidur("malam"));


        System.out.println("----------------------------------");
        System.out.println("CLASS PesawatTelepon--------------");
        PesawatTelepon Tel = new PesawatTelepon();
        Tel.setBentuk("persegi panjang");
        System.out.println("Telpon saya berbentuk "+Tel.getBentuk());

        System.out.println("Saya sedang "+ Tel.melakukan_panggilan("melakukan panggilan"));


    }
}
