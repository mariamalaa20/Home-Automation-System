public class HomeControlCenter {
    private static HomeControlCenter center;
    private HomeControlCenter(){}

    static HomeControlCenter getCenter(){
        if (center == null)
            center = new HomeControlCenter();
        return center;
    }

    void turnOnLights(){
        System.out.println("Lights turned on");
    }

    void turnOffLights(){
        System.out.println("Lights turned off");
    }
}
