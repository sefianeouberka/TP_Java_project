import java.util.Scanner;
public class Min_Max_Tableau {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] tab;
        System.out.print("Enter le dimension de votre tableau n : ");
        int n = scanner.nextInt();

        tab = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("tab[ "+i+" ] = ");
            tab[i] = scanner.nextInt();
        }
        int max = tab[0];
        int min = tab[0];
         for(int i = 1; i < n; i++){
             if(max < tab[i]) {
                 max = tab[i] ;
             }
             if(min > tab[i]){
                 min = tab[i];
             }
         }
         System.out.println("le max est : "+max);
         System.out.println("le min est : "+min);
    }
}
