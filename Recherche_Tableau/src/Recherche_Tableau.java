import java.util.Scanner;
public class Recherche_Tableau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tab = new int[10];

        System.out.print("entre le nombre x : ");
        int x = scanner.nextInt();

        for(int i = 0; i < 10; i++ ){
            System.out.print("tab[ "+i+" ] = ");
            tab[i] = scanner.nextInt();
        }
        boolean trouve = false ;
        for(int i = 0; i < 10; i++){
            if(x == tab[i]){
            System.out.println("Le nombre " + x + " existe à l'indice : tab[ " + i + " ] = " +x );
            trouve = true;
            }
        }
        if (!trouve)
            System.out.println("le nombre n'est pas trouver");
    }
}
