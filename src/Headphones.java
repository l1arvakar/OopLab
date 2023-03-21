public class Headphones extends OutputDevice {
    public String connectionType;

    public Headphones(String brand, int price, OutputInformationType type, String connectionType) {
        super(brand, price, type);
        this.connectionType = connectionType;
    }
}
