import java.util.Scanner;
public class CWH_23_ForLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // for loop
//        for (int i=1;i<=10;i++){
//            System.out.println(i);
//        }

        // Quick Quiz

        // 2n = Even Numbers = 0, 2, 4, 6,
        // 2n+1 = Odd Numbers = 1, 3, 5, 7,

        // Code for odd numbers less than 'N'
//        int N = 20;
//        for (int i=0;2*i+1<N;i++){
//            System.out.println(2*i+1);
//        }
//        // Code for 'N' odd numbers
//        for (int i=0;i<N;i++){
//            System.out.println(2*i+1);
//        }
        // Decrement for loop
//        for ( int i =5 ; i >= 0 ; i--){
//            System.out.println(i);
//        }
        //Quick Quiz
        int n = 10;
        for (int i=n;i>0;i--){
            System.out.println(i);
        }
    }
}
