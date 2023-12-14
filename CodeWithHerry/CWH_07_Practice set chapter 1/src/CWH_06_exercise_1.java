import java.util.Scanner;
public class CWH_06_exercise_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("maximum marks of a subject");
        int MaxMarks = sc.nextInt();
        int totalMaxMarks = MaxMarks*5;
        System.out.println("obtained marks");
        System.out.println("english");
        int english = sc.nextInt();
        System.out.println("hindi");
        int hindi = sc.nextInt();
        System.out.println("social science");
        int social_science = sc.nextInt();
        System.out.println("science");
        int science = sc.nextInt();
        System.out.println("mathematics");
        int mathematics = sc.nextInt();
        System.out.println("english");
        int sum = english+hindi+social_science+science+mathematics;
        int multiply = sum*MaxMarks;
        int divide = multiply/totalMaxMarks;
        System.out.println("percentage ="+ divide +"%");
//        int a= 10;
//        int b= 2;                                 // divide learn.
//        int divide = a/b;
//        System.out.println(divide);
    }
}