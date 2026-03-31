import java.util.Scanner;
public class EqualPens{
    public static void main(String[] args){
        int totalPens = 14;
        int totalStudents = 3;
        int pensperstudent = totalPens / totalStudents;
        int remainingpens = totalPens%totalStudents;
        System.out.println("Each student gets" + pensperstudent + "pens");
        System.out.println("Remaining pens are" + remainingpens + "pens");

    }

}