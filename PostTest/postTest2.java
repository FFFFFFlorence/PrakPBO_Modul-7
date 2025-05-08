class Orang {
    public Orang () {
        System.out.println("Orang dibuat!");
    }
}

class Dosen extends Orang {
    public Dosen () {
        super();
        System.out.println("Dosen dibuat!");
    }
}

public class postTest2 {
    public static void main(String[] args) {
        Dosen dosen = new Dosen();
    }
}
