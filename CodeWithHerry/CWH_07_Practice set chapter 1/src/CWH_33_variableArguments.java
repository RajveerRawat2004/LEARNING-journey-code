import java.util.Scanner;
public class CWH_33_variableArguments {
//    static int sum(int a, int b){
//        return a+b;
//    }
//    static int sum(int a, int b,int c){
//        return a+b+c;
//    }
//    static int sum(int a, int b,int c,int d){
//        return a+b+c+d;
//    }
    static int sum(int x, int ...arr){
        // available as int [] arr
        int result = x;
        for(int a:arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
//        System.out.println("sum of a and b is : "+sum());
        System.out.println("sum of a and b is : "+sum(3));
        System.out.println("sum of a and b is : "+sum(4,5));
        System.out.println("sum of a ,b and c is : "+sum(4,5,6));
        System.out.println("sum of a,b,c and d is : "+sum(4,5,6,7));
        System.out.println("sum of a,b,c and d is : "+sum(4,5,6,7,8));
    }
}
