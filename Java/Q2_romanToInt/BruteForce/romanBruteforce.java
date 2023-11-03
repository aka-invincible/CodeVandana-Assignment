import java.util.Scanner;

public class romanBruteforce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String roman = sc.nextLine();
        roman = roman.toUpperCase();

        int intValue = 0;
        int prevValue = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            char currentChar = roman.charAt(i);
            int currValue = 0;

            switch (currentChar) {
                case 'I':
                    currValue = 1;
                    break;
                case 'V':
                    currValue = 5;
                    break;
                case 'X':
                    currValue = 10;
                    break;
                case 'L':
                    currValue = 50;
                    break;
                case 'C':
                    currValue = 100;
                    break;
                case 'D':
                    currValue = 500;
                    break;
                case 'M':
                    currValue = 1000;
                    break;
                default:
                    System.out.println("Invalid roman number.");
                    return;
            }

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
