import java.util.Scanner;
public class Maximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrer le premier nombre nbr1 : ");
        int nbr1 = scanner.nextInt();

        System.out.print("Entrer le seconde nombre nbr2 : ");
        int nbr2 = scanner.nextInt();

        if(nbr1 > nbr2) {
            System.out.println("le maximum est : " + nbr1);

        } else if (nbr1 < nbr2) {
            System.out.println("le maximum est : " + nbr2);
        }
        else
            System.out.println("les deux nombre " + nbr1 + " et " + nbr2 + " sont egaux");
    }
}
