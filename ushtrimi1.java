import java.util.Scanner;

public class ushtrimi1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(num > 0){
            System.out.println(num + " Eshte pozitiv");
        }
        else if(num < 0){
            System.out.println(num + " Eshte negativ");
        }
        else{
            System.out.println("Eshte 0");
        }
        in.close();
    }
}