import java.util.Scanner;

class VucutKutleIndex {
    public static void main(String[] args){
        System.out.println("Vücüt kütle indeksi hesplama");
        Scanner input = new Scanner(System.in);
        double boy, kilo,index;
        System.out.print("Boyunuzu giriniz: ");
        boy= input.nextDouble();
        System.out.print("Kilonuzu giriniz: ");
        kilo= input.nextDouble();
        index= (kilo)/(boy*boy);
        System.out.println("indeks:" + index);

        if(index<18.5){
            System.out.println("Zayıf");
        }else if(index>=18.5 && index<24.9){
            System.out.println("ideal");
        }else if(index>=24.9 && index<29.9){
            System.out.println("şişman");
        } else if(index>=29.9 && index<34.9) {
            System.out.println("obez");
        }else if(index>=34.9){
            System.out.println("aşırı obez");
        }else {
            System.out.println("girilen değerlerde bir problem var!");
        }

    }
}
