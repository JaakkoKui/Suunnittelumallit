public class Breakcommand implements Command {
    Screen screen;
    public Breakcommand(Screen screen) {
        this.screen = screen;
    }
    public void execute() {
        screen.screenBreak();
    }
}

