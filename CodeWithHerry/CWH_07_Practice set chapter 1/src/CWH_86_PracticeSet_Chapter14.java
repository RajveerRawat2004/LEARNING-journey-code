import java.util.Scanner;
class Custom_exception extends Exception{
    @Override
    public String toString() {
        return " custom error";
    }
    @Override
    public String getMessage (){
        return " custom error ";
    }
}
public class CWH_86_PracticeSet_Chapter14 {
    public static void method_to_custom_exception ()throws Custom_exception{
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int [] marks = new int [5];
        marks [0] = 7;
        marks [1] = 56;
        marks [2] = 6;
        int i = 1 ;
        int index;
        while ( flag && i<5){
            try {
                System.out.println("enter the index number");
                index = sc.nextInt();
                System.out.println("the value of marks[index] is "+ marks[index]);
                break;
            }
            catch ( Exception e){
                e.toString();
                System.out.println("invalid index");
                i++;
            }
        }
        if (i == 5) {
//            System.out.println("Error");
            throw new Custom_exception();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Question 1
//        int age = 72            // Syntax error
//        int yearBorn = 2000-72; // Logical error
//        System.out.println(6/0); // Runtime error

        // Question 2
//        try {
//            System.out.println(666/0);
//        }
//        catch ( ArithmeticException e){
//            System.out.println("ha ha ha ha ha ha ha ");
//        }
//        catch (IllegalArgumentException e){
//            System.out.println("he he  he he he he he he");
//        }

        // Question 5
        try {
            method_to_custom_exception();
        } catch (Custom_exception e) {
            System.out.println(e.toString());
        }
    }
}
