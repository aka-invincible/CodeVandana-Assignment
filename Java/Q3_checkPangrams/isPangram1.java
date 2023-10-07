import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

// In this case It is considered that pangram can be made of alphabets
// numbers and other symbols.
// Ex- abcdefghijklmnopqrstuvwxyz1 is a pangram.
// Ex- abcdefghijklmnopqrstuvwxyz1$ is a pangram.

public class isPangram1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inpString = sc.nextLine();
        String cpy = inpString;
        inpString = inpString.toUpperCase();
        Set<Character> alphabets = new HashSet<>();
        for (int i = 0; i < inpString.length(); i++) {
            char ch = inpString.charAt(i);
            if (ch < 'A' || ch > 'Z')
                continue;
            alphabets.add(inpString.charAt(i));
        }
        if (alphabets.size() == 26) {
            System.out.println("\'" + cpy + "\'" + " is a pangram.");
            return;
        }
        System.out.println("\'" + cpy + "\'" + " is not a pangram.");
    }
}
