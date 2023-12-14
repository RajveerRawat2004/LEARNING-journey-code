import java.util.Scanner;
public class CWH_32_methodOverloading {
    static void foo ( ){
        System.out.println("good morning bro!");
    }
    static void foo ( int a){
        System.out.println("good morning "+a+" bro!");
    }
    static void foo ( int a, int b){
        System.out.println("good morning "+a+" bro!");
        System.out.println("good morning "+b+" bro!");
    }
    static void change2 (int[]arr){
        arr[0]= 5;
    }
    static void change (int a){
        a = 859;
    }
    static void tellJoke (){
        System.out.println("I can make time travel machine");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        tellJoke();
        // Case:1 -> changing the integer
//        int x = 45;
//        change(x);
//        System.out.println("value of x after after running change is "+ x);

        //Case:2 -> changing the array
//        int[] marks = {45,66,88,24,65,87};
//        change2(marks);
//        System.out.println("value of marks[0] after after running change2 is"+marks[0]);

        // method overloading
        foo();
        foo(500);
        foo(500,600);// arguments are actual
    }
}