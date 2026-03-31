public class FirstMissingPositive {

    public static void main(String[] args) {

        int[] arr = {3, 4, -1, 1};

        int missing = findFirstMissingPositive(arr);
        System.out.println("First Missing Positive: " + missing);
    }

    public static int findFirstMissingPositive(int[] arr) {

        int n = arr.length;
        boolean[] visited = new boolean[n + 1];

        // Mark visited positives
        for (int num : arr) {
            if (num > 0 && num <= n) {
                visited[num] = true;
            }
        }

        // Find first missing
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                return i;
            }
        }

        return n + 1;
    }
}
