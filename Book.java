public class Book {

    String title;
    String author;
    int bookId;
    boolean isIssued;


    public Book(String title, String author, int bookId){

        this.title = title;
        this.author = author;
        this.bookId = bookId;
        this.isIssued = false;

    }


    public void displayBook(){

        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);

        if(isIssued){
            System.out.println("Status: Issued");
        }
        else{
            System.out.println("Status: Available");
        }

    }

}