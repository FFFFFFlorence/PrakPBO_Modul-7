class Kendaraan {

    public Kendaraan() {
        System.out.println("Konstruktor Kendaraan dipanggil");
    }
}

class Mobil extends Kendaraan {
    public Mobil() {
        super();
        System.out.println("Konstruktor Mobil dipanggil");
    }
}

public class tugasLat2 {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
    }
}
