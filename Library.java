import java.util.ArrayList;


public class Library {


    ArrayList<Book> books;
    ArrayList<Member> members;


    public Library(){

        books = new ArrayList<>();
        members = new ArrayList<>();

    }
    public void addBook(Book book){

    books.add(book);

    System.out.println("Book added successfully");

}

    public void addMember(Member member){

        members.add(member);

        System.out.println("Member added successfully");

    }


}