import java.util.Scanner;
public class Signe {
    public static void main( String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre un nombre nbr : ");
        int nbr = scanner.nextInt();

        if(nbr > 0 ) {
            System.out.println("le nombre " + nbr + " est prositive");
        } else if (nbr < 0) {
            System.out.println("le nombre " + nbr + " est negative");
        }
        else
            System.out.println("le nombre " + nbr + " est nulle");

        if(nbr % 2 == 0) {
            System.out.println("De plus, il est pair.");
        }
        else {
            System.out.println("De plus, il est impair.");
        }

        scanner.close();
    }
}
