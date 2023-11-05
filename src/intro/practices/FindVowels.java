package intro.practices;

public class FindVowels {

    public static void main(String[] args) {

        char letter = 'A';

        switch (letter) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("It is a broad vowel.");
                break;
            case 'E':
            case 'İ':
            case 'Ü':
            case 'Ö':
                System.out.println("It is a front vowel.");
                break;
            default:
                System.out.println("Please enter a valid vowel!");
        }

    }
}
