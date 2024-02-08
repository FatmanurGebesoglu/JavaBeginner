class metotlar {
    public static void main(String[] args){
        mesajVer("Fatmanur");
        hesapla();
        topla(5,4);
    }
    public static void mesajVer(String isim){
        System.out.println("merhaba"+isim);
    }
    public static void hesapla(){
        System.out.println("hesaplandı");
    }
    public static int topla(int sayi1, int sayi2){
        int toplam=sayi1+sayi2;
        return toplam;
    }
    //toplanan iki sayinin %10 unu bul
    public static void toplananIkiSayininYuzdeOnu(int sayi1, int sayi2){
        int toplam= topla(sayi1,sayi2);
        double sonuc= (toplam * 10)/100;
        System.out.println("Sonuç:" + sonuc );
    }


}
