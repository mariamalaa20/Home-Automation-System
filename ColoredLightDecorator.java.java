public class ColoredLightDecorator implements ILight {
    private ILight light;

    ColoredLightDecorator(ILight light){
        this.light = light;
    }
    
    @Override
    public void turnOn() {
        System.out.println("Colored light turned on");
    }
}
