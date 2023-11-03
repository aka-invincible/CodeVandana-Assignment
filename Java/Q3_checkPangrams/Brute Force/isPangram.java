import java.util.Scanner;

public class isPangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inpString = sc.nextLine();
        String cpy = inpString;
        inpString = inpString.toUpperCase();
        boolean[] alphabetCheck = new boolean[26]; // An array to keep track of the presence of each letter

        for (int i = 0; i < inpString.length(); i++) {
            char ch = inpString.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                int index = ch - 'A'; // Convert the character to an index (0-25)
                alphabetCheck[index] = true; // Mark the letter as present
            }
        }

        boolean isPangram = true;
        for (boolean present : alphabetCheck) {
            if (!present) {
                isPangram = false;
                break;
            }
        }

        if (isPangram) {
            System.out.println("'" + cpy + "' is a pangram.");
        } else {
            System.out.println("'" + cpy + "' is not a pangram.");
        }
    }
}
