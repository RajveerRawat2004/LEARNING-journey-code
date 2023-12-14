import java.util.Scanner;
class Employee1{
    int id ;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My id is "+ id);
        System.out.println("and my name is "+ name);
    }
    public int getSalary(){
        return salary;
    }
}
public class CWH_38_custom_Class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is our first custom class");
        Employee1 harry = new Employee1();// instantiating a new Employee object
        Employee1 john = new Employee1();

        // setting attribute for harry and john
        harry.id = 12;
        john.id = 15;
        harry.name = "codeWithHarry";
        john.name = "john khandelwal";
        harry.salary= 34;
        john.salary= 12;

        harry.printDetails();
        john.printDetails();

        //printing attributes
//        System.out.println(harry.id);
//        System.out.println(harry.name);
    }
}
