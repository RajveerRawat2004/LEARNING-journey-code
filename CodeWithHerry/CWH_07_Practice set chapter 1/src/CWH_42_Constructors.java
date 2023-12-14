import java.util.Scanner;
class MyMainEmployee{
    private int id;
    private String name ;
    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }
    public void setName ( String n){
        this.name = n;
    }
    public String getName() {
        return name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
}
// Quick Quiz
class Employee2{
    private int salary;
    public Employee2(){salary= 000;}
    public Employee2(int mySalary){
        salary= mySalary;
    }
    public void setSalary(int yourSalary){
        salary= yourSalary;
    }
    public int getSalary(){return salary;}
}
public class CWH_42_Constructors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyMainEmployee harry = new MyMainEmployee("CodeWithHarry",40);
        MyMainEmployee rajveer = new MyMainEmployee("RajveerRawat",19);
//        harry.setId(23);
//        harry.getId();
//        harry.setName("CodeWithHarry");
//        harry.getName();

        // constructor
//        System.out.println(harry.getId());
//        System.out.println(harry.getName());
//        System.out.println(rajveer.getId());
//        System.out.println(rajveer.getName());

        // Quick Quiz
        Employee2 harry1 = new Employee2();
        Employee2 harry2 = new Employee2(10000);
        System.out.println(harry1.getSalary());
        System.out.println(harry2.getSalary());
    }
}
