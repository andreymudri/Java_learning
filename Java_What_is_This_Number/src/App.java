import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int number = sc.nextInt();
        sc.close();
        if (number == 0) {
            System.out.println("O número é zero.");
        }
        String parity = (number % 2 == 0) ? "par" : "ímpar";
        String positivity = (number > 0) ? "positivo" : "negativo";

        System.out.println("O número é " + parity + " e " + positivity + ".");
    }
}
