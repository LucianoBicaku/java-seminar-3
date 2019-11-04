import java.util.Scanner;

public class ushtrimi2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(num >= 100000) System.out.println("Numri ka 6 ose me shume shifra.");
        else if(num >= 10000) System.out.println("Numri ka 5 shifra.");
        else if(num >= 1000) System.out.println("Numri ka 4 shifra.");
        else if(num >= 100) System.out.println("Numri ka 3 shifra.");
        else if(num >= 10) System.out.println("Numri ka 2 shifra.");
        else System.out.println("Numri eshte 1-shifror.");
    }
}