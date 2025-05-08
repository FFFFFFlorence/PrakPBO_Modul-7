class Kendaraan {
    String merk = "Toyota"; //subclass attribute

    public Kendaraan() {
        System.out.println("Kendaraan dibuat"); //superclass constructor
    }


    void jalan() { //superclass method
        System.out.println("Kendaraan berjalan");
    }
}

class Mobil extends Kendaraan{ 

    //subclass
    public Mobil() {
        super();
        System.out.println("Mobil dibuat"); //subclass constructor
    }
    
    void printInfo() { //subclass method
        System.out.println("Merk mobil child: " + merk); //accessing superclass attribute
        System.out.println("Mobil parent " + super.merk); //subclass method
        jalan();
    }

    void klakson(String merk) { //overriding method
        System.out.println("Klakson mobil " + super.merk + " berbunyi");
    }

}

public class main {
    public static void main(String[] args) {
        Mobil jazz = new Mobil(); //object of subclass
        // jazz.jalan(); //calling subclass method
        jazz.printInfo(); //calling subclass method
        jazz.klakson("BMW"); //calling subclass method
        System.out.println(jazz.merk); //accessing subclass attribute
    }
}
