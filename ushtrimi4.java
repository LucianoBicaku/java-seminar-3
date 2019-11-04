import java.util.Scanner;

public class ushtrimi4{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num = in.next();
        if(num.charAt(0) == num.charAt(3) && num.charAt(1) == num.charAt(2)){
            System.out.println("Dycifte.");
        }
        else System.out.println("Jo Dycifte.");
        in.close();
    }
}