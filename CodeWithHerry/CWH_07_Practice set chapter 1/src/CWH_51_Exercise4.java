class Library{
    String [] availableBooks=new String[50];
    String [] issuedBooks;
    void addBooks(String n){
        for ( int i = 0; i<50; i++){
            if ( availableBooks[i]==null){
                this.availableBooks[i]=n;
                System.out.println(n+" is successfully added to LIBRARY\n");
                break;
            }
        }
    }
    void issueBook (String n ,String taker){
//        for (String element : availableBooks){
//            if(element==n){
//                System.out.println(n+" is successfully ISSUED from LIBRARY to "+taker+"\n");
//                element = null;
//            }
//        }                                     // Issued books are not updated in available books by for each loop
        for (int i=1; i<50; i++){
            if (availableBooks[i]==n){
                System.out.println(n+" is successfully ISSUED from LIBRARY to "+taker+"\n");
                availableBooks[i]=null;
            }
        }
    }
    void returnBook(String n){
        for ( int i = 0; i<50; i++){
            if ( availableBooks[i]==null){
                this.availableBooks[i]=n;
                System.out.println(n+" is successfully returned to LIBRARY\n");
                break;
            }
        }
    }
    void showAvailableBooks (){
        System.out.println("Available BOOKS are listed here");
        for (String element : availableBooks) {        // for indexing, we can use for loop and print i with every book
            if (element==null){
                System.out.println("NO more available books");
                break;
            }
//            for (int i=1; element!=null; i++){
//                System.out.print(i+". ");
//            }
//            int i=1;                                  // try to resolve indexing
//            if (element!=null){
//                System.out.print(i+". ");
//            }i++;
            System.out.println(element);
        }
    }
}
public class CWH_51_Exercise4 {
    public static void main(String[] args) {
        Library receptionist = new Library();
        receptionist.addBooks("LIfe of pie");
        receptionist.returnBook("food recipes");
        receptionist.issueBook("food recipes","rajveer rawat");
        receptionist.showAvailableBooks();
    }
}