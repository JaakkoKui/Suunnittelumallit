

public class Kello implements Cloneable{

    protected Viisari tuntiViisari;
    protected Viisari minuuttiViisari;
    protected Viisari sekunttiViisari;





    public Kello(){
        this.tuntiViisari = new Viisari(24);
        this.minuuttiViisari = new Viisari(60);
        this.sekunttiViisari = new Viisari(60);
    }

    public void getTime(){
        System.out.println(tuntiViisari.getTime()+ " : " + minuuttiViisari.getTime() + " : " + sekunttiViisari.getTime());

    }

    public void setTime(int t, int m, int s){
        this.tuntiViisari.setTime(t);
        this.minuuttiViisari.setTime(m);
        this.sekunttiViisari.setTime(s);
    }


   //Eisyväkopio
    @Override
    public Kello clone() {
        try {
            return (Kello) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    //Syväkopio
    public Kello syvaClone() {
        Kello k;
        try {
            k = (Kello) super.clone();
            k.tuntiViisari = (Viisari) this.tuntiViisari.clone();
            k.minuuttiViisari = (Viisari) this.minuuttiViisari.clone();
            k.sekunttiViisari = (Viisari) this.sekunttiViisari.clone();
            return k;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
