public class CPU extends SystemBlockDevice {

    public int numberOfCores;

    public float clockSpeed;

    public CPU (String brand, int price, int height, int length, int width, int numberOfCores, float clockSpeed) {
        super(brand, price, height, length, width);
        this.numberOfCores = numberOfCores;
        this.clockSpeed = clockSpeed;
    }
}
