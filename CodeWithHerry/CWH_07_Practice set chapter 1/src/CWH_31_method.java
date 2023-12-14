import java.util.Scanner;
public class CWH_31_method {
    static  int logic (int x, int y){
        int z;
        if (x > y) {
            z=x+y;
        }else{
            z = (x+y)*5;
        }
        x = 234; // value of a and other variables will not change in main method
        return z;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 4;
        int b = 6;
        // method invocation using object creation
//        CWH_31_method obj = new CWH_31_method();
//        int c = obj.logic(a,b);
        int c = logic(a,b);
//        if (a > b) {
//            c=a+b;
//        }else{
//            c = (a+b)*5;
//        }
        int a1 = 2;
        int b1 = 1;
        int c1 = logic(a1,b1);
        System.out.println(a + " " +b);
//        if (a1 > b1) {
//            c1=a1+b1;
//        }else{
//            c1 = (a1+b1)*5;
//        }
        System.out.println(c);
        System.out.println(c1);
    }
}
