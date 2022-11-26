public class HardDrive {
            public int Read(long lba, int size){
                System.out.println("Reading booting operating system from hard-drive " + lba);
                return size;
            };
}
