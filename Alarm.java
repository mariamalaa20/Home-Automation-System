public class Alarm implements IObserver{

    @Override
    public void guncelle(String mesaj) {
        System.out.println("Alarm: "+mesaj+"\n");
    }
}
