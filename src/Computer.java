public class Computer {
    // Instance variables
    private String processor;
    private String ram;
    private String hardDrive;

    // Constructor
    public Computer(String processor, String ram, String hardDrive) {
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
    }

    // Getter methods
    public String getProcessor() {
        return processor;
    }

    public String getRam() {
        return ram;
    }

    public String getHardDrive() {
        return hardDrive;
    }
}