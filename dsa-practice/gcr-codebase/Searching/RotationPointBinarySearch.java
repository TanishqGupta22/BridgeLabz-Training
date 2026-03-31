public class RotationPointBinarySearch {

    public static void main(String[] args) {

        int[] arr = {5, 6, 7, 1, 2, 3, 4};

        int index = findRotationPoint(arr);

        System.out.println("Index of smallest element (rotation point): " + index);
        System.out.println("Smallest element: " + arr[index]);
    }

    public static int findRotationPoint(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        // Binary search
        while (left < right) {

            int mid = (left + right) / 2;

            if (arr[mid] > arr[right]) {
                left = mid + 1;      // smallest is in right half
            } else {
                right = mid;        // smallest is in left half (including mid)
            }
        }

        // left == right → rotation point
        return left;
    }
}
