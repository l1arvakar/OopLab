enum OutputInformationType {
    GraphicInfo, AudioInfo;
}

public abstract class OutputDevice extends PCComponent {

    public OutputInformationType type;

    public OutputDevice(String brand, int price, OutputInformationType type) {
        super(brand, price);
        this.type = type;
    }
}
