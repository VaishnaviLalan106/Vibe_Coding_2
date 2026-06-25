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
    FileManager.saveBooks(books);

    System.out.println("Book added successfully");

}

    public void addMember(Member member){

        members.add(member);
        
        FileManager.saveMembers(members);
        System.out.println("Member added successfully");

    }
    public void displayBooks(){

    if(books.isEmpty()){

        System.out.println("No books available.");

    }
    else{

        for(Book book : books){

            book.displayBook();
            System.out.println("----------------");

        }

    }

}
public void displayMembers(){

    if(members.isEmpty()){

        System.out.println("No members available.");

    }
    else{

        for(Member member : members){

            member.displayMember();
            System.out.println("----------------");

        }

    }

}
public void issueBook(int bookId, int memberId){

    Book selectedBook = null;
    Member selectedMember = null;


    // Find book
    for(Book book : books){

        if(book.bookId == bookId){

            selectedBook = book;
            break;

        }

    }


    // Find member
    for(Member member : members){

        if(member.memberId == memberId){

            selectedMember = member;
            break;

        }

    }


    if(selectedBook == null){

        System.out.println("Book not found.");
        return;

    }


    if(selectedMember == null){

        System.out.println("Member not found.");
        return;

    }


    if(selectedBook.isIssued){

        System.out.println("Book already issued.");
        return;

    }


    selectedBook.isIssued = true;

    selectedMember.borrowedBooks.add(selectedBook);


    System.out.println("Book issued successfully.");

}
public void returnBook(int bookId, int memberId){


    Book selectedBook = null;
    Member selectedMember = null;



    // Find book

    for(Book book : books){

        if(book.bookId == bookId){

            selectedBook = book;
            break;

        }

    }



    // Find member

    for(Member member : members){

        if(member.memberId == memberId){

            selectedMember = member;
            break;

        }

    }



    if(selectedBook == null){

        System.out.println("Book not found.");
        return;

    }


    if(selectedMember == null){

        System.out.println("Member not found.");
        return;

    }



    if(!selectedBook.isIssued){

        System.out.println("This book is already available.");

        return;

    }



    selectedBook.isIssued = false;


    selectedMember.borrowedBooks.remove(selectedBook);


    System.out.println("Book returned successfully.");

}
public void searchBook(String title){


    boolean found = false;


    for(Book book : books){


        if(book.title.equalsIgnoreCase(title)){


            System.out.println("Book Found");

            book.displayBook();

            found = true;


        }

    }



    if(!found){

        System.out.println("Book not found.");

    }

}


}