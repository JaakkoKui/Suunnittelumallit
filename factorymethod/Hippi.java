package factorymethod;


public class Hippi extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Mehu();
    };

}

