import java.util.Arrays;

public class BruteForceGenerator {
    public static void main(String[] args) {
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        int maxLength = 4;
        

        generateStrings(characters, maxLength);
    }

    public static void generateStrings(String characters, int maxLength) {
        char[] currentString = new char[maxLength];

        Arrays.fill(currentString, characters.charAt(0));

        while (true) {
            System.out.println(String.valueOf(currentString));

            int index = maxLength - 1;
            while (index >= 0 && currentString[index] == characters.charAt(characters.length() - 1)) {
                currentString[index] = characters.charAt(0);
                index--;
            }

            if (index < 0) {
                break;
            }

            currentString[index] = characters.charAt(characters.indexOf(currentString[index]) + 1);
        }
    }
}