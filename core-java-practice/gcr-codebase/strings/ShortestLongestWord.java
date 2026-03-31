import java.util.Scanner;

public class ShortestLongestWord {

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

        int[] indexes = new int[wordCount + 1];
        int idx = 0;
        indexes[idx++] = -1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ')
                indexes[idx++] = i;
        }

        indexes[idx] = length;

        String[] words = new String[wordCount];

        for (int i = 0; i < wordCount; i++) {
            String word = "";
            for (int j = indexes[i] + 1; j < indexes[i + 1]; j++) {
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

    public static int[] findShortestLongest(String[][] table) {
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < table.length; i++) {
            int len = Integer.parseInt(table[i][1]);
            int minLen = Integer.parseInt(table[minIndex][1]);
            int maxLen = Integer.parseInt(table[maxIndex][1]);

            if (len < minLen)
                minIndex = i;
            if (len > maxLen)
                maxIndex = i;
        }
        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] table = wordLengthTable(words);
        int[] result = findShortestLongest(table);

        System.out.println("Shortest Word: " + table[result[0]][0]);
        System.out.println("Longest Word: " + table[result[1]][0]);
    }
}
