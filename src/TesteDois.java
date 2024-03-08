public class TesteDois {
    public static void main(String[] args) {
        int n = 8; // Altere o valor de 'n' para obter os primeiros 'n' números da sequência de Fibonacci

        System.out.println("Sequência de Fibonacci dos primeiros " + n + " números:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        if (isFibonacci(n)) {
            System.out.println("\nO número " + n + " faz parte da sequência de Fibonacci.");
        } else {
            System.out.println("\nO número " + n + " não faz parte da sequência de Fibonacci.");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static boolean isFibonacci(int n) {
        int a = 0, b = 1, c;
        if (n == 0 || n == 1) {
            return true;
        }
        while (true) {
            c = a + b;
            if (c == n) {
                return true;
            } else if (c > n) {
                return false;
            }
            a = b;
            b = c;
        }
    }
}
