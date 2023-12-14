import java.util.Scanner;
class calculatorExceptions extends Exception{
    @Override
    public String toString() {
        return "error";
    }
    @Override
    public String getMessage() {
        return "error";
    }
    public void invalidInputException(){

    }
}
class spicyCalculator {
    double add (double a, double b){
        return a+b;
    }
    double subtract (double a, double b){
        return a-b;
    }
    double multiply (double a, double b){
        return a*b;
    }
    double divide (double a, double b){
        return a/b;
    }
}
public class CWH_87_Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        spicyCalculator sp = new spicyCalculator();

    }
}
