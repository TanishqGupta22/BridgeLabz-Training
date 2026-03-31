import java.util.Scanner;

public class StringCompareCharAt {
    public static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        boolean result1 = compareUsingCharAt(str1, str2);
        boolean result2 = str1.equals(str2);

        System.out.println("Using charAt(): " + result1);
        System.out.println("Using equals(): " + result2);
        System.out.println("Results same? " + (result1 == result2));
    }
}
