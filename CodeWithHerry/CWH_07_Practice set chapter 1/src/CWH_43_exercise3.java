import java.util.Scanner;
import java.util.Random;
class Game {
    int number;
    public int inputNumber;
    public int noOfGuesses ;
    Scanner sc = new Scanner (System.in) ;
//    public void setNoOfGuesses(int noOfGuesses) {
//        this.noOfGuesses = noOfGuesses;
//    }
//    public int getNoOfGuesses() {
//        return noOfGuesses;
//    }
    Game (){
        Random ran = new Random();
        number = ran.nextInt(100);
    }
    void takeUserInput (){
        System.out.println("guess the number");
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses ++;
        if (inputNumber == number ){
            System.out.printf("your Guess Number is correct you guess it in %d attempts\n",noOfGuesses);
            return true ;
        } else if (inputNumber < number ){
            System.out.println("your Guess Number is SMALLER");
            return false ;
        }else if ( inputNumber > number ){
            System.out.println("your Guess Number is GREATER");
            return false ;
        }else{
            System.out.println("your Guess Number is INVALID");
            return false;
        }
    }
}
public class CWH_43_exercise3{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        Game g = new Game();
        boolean b=false;
        while (!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
            System.out.println( b );
        }
    }
}
