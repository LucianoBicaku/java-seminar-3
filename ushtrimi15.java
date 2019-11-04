import java.util.Scanner;

public class ushtrimi15{
    public static void main(String[] args) {
        int pin = 1234;
        Scanner in = new Scanner(System.in);
        Boolean correct = false;
        for(int i=0; i<3; i++){
            int inputPin = in.nextInt();
            if(pin==inputPin){
                correct = true;
                break;
            }
            System.out.println("Pin Jo i Sakte");
        }
        if(correct){
            System.out.println("Pin i Sakte");
        }
        else System.out.println("Karta u bllokua");
        in.close();
    }
}