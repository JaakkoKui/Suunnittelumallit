public class Viisari implements Cloneable {

    public int maxTime;
    public int time;


    public Viisari(int mt){
        this.maxTime = mt;
        this.time = 0;
    }

    public int getTime(){
        return this.time;
    }

    public void setTime(int t){
        this.time = t;
    }

    public Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("asd");
            return null;
        }
    }
}
