import java.util.Scanner;
public class CWH_10_ResultingDataTypeAndIncrement_DecrementOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        resulting data type after arithmetic operation
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4;
        float f = 4.1f;
        double d = 4.12;
        char c = 'b';
        System.out.println(b+s); // byte+short -> int
        System.out.println(s+i); // short+int -> int
        System.out.println(l+f); // long+float -> float
        System.out.println(i+f); // int+float -> float
        System.out.println(c+i); // char+int -> int
        System.out.println(c+s); // char+short -> int
        System.out.println(l+d); // long+double -> double
        System.out.println(f+d); // float+double -> double
//        increment operator
        int a = 53;
        System.out.println(a++);
        System.out.println(a);
        a = 54;
        System.out.println(++a);
//        decrement operator
        int B = 67;
        System.out.println(B--);
        System.out.println(B);
        B = 66;
        System.out.println(--B);
//        Quick quiz
        int y = 9;
        int x = ++y*8;
        System.out.println(x);
    }
}
