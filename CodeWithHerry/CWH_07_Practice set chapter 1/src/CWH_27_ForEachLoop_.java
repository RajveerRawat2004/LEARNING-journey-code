import java.util.Scanner;

public class CWH_27_ForEachLoop_ {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        //array length ---> arrayName.length

        int [] marks = {92, 55, 66, 59, 59};
//        float [] marks = {92.2f, 55.4f, 66.6f, 59.8f, 59};
//        System.out.println(marks.length);
//        System.out.println(marks[0]);
//        String [] students = {"raja","rajveer","kapil"};
//        System.out.println(students.length);
//        System.out.println(students[0]);

        //displaying an array (naive way)
//        System.out.println("printing in a naive way");
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);

        //displaying an array (for loop)        // array traversal
//        System.out.println("printing using for loop");
//        for(int i = 0; i<=marks.length; i++){
//            System.out.println(marks[i]);
//        }

        // Quick Quiz : displaying the array in Reverse order (for loop)
//        System.out.println("printing using for loop in reverse order");
//        for(int i = marks.length-1; i>=0; i--){
//            System.out.println(marks[i]);
//        }

        // displaying an array (for_Each loop)
        System.out.println("printing using for-each loop");
        for(int element : marks){
            System.out.println(element);
        }
    }
}
