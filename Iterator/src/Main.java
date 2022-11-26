import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ArrayList al = new ArrayList();

        for (int i = 0; i < 80; i++) {
            al.add(i);
        }

        Saie saie = new Saie(al);
        Saie saie2 = new Saie(al);
        Saie saie3 = new Saie(al);
        Saie saie4 = new Saie(al);
        Saie saie5 = new Saie(al);
        Saie saie6 = new Saie(al);
        Saie saie7 = new Saie(al);
        Saie saie8 = new Saie(al);

        System.out.println("\neri iteraattori\n");

        saie.run();
        saie2.run();


        System.out.println("\nsama iteraattori, menee sekaisin välillä\n");

        saie3.start();
        saie4.start();


        sleep(3000);



        System.out.println("\nlistaa muutetaan kesken kaiken, concurrent error\n");
        saie5.start();
        saie6.add();

        sleep(3000);
        System.out.println("\nListasta poistetaan Concurrent error\n");
        saie7.start();
        saie8.remove();
    }
}

