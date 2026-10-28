import java.util.Scanner;
public class Factorielle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre un nombre entier nbr : ");
        int nbr = scanner.nextInt();
        int F = 1;
        for (int i = nbr; i >= 1; i--) {
            F = F*i;
        }
        System.out.println("Le Factoriel de : " +nbr+", est : " + F);

        if( nbr == 0) {
            System.out.println("Le factoriel, est : 1");
        }
    }
}