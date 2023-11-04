package intro;

public class ArraysRecap {

    public static void main(String[] args) {

        double[] arr = {1.2, 1.3, 4.7, 5.6};

        double total = 0;
        double max = arr[0];
        for (double num : arr) {
            if (max < num) {
                max = num;
            }
            total = total + num;
            System.out.println(num);
        }

        System.out.println("Total: " + total);
        System.out.println("Max value: " + max);

    }
}
