import java.util.Scanner;

public class ushtrimi16{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Shkruaj vleren e blerjes");
        double moneySpent = in.nextDouble();
        double coupon;
        if(moneySpent <= 10){
            coupon = 0;
        }
        else if(moneySpent > 10 && moneySpent <= 60){
            coupon = 0.08;
        }
        else if(moneySpent > 60 && moneySpent <=150){
            coupon = 0.1;
        }
        else if(moneySpent > 150 && moneySpent <=210){
            coupon = 0.12;
        }
        else{
            coupon = 0.14;
        }
        System.out.println("Vlera pa kupon: "+moneySpent+"$");
        moneySpent -= (moneySpent * coupon);
        System.out.println("Vlera me kupon: "+moneySpent+"$");
        in.close();
    }
} 