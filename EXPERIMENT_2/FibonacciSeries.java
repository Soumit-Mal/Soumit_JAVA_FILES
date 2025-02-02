import java.util.Scanner;

public class FibonacciSeries {
    // Recursive method
    public static int fibRec(int n) {
        if (n <= 1) return n;
        return fibRec(n - 1) + fibRec(n - 2);
    }

    // Iterative method
    public static void fibIter(int n) {
        int a = 0, b = 1;
        System.out.print(a + " " + b);
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int terms = sc.nextInt();

        // Print Fibonacci series using recursive method
        System.out.print("Fibonacci series (recursive): ");
        for (int i = 0; i < terms; i++) {
            System.out.print(fibRec(i) + " ");
        }
        System.out.println();

        // Print Fibonacci series using iterative method
        System.out.print("Fibonacci series (iterative): ");
        fibIter(terms);
        System.out.println();

        sc.close();
    }
}
