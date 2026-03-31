import java.util.Scanner;

public class WordLength2D {

    public static int findLength(String text) {
        int count = 0;
        while (true) {
            try {
                text.charAt(count);
                count++;
            } catch (Exception e) {
                return count;
            }
        }
    }

    public static String[] splitWords(String text) {
        int length = findLength(text);
        int wordCount = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ')
                wordCount++;
        }

        int[] indexArr = new int[wordCount + 1];
        int idx = 0;
        indexArr[idx++] = -1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ')
                indexArr[idx++] = i;
        }

        indexArr[idx] = length;

        String[] words = new String[wordCount];

        for (int i = 0; i < wordCount; i++) {
            String word = "";
            for (int j = indexArr[i] + 1; j < indexArr[i + 1]; j++) {
                word += text.charAt(j);
            }
            words[i] = word;
        }
        return words;
    }

    public static String[][] wordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            int len = findLength(words[i]);
            table[i][0] = words[i];
            table[i][1] = String.valueOf(len);
        }
        return table;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] table = wordLengthTable(words);

        System.out.println("Word\tLength");
        for (int i = 0; i < table.length; i++) {
            int length = Integer.parseInt(table[i][1]);
            System.out.println(table[i][0] + "\t" + length);
        }
    }
}
