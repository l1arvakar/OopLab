public class Monitor extends OutputDevice {
    public float screenSize;

    public int brightness;

    public Monitor(String brand, int price, OutputInformationType type, float screenSize, int brightness) {
        super(brand, price, type);
        this.screenSize = screenSize;
        this.brightness = brightness;
    }

}
