import java.util.Scanner;
public class Arithmetique {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Entrer le premier nombre nbr1 : ");
    double nbr1 = scanner.nextDouble();

    System.out.print("Entrer le second nombre  nbr2 : ");
    double nbr2 = scanner.nextDouble();

    System.out.println(nbr1+ " + " +nbr2+ " = " + (nbr1+nbr2));
    System.out.println(nbr1+ " * " +nbr2+ " = " + (nbr1*nbr2));
    System.out.println(nbr1+ " - " +nbr2+ " = " + (nbr1-nbr2));
    System.out.println(nbr1+ " / " +nbr2+ " = " + (nbr1/nbr2));
    System.out.println(nbr1+ " % " +nbr2+ " = " + (nbr1%nbr2));

    }
}
