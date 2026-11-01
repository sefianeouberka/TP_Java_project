import java.util.Scanner;
public class Calcul_Tableau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tab;
        System.out.print("Entrer le dimension de votre taleau n = ");
        int n = scanner.nextInt();

        tab = new int[n] ;
        for(int i = 0; i < n; i++){
            System.out.print("tab[ " +i+ " ] = ");
            tab[i] = scanner.nextInt();
        }
        // Calcule la somme des éléments.
        System.out.println("la somme des éléments de tableau est : " + tab.length);

        //Calcule leur moyenne.
        int m = 0;
        int s = 0;
        for(int i = 0; i < n; i++){
            s = tab[i] + s;
        }
        m = s/tab.length;
        System.out.println("Le moyenne des elements de tableau est : " + m);

        // Affiche les éléments supérieurs à la moyenne.
        for(int i = 0; i < n; i++){
            if(tab[i] > m) {
                System.out.println("Les elements supérieurs à la moyenne " + m + " est :" +tab[i]);
            }
        }
    }
}
