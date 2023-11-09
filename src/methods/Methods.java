package methods;

public class Methods {

    public static void main(String[] args) {

        String msg = "Hello world Java";

        String newMsg = generateCity();
        System.out.println(newMsg);

        int result = sum(15, 7);
        System.out.println(result);

        int advancedResult = advancedSum(2, 4, 6, 8, 10);
        System.out.println(advancedResult);

    }

    public static void add() {
        System.out.println("Has been added");
    }

    public static void delete() {
        System.out.println("Has been deleted");
    }

    public static void update() {
        System.out.println("Has been updated");
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    // variable arguments
    public static int advancedSum(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static String generateCity() {
        return "Istanbul";
    }

}
