public class Main {
    public static void main(String[] args) {
        // Singleton
        HomeControlCenter center = HomeControlCenter.getCenter();
        center.turnOnLights();

        // Observer
        MotionSensor sensor = new MotionSensor();
        sensor.addObserver(new Camera());
        sensor.addObserver(new Alarm());
        sensor.detectMotion();

        // Strategy
        HeatingSystem heating = new HeatingSystem();
        heating.setStrategy(new EconomicHeating());
        heating.changeTemperature();

        heating.setStrategy(new FastHeating());
        heating.changeTemperature();

        // Decorator
        ILight basicLight = new BasicLight();
        ILight coloredLight = new ColoredLightDecorator(basicLight);
        ILight brightLight = new BrightnessControlDecorator(coloredLight);

        System.out.println("\nBasic light:");
        basicLight.turnOn();

        System.out.println("\nColored light:");
        coloredLight.turnOn();

        System.out.println("\nColored light with brightness control:");
        brightLight.turnOn();

        // Command
        VoiceAssistant assistant = new VoiceAssistant();
        assistant.setCommand(new TVOnCommand());
        assistant.executeCommand();

        assistant.setCommand(new AirConditionerOnCommand());
        assistant.executeCommand();
    }
}
