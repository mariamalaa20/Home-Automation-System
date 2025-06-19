public class BrightnessControlDecorator implements ILight {
    private ILight light;

    BrightnessControlDecorator(ILight light){
        this.light = light;
    }
    
    @Override
    public void turnOn() {
        System.out.println("Colored light with brightness control turned on\n");
    }
}
