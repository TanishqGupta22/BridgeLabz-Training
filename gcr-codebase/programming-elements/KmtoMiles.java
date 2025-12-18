import java.util.Scanner;
public class KmtoMiles{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        double km;
        km = input.nextDouble();
        double miles = km/ 1.6;
        System.out.println("The distance in miles is:"+ miles);
    }

}
