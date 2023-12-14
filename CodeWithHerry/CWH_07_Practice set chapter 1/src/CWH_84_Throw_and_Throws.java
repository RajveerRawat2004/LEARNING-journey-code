import java.util.Scanner;
class radiusNegativeException extends Exception{
    @Override
    public String toString() {
        return "radius can't be negative";
    }
    @Override
    public String getMessage(){
        return "radius can't be negative";
    }
}
public class CWH_84_Throw_and_Throws {
    public static double area (int r)throws radiusNegativeException{
        if (r < 0) {
            throw new radiusNegativeException();
        }
        double result = Math.PI*r*r;
        return result;
    }
    public static int divide (int a , int b) throws ArithmeticException{
        // made by harry
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // shivam uses harry's divide function
       try {
//           int c = divide(6,0);
//           System.out.println(c);
           double Area = area(6);
           System.out.println(Area);
       }
       catch (Exception e){
           System.out.println("Exception");
       }
    }
}
