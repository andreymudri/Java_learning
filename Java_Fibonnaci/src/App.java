public class App {
    public static void main(String[] args) {
        int x = 10;
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.println("Sequência de Fibonacci de tamanho " + x + ":");
        for (int i = 0; i < x; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
