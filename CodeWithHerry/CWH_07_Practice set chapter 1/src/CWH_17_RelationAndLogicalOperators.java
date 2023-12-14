import java.util.Scanner;
public class CWH_17_RelationAndLogicalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // relational character ---> < , > ,== , <=, >= , != ,
//        System.out.println("What is your age");
//        int age = sc.nextInt();
//        boolean cond1 = age>=18;
//        boolean cond2 = age<=18;
//        if (cond1) {
//            System.out.println("you are an adult");
//        } else if (cond2) {
//            System.out.println("you are not an adult");
//        }
//        else {
//            System.out.println("invalid age");
//        }
//        if(age!=18){
//            System.out.println("you are a minor");
//        }else if(age>18){
//            System.out.println("you might be young or old");
//        }else {
//            System.out.println("not sure");
//        }

        //logical Operators
        boolean a = true;
        boolean b = false;
        System.out.println("For logical AND");
        if (a && b){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

        System.out.println("For logical OR");
        if (a || b) {
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

        System.out.println("For logical NOT");
        System.out.println( !a );
        System.out.println( !b );
    }
}