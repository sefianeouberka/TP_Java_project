import java.util.Scanner;
public class Somme_deux_Matrice {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[][] matrice1;
        int[][] matrice2;

        System.out.println("Entrer les lignes de votre matrice L = " );
        int L = scanner.nextInt();
        System.out.println("Entrer les colomns de votre matrice C = " );
        int C = scanner.nextInt();

        matrice1 = new int[L][C];
        matrice2 = new int[L][C];

        System.out.println("--------Remplir la matrice1--------");
        for(int i = 0; i < L ;i++){
            for(int j = 0; j < C;j++){
                System.out.print("matrice1[ "+i+" ]"+"[ "+j+" ] = " );
                matrice1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("--------Remplir la matrice2--------");
        for(int i = 0; i < L ;i++){
            for(int j = 0; j < C;j++){
                System.out.print("matrice2[ "+i+" ]"+"[ "+j+" ] = " );
                matrice2[i][j] = scanner.nextInt();
            }
        }
        //initialise une matrice vide
        int[][] somme_matrice = new int[L][C];
        for(int i = 0; i < L ;i++){
            for(int j = 0; j < C;j++){
                somme_matrice[i][j] = 0;
            }
        }

        // la somme des deux matrices matrice1 et matrice2
        for(int i = 0; i < L ;i++){
            for(int j = 0; j < C;j++){
                somme_matrice[i][j] = matrice1[i][j] + matrice2[i][j];
            }
        }
        //Affichage de somme
        for(int i = 0; i < L ;i++){
            for(int j = 0; j < C;j++){
                System.out.println("somme_matrice[ "+i+" ]"+"[ "+j+" ] = " + somme_matrice[i][j]);
            }
        }
    }
}
