import java.util.Scanner;

public class ushtrimi5{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String grade = in.next();
        double nota;
        switch (Character.toUpperCase(grade.charAt(0))){
            case 'A':
                nota = 4;
                break;
            case 'B':
                nota = 3;
                break;
            case 'C':
                nota = 2;
                break;
            case 'D':
                nota = 1;
                break;
            default:
                nota = 0;
        }
        if(grade.charAt(1) == '+') nota += 0.3;
        if(grade.charAt(1) == '-') nota -= 0.3;
        System.out.println(nota);
        in.close();
    }  
}