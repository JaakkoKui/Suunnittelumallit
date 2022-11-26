public class Main {
    public static void main(String[] args) {
        Screen screen = new Screen();
        Command up = new Upcommand(screen);
        Command down = new Downcommand(screen);
        WallButton upButton = new WallButton(up);
        WallButton downButton = new WallButton(down);
        WallButton breakButton = new WallButton(new Breakcommand(screen));
        WallButton fixButton = new WallButton(new Fixcommand(screen));
        upButton.press();
        downButton.press();
        breakButton.press();
        fixButton.press();


    }
}