public class Main {
    public static void main(String[] args) {

        Kello kello = new Kello();
        kello.setTime(12, 30, 45);
        kello.getTime();
        Kello eisyva = (Kello) kello.clone();
        Kello syva = kello.syvaClone();
        eisyva.getTime();
        syva.getTime();

        kello.setTime(13, 34, 45);
        System.out.println("Kello");
        kello.getTime();
        System.out.println("Ei syvä");
        eisyva.getTime();
        System.out.println("Syvä");
        syva.getTime();

        System.out.println("==============================");

        eisyva.setTime(14, 35, 46);
        System.out.println("Eisyväkopio");
        eisyva.getTime();
        System.out.println("Syväkopio");
        syva.getTime();
        System.out.println("Kello");
        kello.getTime();

        System.out.println("==============================");

        syva.setTime(15, 36, 47);
        System.out.println("Eisyväkopio");
        syva.getTime();
        System.out.println("Syväkopio");
        eisyva.getTime();
        System.out.println("Kello");
        kello.getTime();
    }
}