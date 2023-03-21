public class GraphicsCard extends SystemBlockDevice {
    public int gpuMemorySize;

    public float clockSpeed;

    public String coolingSystem;

    public GraphicsCard (String brand, int price, int height, int length, int width, int gpuMemorySize, float clockSpeed, String coolingSistem) {
        super(brand, price, height, length, width);
        this.gpuMemorySize = gpuMemorySize;
        this.clockSpeed = clockSpeed;
        this.coolingSystem = coolingSistem;
    }
}
