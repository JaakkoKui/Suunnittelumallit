public class ComputerFacade {

    public CPU cpu_;
    public Memory memory_;
    public HardDrive hard_drive_;

    public ComputerFacade() {
        cpu_ = new CPU();
        memory_ = new Memory();
        hard_drive_ = new HardDrive();
    }
    private int kBootAddress = 111;
    private long kBootSector = 345;
    private int kSectorSize = 666;

    public void Start() {
        System.out.println("ComputerFacade start");
        cpu_.Freeze();
        memory_.Load(kBootAddress, hard_drive_.Read(kBootSector, kSectorSize));
        cpu_.Jump(kBootAddress);
        cpu_.Execute();

    }


}
