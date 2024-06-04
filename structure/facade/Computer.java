package structure.facade;

public class Computer {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void startComputer() {
        try {
            cpu.start();
            memory.load();
            hardDrive.readData();
            cpu.execute();
        } catch (Exception e) {
            System.out.println("Error starting computer: " + e.getMessage());
        }
    }
}
