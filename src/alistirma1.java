class alistirma1 {
    public static void main(String[] args){
        int[] sayilar = new int[]{1,2,3,4,5,6,7,8,9,10};
        Bul(sayilar,3);
    }
    public static void Bul(int[] arr, int sayi ){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==sayi){
                System.out.println("aranan sayi bulundu!"+sayi);
            }
        }
    }
    public static boolean sayiBul(int[] arr, int sayi){
        boolean varMi=false;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==sayi){
                varMi= true;
            }
        }
        return varMi;
    }
}
//bir fonk yaz
//iki parametre alsin 1.p = dizi 2.p = aranacak değer
//3 sayısı dizide var mı baksın ve çıktı göndersin
