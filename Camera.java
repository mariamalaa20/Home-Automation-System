public class Camera implements IObserver {
    @Override
    public void update(String message) {
        System.out.println("Camera: " + message);
    }
}
