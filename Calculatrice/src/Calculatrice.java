import java.util.Scanner;
public class Calculatrice {
    public static void main(String[] args) {
        char operation;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrer un opérateur : ");
        operation = scanner.next().charAt(0);

        System.out.print("Entrer le premier nombre nbr1 :");
        double nbr1 = scanner.nextDouble();

        System.out.print("Entrer le seconde nombre nbr2 :");
        double nbr2 = scanner.nextDouble();

        switch (operation) {
            case '+' :
                System.out.println(nbr1 + nbr2 );
                break;
            case '-' :
                System.out.println(nbr1 - nbr2 );
                break;
            case '*' :
                System.out.println(nbr1 * nbr2 );
                break;
            case '/' :
                System.out.println(nbr1 / nbr2 );
                break;
            default:
                System.out.println("Entrer valide nombre");
        }
    }
}
