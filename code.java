import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] tableau = new int[5];


        System.out.println("Entrez 5 valeurs : ");
        for (int i = 0; i < 5; i++) {
            tableau[i] = scanner.nextInt();
        }


        int min = tableau[0];
        int max = tableau[0];


        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] < min) {
                min = tableau[i];
            }
            if (tableau[i] > max) {
                max = tableau[i];
            }
        }


        System.out.println("Le minimum est : " + min);
        System.out.println("Le maximum est : " + max);
    }
}