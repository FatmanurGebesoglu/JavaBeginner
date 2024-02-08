class donguler {
    public static void main(String[] args){
        for(int i=1; i<10; i++){
            System.out.println("bu bir döngü"+ i);
        }

        int sayi = 10;
        while(sayi<=100){
            System.out.println(sayi);
            sayi= sayi+10;
        }

        int sayi2=10;
        do{
            System.out.println("do çalıştı");
        }while (sayi2>100);

    }
}
