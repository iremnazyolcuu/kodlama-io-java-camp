package intro.practices;

public class PrimeNumberChecker {

    public static void main(String[] args) {

        int number = 25;

        boolean isPrime = true;

        if (number == 1) {
            System.out.println("It is NOT a prime number");
            return;
        }

        if (number < 1) {
            System.out.println("Invalid value!");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println("It is a prime number.");
        } else {
            System.out.println("It is NOT a prime number.");
        }

    }
}
