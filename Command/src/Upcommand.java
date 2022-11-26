public class Upcommand implements Command {
    Screen screen;
    public Upcommand(Screen screen) {
        this.screen = screen;
    }
    public void execute() {
        screen.screenUp();
    }
}

