package intro;

public class Arrays {

    public static void main(String[] args) {

        String[] students = new String[4];
        students[0] = "Bruce";
        students[1] = "Selina";
        students[2] = "Clark";
        students[3] = "Diana";

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

    }
}
