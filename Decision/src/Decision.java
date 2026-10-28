import java.util.Scanner;
public class Decision {
    public static void main(String[] args) {
        int moyenne;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrer la premier note note1 :" );
        int note1 = scanner.nextInt();

        System.out.print("Entrer la seconde note note2 :" );
        int note2 = scanner.nextInt();

        System.out.print("Entrer la troisieme note note3:" );
        int note3 = scanner.nextInt();

        moyenne = (note1 + note2 + note3) / 3;

        switch (moyenne){
            case 1, 2, 3, 4, 5, 6, 7, 8, 9:
                System.out.println("Non admis");
                break;
            case 10, 11:
                System.out.println("Passable");
                break;
            case 12, 13:
                System.out.println("Assez bien");
                break;
            case 14, 15:
                System.out.println("Bien");
                break;
            case 16, 17, 18, 19, 20:
                System.out.println(" Très bien");
                break;
            default:
                System.out.println("Error, Entre valide note");
        }
    }
}
