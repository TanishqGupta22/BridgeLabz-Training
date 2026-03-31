import java.util.Scanner;

public class FrequencyUsingUnique {

    public static char[] uniqueCharacters(String text) {
        char[] temp = new char[text.length()];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean found = false;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    found = true;
                    break;
                }
            }

            if (!found)
                temp[index++] = ch;
        }

        char[] result = new char[index];
        for (int i = 0; i < index; i++)
            result[i] = temp[i];

        return result;
    }

    public static String[][] frequency(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++)
            freq[text.charAt(i)]++;

        char[] unique = uniqueCharacters(text);
        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String[][] result = frequency(text);

        for (int i = 0; i < result.length; i++)
            System.out.println(result[i][0] + " : " + result[i][1]);
    }
}
