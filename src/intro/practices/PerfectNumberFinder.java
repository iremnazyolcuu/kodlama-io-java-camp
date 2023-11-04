package intro.practices;

public class PerfectNumberFinder {

    public static void main(String[] args) {

        int number = 28;

        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }

        if (total == number) {
            System.out.println("It is a perfect number!");
        } else {
            System.out.println("It is NOT a perfect number");
        }

    }
}
