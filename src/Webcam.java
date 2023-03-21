public class Webcam extends InputDevice {
    public int frameRate;

    public int matrixResolution;

    public Webcam(String brand, int price, InputInformationType type, int frameRate, int matrixResolution) {
        super(brand, price, type);
        this.frameRate = frameRate;
        this.matrixResolution = matrixResolution;
    }

}
