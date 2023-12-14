import java.util.Scanner;
public class CWH_85_Finally {
    public static int greet(){
        try {
            int a = 5;
            int b = 2;
            int c = a/b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
//            System.out.println("program has ended !");
            System.out.println(" cleaning up the resources... this is the end of this program");
        }
        return -1;
    }
    public static void finallyQuizByMe (int a){
        for (int i=5; i>-4; i--){
            try {
                double c =a/i;
                System.out.println(c);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.printf(" you divide %d by %d \n",a,i);
            }
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int k = greet();
//        System.out.println(k);
//        finallyQuizByMe(10);

        // Finally Quiz Task By Harry
//        int a =7;
//        int b =9;
//        while (true){
//            try {
//                System.out.println(a/b);
//            }
//            catch (Exception e){
//                System.out.println(e);
//                break;
//            }
//            finally {
//                System.out.println("i am finally");
//            }
//            b--;
//        }

        // try syntax Example with finally
        try {
            System.out.println(5/0);
        }
        finally {
            System.out.println("Yes this is finally");
        }
    }
}
