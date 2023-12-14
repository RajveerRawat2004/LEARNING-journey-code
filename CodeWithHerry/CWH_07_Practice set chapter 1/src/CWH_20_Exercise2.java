import java.util.Random;
import java.util.Scanner;
import java.util.Random;
public class CWH_20_Exercise2 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        Random ran = new Random();
        int yourMove = sc.nextInt();
        switch (yourMove){
            case 1 -> System.out.println("rock");
            case 2 -> System.out.println("paper");
            case 3 -> System.out.println("scissor");
        }
    }
}
