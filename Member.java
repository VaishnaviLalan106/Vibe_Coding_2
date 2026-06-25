import java.util.ArrayList;
public class Member {
    int memberId;
    String memberName;
    ArrayList<Book> borrowedBooks;


    public Member(int memberId, String memberName){

        this.memberId = memberId;
        this.memberName = memberName;

        borrowedBooks = new ArrayList<>();

    }


    public void displayMember(){

        System.out.println("Member ID: " + memberId);
        System.out.println("Name: " + memberName);

        System.out.println("Borrowed Books:");

        if(borrowedBooks.isEmpty()){

            System.out.println("No books borrowed");

        }
        else{

            for(Book book : borrowedBooks){

                System.out.println(book.title);

            }

        }

    }

}

