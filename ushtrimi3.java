import java.util.Scanner;

public class ushtrimi3{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        if(num1 > num2 && num2 > num3) System.out.println("Jane ne rend zbirtes.");
        else if (num3 > num2 && num2 > num1) System.out.println("Jane ne rend rrites.");
        else System.out.println("Nuk kane rend");
        in.close();
    }
}