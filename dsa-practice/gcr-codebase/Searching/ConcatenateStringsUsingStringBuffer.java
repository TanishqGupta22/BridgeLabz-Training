public class ConcatenateStringsUsingStringBuffer {
    public static void main(String[] args) {

        // Array of strings
        String[] words = {"Java", " ", "is", " ", "powerful"};

        // Create StringBuffer object
        StringBuffer sb = new StringBuffer();

        // Append each string to StringBuffer
        for (String word : words) {
            sb.append(word);
        }

        // Convert to String
        String result = sb.toString();

        System.out.println("Concatenated String: " + result);
    }
}
