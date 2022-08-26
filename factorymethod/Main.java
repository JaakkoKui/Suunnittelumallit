package factorymethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus hippi = new Hippi();
        AterioivaOtus metsuri = new Metsuri();
        opettaja.aterioi();
        metsuri.aterioi();
        hippi.aterioi();
    }
}
