import java.util.Scanner;
public class CWH_35_PracticeSet_chapter7 {
    //Question 1
//    static void table (int n){
//        for ( int i = 1; i<=10; i++){
//            System.out.println(n*i);
//        }
//    }

    //Question 2
//    static void pattern1 (int n){
//        for ( int i = 1; i<=n; i++){
//            for (int j=1; j<=i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }

    //Question 3
    // sum = 1 + 2 + 3 +......+ n
    // sum = 1 + 2 + 3 +......+ n-1 + n
    // sum = naturalSum(n-1) + n
    // naturalSum(3) = 3 + Sum(2)
    // naturalSum(3) = 3 + 2 + Sum(1)
    // naturalSum(3) = 3 + 2 + 1
//    static int naturalSum(int n){
//        if (n==1) {
//            return 1;
//        }
//        return n + naturalSum(n-1);
//    }

    //Question 4
//    static void pattern2(int n){
//        for (int i=n;i>0;i--){
//            for(int j=i;j>0;j--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }

    //Question 5
//    static int fibonacci(int n){
//        /*if (n==1){
//            return 0;
//        }else if(n==2){
//            return 1;
//        }*/
//        if (n==1 || n==2){
//            return n-1;
//        }else {
//            return fibonacci(n-1)+fibonacci(n-2);
//        }
//    }

    //Question 6
//    static int average_of_arguments(int...arr){
//        int sum = 0;
//        for(int a:arr){
//            sum += a;
//        }
//        return sum/arr.length;
//    }

    //Question 7
//    static void pattern2_recursion (int n){
//        if (n > 0) {
//            for (int i=0; i<n; i++){
//                System.out.print("* ");
//            }
//            System.out.println();
//            pattern2_recursion(n - 1);
//        }
//    }

    //Question 8
//    static void pattern1_recursion(int n){
//        if (n > 0) {
//            pattern1_recursion(n-1);
//            for (int i=0; i<n; i++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }

    //Question 9
//    static float convertor(float n){
//        float result = (n*9.0f/5.0f)+32f;
//        return result;
//    }
    //Question 10
//    static int sum (int n){
//        int sum=0 ;
//        for (int i=1; i<=n; i++){
//            sum = sum+i;
//        }
//        return sum;
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Question 1
//        int n= sc.nextInt();
//        table(n);
        //Question 2
//        int n = sc.nextInt();
//        pattern1(n);
        //Question 3
//        int n = sc.nextInt();
//       int c =  naturalSum(n);
//        System.out.println(c);
        //Question 4
//        int n = sc.nextInt();
//        pattern2(n);
        //Question 5
//        int n = sc.nextInt();
//        int c = fibonacci(n);
//        System.out.println(c);
        //Question 6
//        System.out.println(average_of_arguments(1,2,3,4,5,6,7));
        //Question 7
//        int n = sc.nextInt();
//        pattern2_recursion(n);
        //Question 8
//        int n = sc.nextInt();
//        pattern1_recursion(n);
        //Question 9
//        float n = sc.nextFloat();
//        System.out.println(convertor(n));
        //Question 10
//        int n = sc.nextInt();
//        System.out.println(sum(n));
    }
}
