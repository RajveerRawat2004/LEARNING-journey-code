import java.util.Scanner;
public class CWH_26_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // There are three main ways to create an array in java
//        1. Declaration and then memory allocation
//        int [] marks;
//        marks = new int [5];

//        2. Declaration + memory allocation
//        int [] marks = new int [5];
//        marks [0] = 45;
//        marks [1] = 56;
//        marks [2] = 96;
//        marks [3] = 89;
//        marks [4] = 78;
//        // marks [5] = 95;  -> throws an error
//        System.out.println(marks[2]);
//        3. Declaration, memory allocation and initialization together
        int [] marks = {92, 55, 66, 59, 59};
        System.out.println(marks[4]);
    }
}
