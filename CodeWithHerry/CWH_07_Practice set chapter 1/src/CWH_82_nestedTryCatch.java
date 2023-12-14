import java.util.Scanner;

public class CWH_82_nestedTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] marks = new int [5];
        marks [0] = 7;
        marks [1] = 56;
        marks [2] = 6;
//        System.out.println("enter the value of array index");
//        int index = sc.nextInt();
//        try {
//            System.out.println("Welcome to video no. 82");
//            try {
//                System.out.println(marks[index]);
//            }
//            catch (ArrayIndexOutOfBoundsException e){
//                System.out.println("sorry this index does not exit");
//                System.out.println("exception in level 2");
//            }
//        }
//        catch (Exception e){
//            System.out.println("exception in level 1");
//        }

        // Quick Quiz
        boolean flag = true;
        while (flag){
            System.out.println("enter the value of array index");
            int index = sc.nextInt();
            try {
                System.out.println("Welcome to video no. 82");
                try {
                    System.out.println(marks[index]);
                    flag = false;
                }
                catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("sorry this index does not exit");
                    System.out.println("exception in level 2");
                }
            }
            catch (Exception e){
                System.out.println("exception in level 1");
            }
        }
        System.out.println("thanks for using this program");
    }
}
