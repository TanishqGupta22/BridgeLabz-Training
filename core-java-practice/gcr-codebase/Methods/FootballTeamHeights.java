import java.util.Random;

public class FootballTeamHeights {

    static int sum(int[] heights) {
        int sum = 0;
        for (int h : heights)
            sum += h;
        return sum;
    }

    static double mean(int[] heights) {
        return (double) sum(heights) / heights.length;
    }

    static int shortest(int[] heights) {
        int min = heights[0];
        for (int h : heights)
            if (h < min) min = h;
        return min;
    }

    static int tallest(int[] heights) {
        int max = heights[0];
        for (int h : heights)
            if (h > max) max = h;
        return max;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random r = new Random();

        for (int i = 0; i < heights.length; i++)
            heights[i] = r.nextInt(101) + 150;

        System.out.print("Heights: ");
        for (int h : heights)
            System.out.print(h + " ");

        System.out.println("\nShortest Height: " + shortest(heights));
        System.out.println("Tallest Height: " + tallest(heights));
        System.out.println("Mean Height: " + mean(heights));
    }
}
