public class EvKontrolMerkezi {
    private static EvKontrolMerkezi merkez;
    private EvKontrolMerkezi(){}

    static EvKontrolMerkezi getMerkez(){
        if (merkez==null)
            merkez=new EvKontrolMerkezi();
        return merkez;
    }

    void isiklariAc(){
        System.out.println("Isiklari Acildi");
    }

    void isiklariKapat(){
        System.out.println("Isiklari Kapatildi");
    }
}
