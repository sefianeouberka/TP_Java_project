import java.util.Scanner;
public class Somme_ligne_Matrice {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[][] matrice;

        System.out.println("Entrer les nombres de lignes de votre matice L = ");
        int L = scanner.nextInt();
        System.out.println("Entrer les nombres de colomns de votre matice C = ");
        int C = scanner.nextInt();

        matrice = new int[L][C];

        for(int i = 0 ; i < L; i++){
            for(int j = 0; j < C; j++){
                System.out.println("matrice[ "+i+" ][ "+j+" ] = ");
                matrice[i][j] = scanner.nextInt();
            }
        }
        //calculons la somme pour chaques lignes de matrice
        for(int i = 0 ; i < L; i++){
            int somme = 0;
            for(int j = 0; j < C; j++){
                somme = somme + matrice[i][j];
            }
            System.out.println("la somme des elements de ligne "+(i+1)+"est : "+somme);
        }
    }
}
