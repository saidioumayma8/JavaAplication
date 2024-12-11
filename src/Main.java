import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] arguments) {
        int operator, n1, n2;
        System.out.println("1- Add(+) \n2- Soustraction(-) \n3-Multiplication(*) \n4-Division(/) \n5-Puissance \n6-Racine carrée \n7-Factorielle");
        System.out.println("Chosse Operator: ");
        Scanner sc = new Scanner(System.in);
        operator = sc.nextInt();
        System.out.println("Entre first number : ");
        n1 = sc.nextInt();
        System.out.println("Entre second number : ");
        n2 = sc.nextInt();

        int result = 0;
        switch(operator){
            case 1:
                System.out.println("addition is " + Addition(n1,n2));
                break;
            case 2:
                System.out.println("Soustraction is " + Soustraction(n1,n2));
                break;
            case 3:
                result = n1 + n2;
                break;
            case 4:
                result = n1 * n2;
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
        }
    }
    static int Addition(int n1, int n2) {
        return n1 + n2;
    }
    static int Soustraction(int n1, int n2){
        return n1 - n2;
    }
}
