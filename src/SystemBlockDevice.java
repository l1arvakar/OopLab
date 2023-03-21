public abstract class SystemBlockDevice extends PCComponent {
    public int height;

    public int length;

    public int width;

    public SystemBlockDevice(String brand, int price, int height, int length, int width) {
        super(brand, price);
        this.height = height;
        this.length = length;
        this.width = width;
    }
}
