import java.util.Scanner;

public class GoldBachConjecture {

    // Function to check prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an even number greater than 2: ");
        int number = sc.nextInt();

        if (number <= 2 || number % 2 != 0) {
            System.out.println("Invalid input! Enter even number greater than 2.");
        } else {

            System.out.println("Goldbach pairs:");

            for (int i = 2; i <= number / 2; i++) {
                if (isPrime(i) && isPrime(number - i)) {
                    System.out.println(i + " + " + (number - i) + " = " + number);
                }
            }
        }

        sc.close();
    }
}
