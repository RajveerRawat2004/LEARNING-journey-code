import java.util.Scanner;
public class CWH_18_ElseIf_Switch_break {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // else if statement "or" if-else-if-else ladder
//        int age =  sc.nextInt();
//        if (age > 56) {
//            System.out.println("You are experienced");
//        }else if (age>46){
//            System.out.println("You are semi experienced");
//        }else if (age > 36) {
//            System.out.println("You are semi-semi experienced");
//        }else {
//            System.out.println("You are not experienced");
//        }
//        if (age > 2) {
//            System.out.println("You are not a baby");
//        }

        // Switch case
        String name = sc.nextLine();
        switch (name){
            case "rajveer":
                System.out.println("it's you");break;
            case "raja":
                System.out.println("he is your big brother");break;
            case "Lokendra & Mahadevi":
                System.out.println("they are your parents");break;
            default:
                System.out.println("Not from your family");
        }
    }
}