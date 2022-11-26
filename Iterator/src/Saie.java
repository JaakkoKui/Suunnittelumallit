import java.util.ArrayList;
import java.util.Iterator;

public class Saie extends Thread {


    ArrayList ale;
    Iterator it;

    Saie(ArrayList al) {
        ale = al;
        it = ale.iterator();
    }

    int i = 0;

    public void run() {
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void add() {
        ale.add(1);
    }

    public void remove() {
        ale.remove(60);
    }
}
