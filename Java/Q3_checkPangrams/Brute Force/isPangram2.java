
import java.util.Scanner;

public class isPangram2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inpString = sc.nextLine();
        String cpy = inpString;
        inpString = inpString.toUpperCase();
        int[] alphabetCount = new int[26];

        for (int i = 0; i < inpString.length(); i++) {
            char ch = inpString.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                alphabetCount[ch - 'A']++;
            }
        }

        boolean isPangram = true;
        for (int count : alphabetCount) {
            if (count == 0) {
                isPangram = false;
                break;
            }
        }

        if (isPangram) {
            System.out.println("\'" + cpy + "\'" + " is a pangram.");
        } else {
            System.out.println("\'" + cpy + "\'" + " is not a pangram.");
        }
    }
}
