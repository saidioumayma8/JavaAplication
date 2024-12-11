import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] arguments) {

        System.out.println("1- Add(+) \n2- soustraction(-) \n3-Multiplication(*) \n4-Division(/) \n5-Puissance \n6-Racine carrée \n7-Factorielle\n 8-quite");
        System.out.println("Chosse Operator: ");
        Scanner sc = new Scanner(System.in);
        int operator = sc.nextInt();
        int n1 = 0, n2 = 0;
        if (operator != 8) {
            System.out.println("Entrez le premier nombre : ");
            n1 = sc.nextInt();
            System.out.println("Entrez le deuxième nombre : ");
            n2 = sc.nextInt();
        }
        int result = 0;
        switch(operator){
            case 1:
                System.out.println("addition is " + Addition(n1,n2));
                break;
            case 2:
                System.out.println("Soustraction is " + Soustraction(n1,n2));
                break;
            case 3:
                System.out.println("Multiplication is " + Multiplication(n1,n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Division is " + Division(n1,n2));
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            case 5:
                result = n1 / n2;
                break;
            case 6:
                result = n1 + n2;
                break;
            case 7:
                result = n1 + n2;
                break;
            case 8:
                System.out.println(" au revoir");
                break;
            default:
                System.out.println("Opérateur invalide !");
        }
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
}
