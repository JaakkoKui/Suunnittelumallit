package factorymethod;


public class Metsuri extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Kalja();
    };

}
