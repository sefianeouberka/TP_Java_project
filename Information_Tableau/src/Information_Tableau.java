import java.util.Scanner;
public class Information_Tableau {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] tab;

        System.out.print("Entrer le dimension de tableau tab n = ");
        int n = scanner.nextInt();

        tab = new int[n];
        System.out.println("--- Saisie des éléments ---");
        for(int i = 0; i < n ; i++){
            System.out.print("tab[" + i + "] = ");
            tab[i] = scanner.nextInt();
        }

        // afichage du tableau
        System.out.println("--- Affichage des éléments ---");
        for(int i = 0; i < n ; i++){
            System.out.print("Élément à l'indice " + i + " : " + tab[i]);
        }
    }
}
