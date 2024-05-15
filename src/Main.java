//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n = 10; // Número de términos de Fibonacci a calcular

        System.out.println("Serie de Fibonacci (Iterativa):");
        for (int i = 0; i < n; i++) {
            int fibonacci = calcularFibonacciIterativo(i);
            System.out.print(fibonacci + " ");
        }

        System.out.println();

        System.out.println("Serie de Fibonacci (Recursiva):");
        for (int i = 0; i < n; i++) {
            int fibonacci = calcularFibonacciRecursivo(i);
            System.out.print(fibonacci + " ");
        }

        System.out.println();
    }

    public static int calcularFibonacciIterativo(int n) {
        if (n <= 1) {
            return n;
        }

        int fibNMinus2 = 0;
        int fibNMinus1 = 1;
        int fibonacci = 0;

        for (int i = 2; i <= n; i++) {
            fibonacci = fibNMinus2 + fibNMinus1;
            fibNMinus2 = fibNMinus1;
            fibNMinus1 = fibonacci;
        }

        return fibonacci;
    }

    public static int calcularFibonacciRecursivo(int n) {
        if (n <= 1) {
            return n;
        }

        return calcularFibonacciRecursivo(n - 1) + calcularFibonacciRecursivo(n - 2);
    }
}