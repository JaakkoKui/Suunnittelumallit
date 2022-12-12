import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Jasper {

    private final Farkut farkut;
    private final Paita paita;
    private final Kengat kengat;
    Vaatetehdas vaatetehdas;

    public Jasper() {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try{
            Class c = Class.forName(properties.getProperty("Bonus.Vaatetehdas"));
            this.vaatetehdas = (Vaatetehdas) c.getDeclaredConstructor().newInstance();
    } catch (Exception e) {
        e.printStackTrace();
    }
        this.farkut = vaatetehdas.luoFarkut();
        this.paita = vaatetehdas.luoPaita();
        this.kengat = vaatetehdas.luoKengat();
    }

    public void pue() {
        System.out.println("Jasper pukee päälleen " + farkut + ", " + paita + " ja " + kengat + ".");
    }

}