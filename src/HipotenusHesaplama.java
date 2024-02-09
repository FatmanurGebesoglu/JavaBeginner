import java.util.Scanner;

class HipotenusHesaplama {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double a,b,hipo;
        System.out.print("birinci kenarı giriniz:");
        a= scan.nextDouble();
        System.out.print("ikinci kenarı giriniz:");
        b= scan.nextDouble();

        hipo= Math.sqrt((a*a)+(b*b));
        System.out.println("hipotenüs:"+hipo);
        double cevre,u,alan;
        u=(a+b+hipo)/2;
        cevre=2*u;
        alan= Math.sqrt(u*(u-a)*(u-b)*(u-hipo));
        System.out.println("üçgenin alanı:"+alan);



    }
}
