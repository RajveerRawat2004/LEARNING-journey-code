import java.util.Scanner;
public class CWH_29_PracticeSet_Chapter6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Question 1
//        float[] A1 = { 24.6f,45.7f,48.6f,94.5f,57.7f};
//        float sum = 0.0f;
//        for(int i=0; i<A1.length; i++){      // for each loop can use
//            sum = sum+A1[i];
//        }
//        System.out.println(sum);

        //Question 2
//        int[]A2 = {22,23,24,25,26,27,28};
//        int input = sc.nextInt();
//        boolean isAnArray = false;
//        for(int element:A2){
//            if ( element== input) {
//                isAnArray = true;
//                break;
//            }
//        }
//        if (isAnArray) {
//            System.out.println(" This integer is present in A2 array");
//        }else {
//            System.out.println("No, This integer is not present in A2 array");
//        }

//          Question 3
//        int[] physics = {22,23,24,25,26,27,28};
//        int sum = 0;
//        for(int element : physics){
//            sum = sum+element;
//        }
//        System.out.println(sum/physics.length);

        // Question 4
//        int [][] matrices1 = {{1,2,3},
//                                {4,5,6 }};
//        int [][] matrices2 = {{2,6,13},
//                                {3,7,1}};
//        int [][] result = {{0,0,0},
//                            {0,0,0}};
//        for(int i = 0 ; i<matrices1.length;i++){
//            for(int j = 0 ; j<matrices1[i].length;j++){
//                result [i][j] = matrices1 [i][j] + matrices2[i][j];
//                System.out.printf("setting value for %d and %d \n",i,j);
//            }
//        }
//         for(int i = 0 ; i<matrices1.length;i++){
//           for(int j = 0 ; j<matrices1[i].length;j++){
//               result [i][j] = matrices1 [i][j] + matrices2[i][j];
//               System.out.print(result[i][j]+" ");
//           }
//             System.out.println();
//         }

        // Question 5
//        int[]array = {22,23,24,25,26,27,28,29};
//        int l = array.length;
//        int temp;
//        int n = Math.floorDiv(l,2);
//        for(int i=0; i<n; i++){
//            // swap a[i] and a[l-i-1]
//            // a  b  temp
//            temp = array[i];
//            array[i] = array[l-i-1];
//            array[l-i-1] = temp;
//        }
//        for (int element:array) {
//            System.out.print(element+" ");
//        }

        //Question 6
//        int [] a = {22,23,24,25,26,27,28,29};
//        int max = 0;
//        for (int i=0 ; i<a.length; i++){
//            if (a[i]>max){
//                max=a[i];
//            }
//        } System.out.println(max);

        // Question 7
//        int [] a = {22,23,24,25,26,27,28,29};
//        int max = Integer.MAX_VALUE;
//        for (int i=0 ; i<a.length; i++){
//            if (a[i]<max){
//                max=a[i];
//            }
//        } System.out.println(max);

        //Question 8
        int [] a = {22,23,24,25,26,27,28,29};
        int e=0;
        for (int i=0; i<a.length-1; i++ ){
            e=i;
        }if (a[e]>a[e+1]){
            System.out.println("not sorted");
        }else if (a[e+1]>a[e]) {
            System.out.println(" sorted");
        }
    }
}