enum InputInformationType {
    GraphicInfo, AudioInfo, CoordinateInfo;
}
public abstract class InputDevice extends PCComponent {
    public InputInformationType type;

    public InputDevice(String brand, int price, InputInformationType type) {
        super(brand, price);
        this.type = type;
    }

}
