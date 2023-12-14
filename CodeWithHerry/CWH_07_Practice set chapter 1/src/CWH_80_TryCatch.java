public class CWH_80_TryCatch {
    public static void main(String[] args) {
        int a = 3;
        int b = 0;
        // without try
//        int c = a/b;
//        System.out.println("THE result is "+c);

        // with try
        try {
            int c = a/b;
            System.out.println("THE result is "+c);
        }catch (Exception e){
            System.out.println(" we failed to divide , reason : ");
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}
