import java.util.Scanner;

public class NumberConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Binary: " + toBinary(number));
        System.out.println("Hexadecimal: " + toHexadecimal(number));
    }

    public static String toBinary(int number) {
        StringBuilder binary = new StringBuilder();
        while (number > 0) {
            binary.insert(0, number % 2);
            number /= 2;
        }
        return binary.length() > 0 ? binary.toString() : "0";
    }

    public static String toHexadecimal(int number) {
        StringBuilder hexadecimal = new StringBuilder();
        char[] hexChars = "0123456789ABCDEF".toCharArray();
        while (number > 0) {
            hexadecimal.insert(0, hexChars[number % 16]);
            number /= 16;
        }
        return hexadecimal.length() > 0 ? hexadecimal.toString() : "0";
    }
}
