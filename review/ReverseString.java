public class ReverseString {


    public static String reverseUsingLoop(String s) {
        if (s == null) return null;
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }
}