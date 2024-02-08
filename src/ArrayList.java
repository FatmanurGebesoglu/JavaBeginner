class ArrayList {
    public static void main(String[] args) {
        String[] sehirler1 = new String[]{"Ankara", "İstanbul", "İzmir"};

        //sehirler1 = new String[4];
        //sehirler1[3] = "Bursa";
        System.out.println(sehirler1[1]);
        String[] sehirlerr2 = new String[]{"Antep", "Diyarbakır", "Urfa"};

        sehirler1=sehirlerr2; //sehirler1 in referans numarası sejirler2 nin referans numarası eşitleniyor adresler aynı oluyor
        sehirler1[0]="Adana";
        System.out.println(sehirlerr2[0]);
        System.out.println(sehirler1[0]);

        int sayi1=10;
        int sayi2=20;
        sayi1=sayi2;
        sayi2=30;
        System.out.println(sayi1); //çıktı:20

        // value types: bool, int, double...
        // reference types: array, class, abstract,interface

    }
}
