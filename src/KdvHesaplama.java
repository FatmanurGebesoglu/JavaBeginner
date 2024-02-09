import java.util.Scanner;

class KdvHesaplama {
    public static void main(String[] args){
        //kdv %18
        Scanner input = new Scanner(System.in);
        double tutar,kdv,sonuc;
        System.out.print("Hesaplanacak tutarı giriniz:");
        tutar=input.nextDouble();
        kdv= (tutar*18)/100;
        System.out.println("kdv tutarı:" +kdv);
        sonuc= tutar+kdv;
        System.out.println("toplam ödenecek tutar:"+sonuc);
    }
}
