import java.util.Scanner;

public class CWH_79_JErrorsWithExample {
    public static void main(String[] args) {
        // Syntax Errors
//        int a = 3                   // Error - semicolon
//        b = 3;                     // Error - not define data type
//        System.out.println(a+b);  // Error - not define a,b

        // Logical Error
//        for(int i = 0;i<10;i++){
//            System.out.println(2*i+1);
//        }

        // Run time error / Exception
        int a =345;
        Scanner sc = new Scanner(System.in);
        int b =  sc.nextInt();
        int c = a/b;
        System.out.println(c);

    }
}