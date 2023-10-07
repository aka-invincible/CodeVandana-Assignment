import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class romanToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String roman = sc.nextLine();
        Map<Character, Integer> romanNumerals = new HashMap<>();

        roman = roman.toUpperCase();

        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);

        int intValue = 0;
        int prevValue = 0;
        for (int i = roman.length() - 1; i >= 0; i--) {

            if (romanNumerals.get(roman.charAt(i)) == null) {
                System.out.println("Invalid roman number.");
                return;
            }

            int currValue = romanNumerals.get(roman.charAt(i));

            if (currValue < prevValue) {
                intValue -= currValue;
            } else {
                intValue += currValue;
            }
            prevValue = currValue;
        }
        System.out.println(intValue);
    }
}
