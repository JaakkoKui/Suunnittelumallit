public class Fixcommand implements Command {
    Screen screen;
    public Fixcommand(Screen screen) {
        this.screen = screen;
    }
    public void execute() {
        screen.screenFix();
    }
}

