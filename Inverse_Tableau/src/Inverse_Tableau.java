import java.util.Scanner;
import java.util.Arrays;
public class Inverse_Tableau {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] tab1;
        int[] tab2;

        System.out.print("Entre le dimension de votre tableau n : ");
        int n = scanner.nextInt();

        tab1 = new int[n];
        tab2 = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("tab1[ "+i+" ] = ");
            tab1[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            tab2[i] = 0;
        }
        for(int i = 0; i < n; i++){
            tab2[i] = tab1[n-i];
        }
        System.out.println("Inverse_Tab1 est "+ Arrays.toString(tab2));
    }
}
