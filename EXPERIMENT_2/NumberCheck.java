import java.util.Scanner;

public class NumberCheck {

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean isArmstrong(int num) {
        int sum = 0, temp = num, digits = Integer.toString(num).length();
        while (temp > 0) {
            sum += Math.pow(temp % 10, digits);
            temp /= 10;
        }
        return sum == num;
    }

    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;
        for (int temp = number; temp > 0; temp /= 10) {
            sum += temp % 10;
        }

        System.out.println("Sum is: " + sum);
        System.out.println("Prime: " + (isPrime(sum) ? "Y" : "N"));
        System.out.println("Armstrong: " + (isArmstrong(sum) ? "Y" : "N"));
        System.out.println("Perfect: " + (isPerfect(sum) ? "Y" : "N"));

        sc.close();
    }
}
