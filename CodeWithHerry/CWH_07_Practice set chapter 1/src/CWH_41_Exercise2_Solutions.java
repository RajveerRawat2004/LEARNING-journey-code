import java.util.Random;
import java.util.Scanner;
public class CWH_41_Exercise2_Solutions {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Random random = new Random();
        int ran = random.nextInt(2);
        int userChoice = sc.nextInt();
        int rock = 0; int paper =1; int scissor =2;
        if ( ran==rock && userChoice==paper || ran==paper && userChoice==scissor || ran==scissor && userChoice==rock){
            System.out.println("Congratulations ! you are WINNER");
        }
        else if(ran==userChoice){
            System.out.println("it's a ----TIE---- ! ");
        }
        else{
            System.out.println("LOSS ! Better luck next time");
        }
        switch (ran){
            case 0 -> System.out.println("computer choice is rock");
            case 1 -> System.out.println("computer choice is paper");
            case 2 -> System.out.println("computer choice is scissor");
        }
    }
}
