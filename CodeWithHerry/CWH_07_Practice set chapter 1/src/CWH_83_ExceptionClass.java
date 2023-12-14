 import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return " I am toString";
    }
    @Override
    public String getMessage(){
        return " I am getMessage";
    }
}
class MaxAgeException extends Exception{
    @Override
    public String toString() {
        return " age can not more than 125 year";
    }
    @Override
    public String getMessage(){
        return " make sure you enter a valid age";
    }
}
public class CWH_83_ExceptionClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 125) {
            try {
//                throw new MyException();
                throw new MaxAgeException();
//                throw new ArithmeticException("this is an exception");
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
            }
        }
    }
}
