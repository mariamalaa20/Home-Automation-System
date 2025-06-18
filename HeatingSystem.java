
public class HeatingSystem {
    private ITemperatureStrategy strategy;

    void setStrategy(ITemperatureStrategy strategy){
        this.strategy = strategy;
    }

    void changeTemperature(){
        strategy.adjustTemperature();
    }
}
