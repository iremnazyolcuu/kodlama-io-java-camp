package intro;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        String firstText = "Java programming";
        System.out.println(firstText);

        int intNum = 12;

        double doubleRate = 18.20;
        double doubleRate2 = 18.25;

        boolean isJavaFun = true;

        String show = "";

        if (doubleRate2 < doubleRate) {
            show = "down.svg";
            System.out.println(show);
        } else if (doubleRate2 > doubleRate) {
            show = "up.svg";
            System.out.println(show);
        } else {
            show = "equal.svg";
            System.out.println(show);
        }

        String[] arr = {"Java", "Python", "React"};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
