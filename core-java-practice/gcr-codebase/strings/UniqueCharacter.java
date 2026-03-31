import java.util.Scanner;

public class UniqueCharacters {

    public static int findLength(String text) {
        int i = 0;
        while (true) {
            try {
                text.charAt(i);
                i++;
            } catch (Exception e) {
                return i;
            }
        }
    }

    public static char[] uniqueCharacters(String text) {
        int len = findLength(text);
        char[] temp = new char[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            boolean found = false;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                temp[index++] = ch;
            }
        }

        char[] result = new char[index];
        for (int i = 0; i < index; i++)
            result[i] = temp[i];

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        char[] unique = uniqueCharacters(text);

        for (char c : unique)
            System.out.print(c + " ");
    }
}
