public class Affichage {
    public static void main(String[] args){
        // affichage le nombre de 1 a 100 avec boucle for

        System.out.println("-------affichage le nombre de 1 a 100 avec boucle for-------");
        for (int i = 1; i <= 100; i++ ){
            System.out.println(i);
        }

        // affichage le nombre de 1 a 100 avec boucle while
        System.out.println("-------affichage le nombre de 1 a 100 avec boucle while-------");
        int a = 0;
        while (a < 100){
            System.out.println(a+1);
            a++;
        }

        // affichage le nombre de 1 a 100 avec boucle do-while
        System.out.println("-------affichage le nombre de 1 a 100 avec boucle do-while-------");
        int b = 0;
        do {
            System.out.println(b + 1);
            b++;
        }while (b < 100);
    }
}
