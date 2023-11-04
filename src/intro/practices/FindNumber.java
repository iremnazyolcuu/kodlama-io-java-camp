package intro.practices;

public class FindNumber {

    public static void main(String[] args) {

        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};
        int findNum = 5;
        boolean isThere = false;

        for (int num : numbers) {
            if (num == findNum) {
                isThere = true;
                break;
            }
        }
        if (isThere) {
            System.out.println("The number exists!");
        } else {
            System.out.println("The number does NOT exist!");
        }

    }
}
