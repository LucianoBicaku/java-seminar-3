import java.util.Scanner;

public class ushtrimi7{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str[];
        str = new String[5];
        for(int i=0; i<5; i++){
            str[i] = in.next();
        }
        for(int i=0; i<5; i++){
            String first = str[i];
            int index = i;
            for(int j= i+1; j<5; j++){
                if(str[j].compareTo(first)<0){
                    first = str[j];
                    index = j;
                }
            }
            str[index] = str[i];
            str[i] = first;
        }
        for(int i=0; i<5; i++){
            System.out.println(str[i]);
        }
        in.close();
    }
}