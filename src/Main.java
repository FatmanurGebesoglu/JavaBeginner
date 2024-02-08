import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int not = 55; //integer
        //System.out.println(not);
        double notOrtalamasi = 50.5;
        String isim = "Fatmanur";
        boolean isAuthentication= true;
        //isimlendireme camelCase
        //class PascalCase ile isimlendirilir

        Product product1= new Product();
        product1.setName("Laptop");

        Product product2= new Product();
        product2.setName("Mouse");

        Product[] urunler = new Product[]{product1,product2};



        //CreditManager creditManager = new CreditManager();
        //interface newlenemez
        //creditManager.calculate();

        MortgageManager mortgageManager =new MortgageManager();


       // CreditManager[] credits = new CreditManager[3];
//        credits[0]=new MortgageManager();
//        credits[1]=new VehicleManager();
//        credits[2]=new OfficerManager();
//        for(int i=0; i< credits.length; i++){
//            credits[i].calculate();
//        }
        ArrayList<CreditManager> credits = new ArrayList<CreditManager>();
        credits.add(new MortgageManager());
        credits.add(new VehicleManager());
        credits.add(new OfficerManager());

        for(CreditManager credit : credits){
            credit.calculate();
        }

    }
}