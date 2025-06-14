public class Alarm implements IObserver {
    @Override
    public void update(String message) {
        System.out.println("Alarm: " + message + "\n");
    }
}
