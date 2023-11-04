package intro;

public class Strings {

    public static void main(String[] args) {

        String msg = "Weather is great today!";

        System.out.println("Length is: " + msg.length());
        System.out.println("5th element is: " + msg.charAt(4));
        System.out.println(msg.concat(" It is sunny."));
        System.out.println(msg.startsWith("A"));
        System.out.println(msg.endsWith("!"));

        char[] letters = new char[5];
        msg.getChars(0, 5, letters, 0);
        System.out.println(letters);

        System.out.println(msg.indexOf("a"));
        System.out.println(msg.lastIndexOf("a"));

        System.out.println(msg.replace(" ", "--"));

        System.out.println(msg.substring(2, 6));

        for (String newMsg : msg.split(" ")) {
            System.out.println(newMsg);
        }

        System.out.println(msg.toLowerCase());
        System.out.println(msg.toUpperCase());



    }
}
