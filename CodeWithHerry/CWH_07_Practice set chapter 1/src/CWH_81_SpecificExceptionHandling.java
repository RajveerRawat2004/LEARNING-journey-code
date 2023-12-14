import java.util.Scanner;
public class CWH_81_SpecificExceptionHandling {
    public static void main(String[] args) {
        int [] marks = new int [5];
        marks [0] = 7;
        marks [1] = 56;
        marks [2] = 6;
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the array index");
        int index = sc.nextInt();
        System.out.println(" enter the number you want to divide the value with ");
        int number = sc.nextInt();
        try {
            System.out.println("the value at array index is : "+ marks[index]);
            System.out.println("the value of array-value/number is : "+marks[index]/number);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException exception occur !");
        }
        catch (ArithmeticException e ){
            System.out.println(" arithmetic exception occur !");
        }
        catch (Exception e ){
            System.out.println(" some other exception occur !");
            System.out.println(e);
        }
    }
}