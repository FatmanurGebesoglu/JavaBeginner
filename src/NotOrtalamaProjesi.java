import java.util.Scanner;

class NotOrtalamaProjesi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int fizik, matematik,turkce,kimya,muzik,tarih;
        System.out.print("fizik notunuz:");
        fizik=input.nextInt();
        System.out.print("matematik notunuz:");
        matematik=input.nextInt();
        System.out.print("turkce notunuz:");
        turkce=input.nextInt();
        System.out.print("kimya notunuz:");
        kimya=input.nextInt();
        System.out.print("müzik notunuz:");
        muzik=input.nextInt();
        System.out.print("tarih notunuz:");
        tarih=input.nextInt();

        double ortalama= (fizik+ matematik+ turkce+ kimya+ muzik+tarih)/6;
        System.out.println("ortalamanız:"+ ortalama);

        while (ortalama>=60){
            System.out.println("geçti");
            break;
        }
        while (ortalama<60){
            System.out.println("kaldı");
            break;
        }

    }
}
