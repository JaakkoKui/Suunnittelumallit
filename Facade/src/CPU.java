public class CPU {
    void Freeze() {
        System.out.println("CPU freeze");
    }

    void Jump(long position) {
        System.out.println("CPU jump to " + position + " position");
    }

    void Execute() {
        System.out.println("Executing booting operating system, turing on...");
    }
}
