import java.util.Scanner;

public class YoungestTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amarAge = sc.nextInt();
        int akbarAge = sc.nextInt();
        int anthonyAge = sc.nextInt();

        int amarHeight = sc.nextInt();
        int akbarHeight = sc.nextInt();
        int anthonyHeight = sc.nextInt();

        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        int tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));

        if (youngestAge == amarAge)
            System.out.println("Amar is the youngest");
        else if (youngestAge == akbarAge)
            System.out.println("Akbar is the youngest");
        else
            System.out.println("Anthony is the youngest");

        if (tallestHeight == amarHeight)
            System.out.println("Amar is the tallest");
        else if (tallestHeight == akbarHeight)
            System.out.println("Akbar is the tallest");
        else
            System.out.println("Anthony is the tallest");
    }
}