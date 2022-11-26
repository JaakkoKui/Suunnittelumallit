public class Downcommand implements Command {
    Screen screen;
    public Downcommand(Screen screen) {
        this.screen = screen;
    }
    public void execute() {
        screen.screenDown();
    }
}

