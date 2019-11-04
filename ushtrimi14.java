import java.util.Scanner;

public class ushtrimi14{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Shkruani emrin: ");
        String emri = in.next();
        System.out.print("Shkruani pagen/ore: ");
        int pagaOre = in.nextInt();
        System.out.print("Shkruani ore qe keni punuar javen e kaluar: ");
        int Ore = in.nextInt();
        double pagaJavore = Ore * pagaOre;
        if( Ore > 40 ){
            pagaJavore = pagaJavore * 1.5 ;
        }
        System.out.println("Page e "+ emri + ": "+ pagaJavore);
        in.close();
    }
}