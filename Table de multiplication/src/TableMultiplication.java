import java.util.Scanner;
public class TableMultiplication {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrer un nombre nbr entier : ");
        int nbr = scanner.nextInt();

        for(int i = 0; i <= 10; i++){
            System.out.println(nbr + " * " + i + " = " + nbr*i);
        }
    }

}
