import java.util.Scanner;
public class Remplir_Matrice {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[][] matrice = new int[3][4];
        System.out.println("----Rempir la matrice----");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.print("matrice[ "+i+" ]"+"[ "+j+" ] = ");
                matrice[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Votre matrice est : ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++) {
                System.out.print("matrice[ "+i+" ]"+"[ "+j+" ] = " + matrice[i][j]);
            }
        }

    }
}
