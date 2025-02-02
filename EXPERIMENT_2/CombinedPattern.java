import java.util.Scanner;

public class CombinedPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of levels: ");
        int levels = scanner.nextInt();

        // Print character pattern
        System.out.println("Character Pattern:");
        for (int i = 0; i < levels; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + j) + " ");
            }
            System.out.println();
        }

        // Print centered star pattern
        System.out.println("\nCentered Star Pattern:");
        for (int i = 0; i < levels; i++) {
            for (int j = 0; j < levels - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
