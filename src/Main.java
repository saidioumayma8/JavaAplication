import java.util.Scanner;
import java.lang.Math.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] arguments) {

        Scanner sc = new Scanner(System.in);
        int operator;

        do {
            System.out.println("1- Add(+) \n2- soustraction(-) \n3-Multiplication(*) \n4-Division(/) \n5-Puissance \n6-Racine carree \n7-Factorielle\n 8-quite");
            System.out.println("Chosse Operator: ");
            operator = sc.nextInt();
            int n1 = 0, n2 = 0;
            if (operator != 8) {
                System.out.println("Entrez le premier nombre : ");
                n1 = sc.nextInt();
                if (operator != 6 && operator != 7) {
                    System.out.println("Entrez le deuxieme nombre : ");
                    n2 = sc.nextInt();
                }
            }
            int result = 0;
            switch (operator) {
                case 1:
                    System.out.println("addition is " + Addition(n1, n2));
                    break;
                case 2:
                    System.out.println("Soustraction is " + Soustraction(n1, n2));
                    break;
                case 3:
                    System.out.println("Multiplication is " + Multiplication(n1, n2));
                    break;
                case 4:
                    while (n2 == 0) {
                        System.out.println("Erreur: Division par zero Veuillez entrer un autre nombre.");
                        System.out.print("Entrez le deuxieme nombre : ");
                        n2 = sc.nextInt();
                    }


                    System.out.println("Division is " + Division(n1, n2));

                    break;
                case 5:
                    System.out.println("puissance is " + puissance(n1, n2));
                    break;
                case 6:
                    System.out.println("Racine carree is " + Racinecarree(n1));
                    break;
                case 7:
                    System.out.println("Factorielle is " + Factorielle(n1));
                    break;
                case 8:
                    System.out.println(" au revoir");
                    break;
                default:
                    System.out.println("Operateur invalide !");
            }
        }while(operator != 8);
    }
    static int Addition(int n1, int n2) {
        return n1 + n2;
    }
    static int Soustraction(int n1, int n2){
        return n1 - n2;
    }
    static int Multiplication(int n1, int n2){
        return n1 * n2;
    }
    static int Division(int n1, int n2){
        return n1 / n2;
    }
    static int puissance(int n1, int n2){
        int result = 1;
        for (int i = 1; i <= n2; i++) {
            result *= n1;
        }
        return result;
    }
    static double Racinecarree(int n1){

        return Math.sqrt(n1);
    }
    static int Factorielle(int n1){
            int result=1;
            for(int i = 1;i <= n1 ;i++){
                result = result * i;
            }return result;
        }

}
