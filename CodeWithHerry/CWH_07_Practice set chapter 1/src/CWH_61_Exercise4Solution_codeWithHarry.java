class Library1{
    String [] books;
    int noOfBooks;
    Library1() {
       this.books = new String[100];
       this.noOfBooks = 0;
    }
    void addBooks (String book){
        this.books[noOfBooks]=book;
        noOfBooks++;
        System.out.println(book +" has been added");
    }
    void showAvailableBooks () {
        System.out.println("Available books are : ");
        for(int i = 0 ; i <100 ; i++){
            if ( books[i]==null){
                continue;
            }
            System.out.println("* " + books[i]);
        }
    }
    void issueBooks(String book){
        for(int i = 0 ; i <100 ; i++){
            if ( books[i]==book){
                System.out.println(book+" has been issued");
                books[i]= null;
                return;
            }
        }
        System.out.println(" this book does not exit");
    }
    void returnBook(String book){
        addBooks(book);
    }
}
public class CWH_61_Exercise4Solution_codeWithHarry {
    public static void main(String[] args) {
        Library1 centralLibrary = new Library1();
        centralLibrary.addBooks("think and grow rich");
        centralLibrary.addBooks("algorithms");
        centralLibrary.addBooks("c++");
        centralLibrary.showAvailableBooks();
        centralLibrary.issueBooks("c++");
        centralLibrary.showAvailableBooks();
        centralLibrary.returnBook("c++");
        centralLibrary.showAvailableBooks();
    }
}
