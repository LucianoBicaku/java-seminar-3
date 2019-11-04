import java.util.Scanner;

public class ushtrimi6{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();
        double num3 = in.nextDouble();
        if(num1 > num2 && num1 > num3) System.out.println("numri me i madh: "+ num1);
        if(num2 > num1 && num2 > num3) System.out.println("numri me i madh: "+ num2);
        if(num3 > num2 && num3 > num1) System.out.println("numri me i madh: "+ num3);
        in.close();
    }
}