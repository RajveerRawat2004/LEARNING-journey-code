import java.util.Scanner;// importing the Scanner class
public class CWH_05_TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);//creating an object named "sc" of the Scanner class.
        // || here System.in used for reading input from the keyboard
        System.out.println("taking input from the user");
//        System.out.println("enter number 1st");
////        int a = sc.nextInt();
//        float a = sc.nextFloat();
//        System.out.println("enter number 2nd");
////        int b = sc.nextInt();
//        float b = sc.nextFloat();
////        int sum = a+b;
//        float sum = a+b;
//        System.out.println("sum of two numbers = ");
//        System.out.println(sum);
//        boolean b1 = sc.hasNextInt();
//        System.out.println(b1);
        String str = sc.nextLine();
        System.out.println(str);
    }
}
