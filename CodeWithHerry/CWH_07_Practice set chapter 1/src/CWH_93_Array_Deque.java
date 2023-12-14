import java.util.ArrayDeque;
import java.util.Scanner;

public class CWH_93_Array_Deque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // forget about indexing
        // we have to provide only insertion side left or right
        // indexing is taking care by ArrayDeque
        // default initial capacity in ArrayDeque is 16 we can change it

        ArrayDeque<Integer> listAD = new ArrayDeque<>(25);

        listAD.add(45);
        listAD.addFirst(111111);
        listAD.addLast(99999);
        listAD.offerFirst(3221654);
        // offer equal to add // remove equal to poll // getFirst equal to peek //
        System.out.println(listAD.getFirst());
        System.out.println(listAD.getLast());
//        System.out.println(listAD.getClass());  // get class name only
    }
}