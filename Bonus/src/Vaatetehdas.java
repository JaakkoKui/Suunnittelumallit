public abstract class Vaatetehdas {
    public Farkut luoFarkut() {
        return new Farkut();
    }

    public Paita luoPaita(){
        return new Paita();
    }

    public Kengat luoKengat(){
        return new Kengat();
    }
}
