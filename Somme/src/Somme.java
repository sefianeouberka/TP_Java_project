import java.util.Scanner;
public class Somme {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrer un nombre entier nbr : ");
        int nbr = scanner.nextInt();

        int S = 0;
        int s = 0;
        System.out.println("------------La somme avec la boucle for------------");
        for(int i = 1; i <= nbr; i++ ){
            S = S + i ;
        }
        System.out.println("La somme de 1 jusqu'a "+nbr+" est : " + S);

        System.out.println("------------La somme avec la boucle while------------");
        int a = 1;
        while (a <= nbr){
            s = s + a ;
            a++;
        }
        System.out.println("La somme de 1 jusqu'a "+nbr+" est : " + s);
    }
}
