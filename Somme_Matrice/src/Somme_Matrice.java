import java.util.Scanner;
public class Somme_Matrice {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[][] matrice;
        System.out.println("entres les lignes de votres matrice L = ");
        int L = scanner.nextInt();
        System.out.println("entres les Colomns de votres matrice C = ");
        int C = scanner.nextInt();

        matrice = new int[L][C];
        //remplire la matrice
        System.out.println("----remplire votre matrice----");
        for(int i = 0; i < L; i++){
            for(int j = 0; j < C; j++){
                System.out.print("matrice[ "+i+" ][ "+j+" ] = ");
                matrice[i][j] = scanner.nextInt();
            }
        }
        //calculer la somme des elements de la matrice
        int somme = 0;
        for(int i = 0; i < L; i++){
            for(int j = 0; j < C; j++){
                somme = somme + matrice[i][j];
            }
        }
        System.out.print("la somme des elemts de votre matrice est : "+somme);
    }
}
