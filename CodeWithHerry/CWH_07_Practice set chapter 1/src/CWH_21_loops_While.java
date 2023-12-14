import java.util.Scanner;
public class CWH_21_loops_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");

         // while loops
        int i = 1;
        while (i<=3){
            System.out.println(i);
            i++;
        }System.out.println("Finish while loop runnig");
        while (true){
            System.out.println("is I am an infinite loop?");
        }

//        // Quick Quiz
//        int j = 100;
//        while (j <= 200) {
//            System.out.println(j);
//            j++;
//        }
    }
}
